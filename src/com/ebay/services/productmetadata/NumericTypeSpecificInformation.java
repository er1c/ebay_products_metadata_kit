
package com.ebay.services.productmetadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 						Container for any numeric type constraint information. 
 * 					
 * 
 * <p>Java class for NumericTypeSpecificInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumericTypeSpecificInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitOfMeasurement" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="maximumValueAllowed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericTypeSpecificInformation", propOrder = {
    "unitOfMeasurement",
    "maximumValueAllowed"
})
public class NumericTypeSpecificInformation
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unitOfMeasurement;
    protected long maximumValueAllowed;

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasurement(String value) {
        this.unitOfMeasurement = value;
    }

    /**
     * Gets the value of the maximumValueAllowed property.
     * 
     */
    public long getMaximumValueAllowed() {
        return maximumValueAllowed;
    }

    /**
     * Sets the value of the maximumValueAllowed property.
     * 
     */
    public void setMaximumValueAllowed(long value) {
        this.maximumValueAllowed = value;
    }

}
