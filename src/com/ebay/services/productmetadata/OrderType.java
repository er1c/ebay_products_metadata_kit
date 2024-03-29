
package com.ebay.services.productmetadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ascending"/>
 *     &lt;enumeration value="Descending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderType")
@XmlEnum
public enum OrderType {


    /**
     * 
     * 								Sorts results in ascending (low to high) order.
     * 							
     * 
     */
    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),

    /**
     * 
     * 								Sorts results in descending (high to low) order.
     * 							
     * 
     */
    @XmlEnumValue("Descending")
    DESCENDING("Descending");
    private final String value;

    OrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderType fromValue(String v) {
        for (OrderType c: OrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
