
package com.ebay.services.productmetadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Container for data type-specific constraints for property values.
 * 					
 * 
 * <p>Java class for TypeSpecificInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeSpecificInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uriTypeSpecificInformation" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}URITypeSpecificInformation" minOccurs="0"/>
 *         &lt;element name="numericTypeSpecificInformation" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}NumericTypeSpecificInformation" minOccurs="0"/>
 *         &lt;element name="mediaTypeSpecificInformation" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}MediaTypeSpecificInformation" minOccurs="0"/>
 *         &lt;element name="stringTypeSpecificInformation" type="{http://www.ebay.com/marketplace/marketplacecatalog/v1/services}StringTypeSpecificInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeSpecificInformation", propOrder = {
    "uriTypeSpecificInformation",
    "numericTypeSpecificInformation",
    "mediaTypeSpecificInformation",
    "stringTypeSpecificInformation"
})
public class TypeSpecificInformation
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected URITypeSpecificInformation uriTypeSpecificInformation;
    protected NumericTypeSpecificInformation numericTypeSpecificInformation;
    protected MediaTypeSpecificInformation mediaTypeSpecificInformation;
    protected StringTypeSpecificInformation stringTypeSpecificInformation;

    /**
     * Gets the value of the uriTypeSpecificInformation property.
     * 
     * @return
     *     possible object is
     *     {@link URITypeSpecificInformation }
     *     
     */
    public URITypeSpecificInformation getUriTypeSpecificInformation() {
        return uriTypeSpecificInformation;
    }

    /**
     * Sets the value of the uriTypeSpecificInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link URITypeSpecificInformation }
     *     
     */
    public void setUriTypeSpecificInformation(URITypeSpecificInformation value) {
        this.uriTypeSpecificInformation = value;
    }

    /**
     * Gets the value of the numericTypeSpecificInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NumericTypeSpecificInformation }
     *     
     */
    public NumericTypeSpecificInformation getNumericTypeSpecificInformation() {
        return numericTypeSpecificInformation;
    }

    /**
     * Sets the value of the numericTypeSpecificInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericTypeSpecificInformation }
     *     
     */
    public void setNumericTypeSpecificInformation(NumericTypeSpecificInformation value) {
        this.numericTypeSpecificInformation = value;
    }

    /**
     * Gets the value of the mediaTypeSpecificInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTypeSpecificInformation }
     *     
     */
    public MediaTypeSpecificInformation getMediaTypeSpecificInformation() {
        return mediaTypeSpecificInformation;
    }

    /**
     * Sets the value of the mediaTypeSpecificInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTypeSpecificInformation }
     *     
     */
    public void setMediaTypeSpecificInformation(MediaTypeSpecificInformation value) {
        this.mediaTypeSpecificInformation = value;
    }

    /**
     * Gets the value of the stringTypeSpecificInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StringTypeSpecificInformation }
     *     
     */
    public StringTypeSpecificInformation getStringTypeSpecificInformation() {
        return stringTypeSpecificInformation;
    }

    /**
     * Sets the value of the stringTypeSpecificInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringTypeSpecificInformation }
     *     
     */
    public void setStringTypeSpecificInformation(StringTypeSpecificInformation value) {
        this.stringTypeSpecificInformation = value;
    }

}
