/**
 * 
 */
package com.hnl.sample.gui;

import java.util.Locale;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

import org.apache.log4j.Logger;


/**
 * @author hawnnguyen
 *
 */
public class LanguageChangeListener implements ValueChangeListener {
	
	private Logger logger = Logger.getLogger(this.getClass());

	/* (non-Javadoc)
	 * @see javax.faces.event.ValueChangeListener#processValueChange(javax.faces.event.ValueChangeEvent)
	 */
	public void processValueChange(ValueChangeEvent event)
			throws AbortProcessingException {
		if(logger.isDebugEnabled()){
			logger.debug("***Inside LanguageChangeListener event: " + event);
		}
		LanguageBean language = (LanguageBean) FacesContext.getCurrentInstance().
				getExternalContext().getSessionMap().get("language");
		
		if(logger.isDebugEnabled()){
			logger.debug("***Inside LanguageChangeListener event value:" + event.getNewValue().toString());
		}
		
		String locale = event.getNewValue().toString();
		language.setLocale(locale);
		String sLanguage = locale.substring(0, locale.indexOf("_"));
		String sCountry = locale.substring((locale.indexOf("_")+1));
		
		if(logger.isDebugEnabled()){
			logger.debug("*** sLanguage=" + sLanguage + " sCountry= " + sCountry);
		}
		
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(sLanguage, sCountry));
		FacesContext.getCurrentInstance().renderResponse(); 

	}

}
