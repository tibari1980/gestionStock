package com.arcesi.gestionStock.jdd;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.arcesi.gestionStock.entities.AdresseBean;
import com.arcesi.gestionStock.entities.ArticleBean;
import com.arcesi.gestionStock.entities.CategoryBean;
import com.arcesi.gestionStock.entities.ClientBean;
import com.arcesi.gestionStock.entities.CommandeClientBean;
import com.arcesi.gestionStock.entities.CommandeFournisseurBean;
import com.arcesi.gestionStock.entities.EntrepriseBean;
import com.arcesi.gestionStock.entities.FournisseurBean;
import com.arcesi.gestionStock.entities.LigneCommandeClientBean;
import com.arcesi.gestionStock.entities.LigneCommandeFournisseurBean;
import com.arcesi.gestionStock.entities.LigneVenteBean;
import com.arcesi.gestionStock.entities.RoleBean;
import com.arcesi.gestionStock.entities.UtilisateurBean;
import com.arcesi.gestionStock.entities.VenteBean;
import com.arcesi.gestionStock.enums.TypeAdresseEnum;
import com.arcesi.gestionStock.enums.TypeRoleEnum;
import com.arcesi.gestionStock.repositories.ArticleRepository;
import com.arcesi.gestionStock.repositories.CategoryRepository;
import com.arcesi.gestionStock.repositories.ClientRepository;
import com.arcesi.gestionStock.repositories.CommandeClientRepository;
import com.arcesi.gestionStock.repositories.CommandeFournisseurRepository;
import com.arcesi.gestionStock.repositories.EntrepriseRepository;
import com.arcesi.gestionStock.repositories.FournisseurRepository;
import com.arcesi.gestionStock.repositories.LigneCommandeClientRepository;
import com.arcesi.gestionStock.repositories.LigneCommandeFournisseurRepository;
import com.arcesi.gestionStock.repositories.LigneVenteRepository;
import com.arcesi.gestionStock.repositories.RoleRepository;
import com.arcesi.gestionStock.repositories.UtilisateurRepository;
import com.arcesi.gestionStock.repositories.VenteRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@AllArgsConstructor
public class JeuDeDonne implements CommandLineRunner {

	private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";

    private static final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
    private static SecureRandom random = new SecureRandom();
	@Autowired
    CategoryRepository categoryRepository;
    
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	EntrepriseRepository entrepriseRepository;
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
    CommandeClientRepository commandeClientRepository;
	@Autowired
	FournisseurRepository fournisseurRepository;
	@Autowired
	CommandeFournisseurRepository commandeFournisseurRepository;
	@Autowired
	LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository;
	@Autowired
	LigneCommandeClientRepository ligneCommandeClientRepository;
	@Autowired
	VenteRepository venteRepository;
	@Autowired
	UtilisateurRepository utilisateurRepository;
	@Autowired
	LigneVenteRepository ligneVenteRepository;
	@Autowired
	RoleRepository roleRepository;


	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		//insertion catégorie;
		for (int i = 0; i < 50; i++) {
			CategoryBean bean = CategoryBean.builder().codeCategorie(UUID.randomUUID().toString().replace("-", ""))
					.createdDate(Instant.now()).lastUpdateDate(Instant.now()).designation(generateRandomString(10))
					.idEntreprise(genererInt(1, 10)).build();

			// persite la catégorie
			categoryRepository.save(bean);
		}
		
		//=========================insertion Client==============================*/
		for(int i=1;i<300;i++) {
			ClientBean client=ClientBean.builder()
					.codeClient(UUID.randomUUID().toString().replace("-", ""))
					.nom("nom"+i)
					.prenom("prenom"+i)
					.dateNaissance(LocalDate.of(genererInt(1965, 2020), genererInt(1, 12),genererInt(1, 28)))
					.adresse(new AdresseBean( 10+i+" avenue DUROC",  45+i+"rue de JAVEL","PARIS", "750"+i, "FRANCE",TypeAdresseEnum.BILLING.name().toString()))
					.createdDate(Instant.now())
					.lastUpdateDate(null)
					.email("nometprenom"+i+"@gmail.com")
					.telephone("062549164"+i)
					.photo("photo.jpeg")
					
					.build();
			    //Calculer l'age du client
			    client.setAge(Period.between(client.getDateNaissance(), LocalDate.now()).getYears());
			    //si l'age inférieur à 10
			    if(client.getAge()<12) {
			    	client.setAge(client.getAge()+18);
			    }else if(client.getAge()<7) {
			    	client.setAge(client.getAge()+28);
			    }
			    clientRepository.save(client);
			
		}
		//================================fin insertion client======================*/
		//insert les entreprises
		
		for(int i=0;i<10;i++) {
			EntrepriseBean entreprise=EntrepriseBean.builder()
					.codeEntreprise(UUID.randomUUID().toString().replace("-", ""))
					.createdDate(Instant.now())
					.lastUpdateDate(null)
					.raisonSocial("SOCIETE"+i)
					.siret("XTERTTEZE"+i)
					.adresseBean(new AdresseBean( 10+i+"avenue parmentier",  45+i+"rue de javel","Paris", "750"+i, "FRANCE",TypeAdresseEnum.SHIPPING.name().toString()))
                    .email("societe"+i+"@gmail.com")
                    .telephone("014514578"+i)
                    .build();
			entrepriseRepository.save(entreprise);
		}
		
		//-----------------------------Insertion des articles--------------------------*/
		for(int i=0;i<1800;i++) {
			CategoryBean cat=categoryRepository.findById(new Long(genererInt(4, 49))).get();
			ArticleBean article=ArticleBean.builder()
					.codeArticle(UUID.randomUUID().toString().replace("-", ""))
					.designation("ARTICLE "+i)
					.createdDate(Instant.now())
					.lastUpdateDate(null)
					.categoryBean(cat)
					.idEntreprise(genererInt(1, 10))
					.photoArticle("article"+i+".jpeg")
					.tauxTva(new BigDecimal(genererInt(2, 20)))
					 .prixUnitaireHt(new BigDecimal(genererInt(90, 500)))
					.build();
			final double  prixTTC=prixAvecTva(article.getPrixUnitaireHt().doubleValue(), article.getTauxTva().doubleValue());
			article.setPrixTTC(BigDecimal.valueOf(prixTTC));
			articleRepository.save(article);
		}
		//===================================Fin insertion des articles==========--------*/
	    //==================================insertion commande client=======================*/
		 for(int i=0;i<50;i++) {
			 ClientBean clientCommande=clientRepository.findById(new Long(genererInt(2, 300))).get();
			 CommandeClientBean commandeClientBean=CommandeClientBean.builder()
					 .codeCommandeClient(UUID.randomUUID().toString().replace("-", ""))
					 .createdDate(Instant.now())
					 .dateCommande(Instant.now())
					 .idEntreprise(genererInt(1, 10))
					 .clientBean(clientCommande)
					 .build();
			 commandeClientRepository.save(commandeClientBean);
		 }
		//==========================================fin insertion commande client==========*/
	    //============================================insertion fournisseur================*/
		 for(int i=1;i<100;i++) {
				FournisseurBean fournisseur=FournisseurBean.builder()
						.codeFournisseur(UUID.randomUUID().toString().replace("-", ""))
						.nom("nomFournisseur"+i)
						.prenom("prenomFournisseur"+i)
						.dateNaissance(LocalDate.of(genererInt(1965, 2020), genererInt(1, 12),genererInt(1, 28)))
						.adresse(new AdresseBean( 10+ i+"  rue Jena louis ",  45+i+" rue de peguy","MARSEILLE", "130"+i, "FRANCE",TypeAdresseEnum.SHIPPING.name().toString()))
						.createdDate(Instant.now())
						.lastUpdateDate(null)
						.email("nometprenom"+i+"@gmail.com")
						.telephone("062549164"+i)
						.photo("photo.jpeg")
						.idEntreprise(genererInt(1, 10))
						.build();
				    //Calculer l'age du client
				    fournisseur.setAge(Period.between(fournisseur.getDateNaissance(), LocalDate.now()).getYears());
				    //si l'age inférieur à 10
				    if(fournisseur.getAge()<12) {
				    	fournisseur.setAge(fournisseur.getAge()+18);
				    }else if(fournisseur.getAge()<7) {
				    	fournisseur.setAge(fournisseur.getAge()+28);
				    }
				    fournisseurRepository.save(fournisseur);
				
			}
		 //===================================fin insertion fournisseur====================*/
	    //=====================================Commande fournisseur=====================*/
		 for(int i=0;i<50;i++) {
			 FournisseurBean fournisseur=fournisseurRepository.findById(new Long(genererInt(2, 100))).get();
			 CommandeFournisseurBean commandeFournisseurBean=CommandeFournisseurBean.builder()
					 .codeCommandeFounisseur(UUID.randomUUID().toString().replace("-", ""))
					 .createdDate(Instant.now())
					 .dateCommande(Instant.now())
					 .idEntreprise(genererInt(1, 10))
					 .fournisseurBean(fournisseur)
					 .build();
			 commandeFournisseurRepository.save(commandeFournisseurBean);
		 }
		 //==================================fin insertion commande fournisseur========*/
	     //*************************** insertion ligne commande fournisseur*************/
		 for(int i=0;i<150;i++) {
			 CommandeFournisseurBean comFourBean=commandeFournisseurRepository.findById(new Long(genererInt(1, 50))).get();
			 ArticleBean article=articleRepository.findById(new Long(genererInt(1, 1800))).get();
			 EntrepriseBean ent=entrepriseRepository.findById(new Long(genererInt(2, 10))).get();
			 LigneCommandeFournisseurBean lcfBean=LigneCommandeFournisseurBean.builder()
					 .codeLigneCommandeFournisseur(UUID.randomUUID().toString().replace("-", ""))
					 .createdDate(Instant.now())
					 .lastUpdateDate(null)
					 .prixUnitaire(new BigDecimal(genererInt(300, 2600)))
					 .quantite(new BigDecimal(genererInt(20, 100)))
					 .idEntreprise(genererInt(1, 10))
					 .articleBean(article)
					 .commandeFournisseurBean(comFourBean)
					 .build();
			 ligneCommandeFournisseurRepository.save(lcfBean);
		 }
		 //*******************************fin insertion ligne commande fournissateur
		 //*************************** insertion ligne commande client*************/
		 for(int i=0;i<150;i++) {
			 CommandeClientBean comClientBean=commandeClientRepository.findById(new Long(genererInt(1, 50))).get();
			 ArticleBean article=articleRepository.findById(new Long(genererInt(1, 1800))).get();
			 
			 LigneCommandeClientBean lcCBean=LigneCommandeClientBean.builder()
					 .codeLigneCommandClient(UUID.randomUUID().toString().replace("-", ""))
					 .createdDate(Instant.now())
					 .lastUpdateDate(null)
					 .prixUnitaire(new BigDecimal(genererInt(300, 2600)))
					 .quantite(new BigDecimal(genererInt(20, 100)))
					 .idEntreprise(genererInt(1, 10))
					 .articleBean(article)
					 .commandeClientBean(comClientBean)
					 .build();
			 ligneCommandeClientRepository.save(lcCBean);
		 }
		 //*******************************fin insertion ligne commande client
	
		 //=====================================insertion vente======================*/
		 for(int i=0;i<350;i++) {
			 VenteBean vente=VenteBean.builder()
					 .codeVente(UUID.randomUUID().toString().replace("-", ""))
					 .createdDate(Instant.now())
					 .lastUpdateDate(null)
					 .idEntreprise(genererInt(1, 10))
					 .commentaire(generateRandomString(240))
					 .dateVente(Instant.now())
					 .build();
			 venteRepository.save(vente);
		 }
		 //*****************************************fin insertion vente==============*/
	     //**=====================================insertion ligne vente=================/
		 for(int i=0;i<120;i++) {
			 VenteBean vente=venteRepository.findById(new Long(genererInt(1, 350))).get();
			 LigneVenteBean ligneVenteBean=LigneVenteBean.builder()
					 .createdDate(Instant.now())
					 .lastUpdateDate(null)
					 .idEntreprise(genererInt(1, 10))
					 .codeLigneVente(UUID.randomUUID().toString().replace("-", ""))
					 .quantite(new BigDecimal(genererInt(30, 80)))
					 .venteBean(vente)
					 .build();
			 ligneVenteRepository.save(ligneVenteBean);
		 }
		 //**************************************fin insertion ligne vente===================/
		/* for(int i=0;i<4;i++) {
			 UtilisateurBean utilisateur=utilisateurRepository.findById(new Long(genererInt(1,100 ))).get();
			 
			 RoleBean role=RoleBean.builder()
					 .createdDate(Instant.now())
					 .codeRole(UUID.randomUUID().toString().replace("-", ""))
					 .lastUpdateDate(null)
					 .utilisateurBeans(null)
					 .build();
			 if(i%2==0) {
				 role.setLibelle(TypeRoleEnum.CLIENT.getId());
			 }else {
				 role.setLibelle(TypeRoleEnum.ADMIN.getId());
			 }
			 roleRepository.save(role);
		 }*/
		 RoleBean admin=RoleBean.builder().createdDate(Instant.now())
				   .lastUpdateDate(null)
				   .codeRole(UUID.randomUUID().toString().replace("-", ""))
				   .libelle(TypeRoleEnum.ADMIN.getId())
				   .build();
		 roleRepository.save(admin);
		 RoleBean manager=RoleBean.builder().createdDate(Instant.now())
				   .lastUpdateDate(null)
				   .codeRole(UUID.randomUUID().toString().replace("-", ""))
				   .libelle(TypeRoleEnum.MANAGER.getId())
				   .build();
		 roleRepository.save(manager);
		 RoleBean client=RoleBean.builder().createdDate(Instant.now())
				   .lastUpdateDate(null)
				   .codeRole(UUID.randomUUID().toString().replace("-", ""))
				   .libelle(TypeRoleEnum.CLIENT.getId())
				   .build();
		 roleRepository.save(client);
		 //============================================insertion utilisateur================*/
		 for(int i=1;i<100;i++) {
			    EntrepriseBean entre=entrepriseRepository.findById(new Long(genererInt(1, 10))).get();
		    	List<RoleBean> rolesBeans=new ArrayList<RoleBean>();
		    	for(int j=1;j<3;j++) {
		    		RoleBean role=roleRepository.findById(new Long(genererInt(1, 3))).get();
		    		rolesBeans.add(role);
		    	}
			    	
			    UtilisateurBean utilisateur=UtilisateurBean.builder()
						.codeUtilisateur(UUID.randomUUID().toString().replace("-", ""))
						.nom("nomUtilisateur"+i)
						.prenom("prenomUtilisateur"+i)
						.dateNaissance(LocalDate.of(genererInt(1965, 2020), genererInt(1, 12),genererInt(1, 28)))
						.adresse(new AdresseBean( 10+ i+"  rue LOUIS  ARAGON ",  45+i+" rue dE MADAME","LYON", "130"+i, "FRANCE",null))
						.email("utilisateur"+i+"@gmail.com")
						.entrepriseBean(entre)
						.createdDate(Instant.now())
						.lastUpdateDate(null)
						.roleBeans(rolesBeans)
						.password(generateRandomString(34))
						.telephone("062549164"+i)
						.photo("photo.jpeg")
						
						.build();
				    //Calculer l'age du client
				    utilisateur.setAge(Period.between(utilisateur.getDateNaissance(), LocalDate.now()).getYears());
				    //si l'age inférieur à 10
				    if(utilisateur.getAge()<12) {
				    	utilisateur.setAge(utilisateur.getAge()+18);
				    }else if(utilisateur.getAge()<7) {
				    	utilisateur.setAge(utilisateur.getAge()+28);
				    }
				   
				      // utilisateur.getRoleBeans().add(role);
				       //role.getUtilisateurBeans().add(utilisateur);
				    
				    
				    utilisateurRepository.save(utilisateur);
				
			}
		 //===================================fin insertion fournisseur====================*/
	}
	
	
	/**
	 * 
	 * @param borneInf nombre inférieur 
	 * @param borneSup nombre supérieur
	 * @return
	 */
	static int genererInt(int borneInf, int borneSup){
		   Random random = new Random();
		   int nb;
		   nb = borneInf+random.nextInt(borneSup-borneInf);
		   return nb;
		}
	
 	      public static double prixAvecTva(double prixHt, double tva){
		      return   prixHt + (prixHt *( tva / 100));
      	  }

 	     public static String generateRandomString(int length) {
 	        if (length < 1) throw new IllegalArgumentException();

 	        StringBuilder sb = new StringBuilder(length);
 	        for (int i = 0; i < length; i++) {

 				// 0-62 (exclusive), random returns 0-61
 	            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
 	            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

 	            sb.append(rndChar);

 	        }

 	        return sb.toString();

 	    }
}
