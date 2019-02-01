//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 12:27:14 AM PDT 
//

package com.crawljax.core.plugin.descriptor.jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for option-list complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="option-list"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="option" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "option-list", propOrder = { "option" })
public class OptionList {

	@XmlElement(required = true)
	protected List<OptionList.Option> option;

	/**
	 * Gets the value of the option property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the option property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 * getOption().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link OptionList.Option }
	 */
	public List<OptionList.Option> getOption() {
		if (option == null) {
			option = new ArrayList<>();
		}
		return this.option;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;sequence&gt;
	 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *       &lt;/sequence&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "name", "value" })
	public static class Option {

		@XmlElement(required = true)
		protected String name;
		@XmlElement(required = true)
		protected String value;

		/**
		 * Gets the value of the name property.
		 *
		 * @return possible object is {@link String }
		 */
		public String getName() {
			return name;
		}

		/**
		 * Sets the value of the name property.
		 *
		 * @param value allowed object is {@link String }
		 */
		public void setName(String value) {
			this.name = value;
		}

		/**
		 * Gets the value of the value property.
		 *
		 * @return possible object is {@link String }
		 */
		public String getValue() {
			return value;
		}

		/**
		 * Sets the value of the value property.
		 *
		 * @param value allowed object is {@link String }
		 */
		public void setValue(String value) {
			this.value = value;
		}

	}

}
