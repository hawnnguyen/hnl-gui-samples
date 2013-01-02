/**
 * 
 */
package com.hnl.sample.gui;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/**
 * @author hawnnguyen
 *
 */
@ManagedBean(name="language") 
@SessionScoped
public class LanguageBean {

	private String locale = "en_US";
	private static Map<String,String> locales;
	
	
	static{
		locales = new LinkedHashMap<String,String>();
		locales.put("United Kingdom", "en_US"); //label, value
		locales.put("French", "fr_FR");
		locales.put("German", "de_DE");
		locales.put("China", "zh_TW");
		locales.put("Arabic", "ar_AR");
		locales.put("Spanish", "es_ES");
	}

	/**
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}
	/**
	 * @param locale the locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}
	/**
	 * @return the locales
	 */
	public Map<String, String> getLocales() {
		return locales;
	}
	/**
	 * @param locales the locales to set
	 */
	public void setLocales(Map<String, String> locales) {
		LanguageBean.locales = locales;
	}
	
	/**/
	public void changeLocale(ValueChangeEvent event){
		setLocale((String)event.getNewValue().toString());
	}
}
