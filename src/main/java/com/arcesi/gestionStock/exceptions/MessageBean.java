package com.arcesi.gestionStock.exceptions;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import lombok.Data;
@Data
public class MessageBean implements Serializable{


	private static final long serialVersionUID = 1L;

	/** Liste des paramétres **/
	private final List<String> parameters=new LinkedList<String>();
	/** Bundle  **/
	private final String bundle;
    /** Cle du message  **/
	private final String idMessage;
	/** nom du type de message  **/
	private final String nomTypeMessage;
	/**
	 * Constructeur avec un identifiant
	 * @param p_id
	 */
	public MessageBean(final String p_id) {
		this(p_id,(String)null);
	}
	/**
	 * Constructeur avec un identifiant et un bundle
	 * @param p_id clé du message
	 * @param p_bundle bundle du message
	 */
	public MessageBean(final String p_id,final String p_bundle) {
		this(p_id,"MessageBean",p_bundle);
	}
	/**
	 * Constructeur avec un cle et un paramètre
	 * @param p_id
	 * @param p_param
	 */
	public MessageBean( final String p_id,final Object p_param) {
		this(p_id,p_param,null);
	}
	
	public MessageBean(final String p_id,final Object p_param,final String p_bundle) {
		this(p_id,p_bundle);
		addParameter(p_param);
	}
	public  void addParameter(final Object p_param) {
		 
		if(null!=p_param) {
			parameters.add((String) p_param);
		}
		
	}
	public MessageBean(final String p_id,final Object[] p_listeParam) {
		this(p_id,p_listeParam,null);
	}
	/**
	 * constructeur avec un cle et liste des paramétres et bundle
	 * @param p_id
	 * @param p_listParam
	 * @param p_bundle
	 */
	public MessageBean(final String p_id,final Object[] p_listParam,final String p_bundle) {
		this(p_id,p_bundle);
		for(Object element:p_listParam) {
			addParameter(element);
		}
	}
	/**
	 * Constructeur avec un identifiant et nomType et Bundle
	 * @param p_id
	 * @param p_nomType
	 * @param p_bundle
	 */
	protected  MessageBean(final String p_id,final String p_nomType,final String p_bundle) {
		this.idMessage=p_id;
		this.nomTypeMessage=p_nomType;
		this.bundle=p_bundle;
	}
}
