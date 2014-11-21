
package com.ebay.services.productmetadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatasetValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatasetValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Searchable"/>
 *     &lt;enumeration value="Sortable"/>
 *     &lt;enumeration value="DisplayableSmall"/>
 *     &lt;enumeration value="DisplayableMedium"/>
 *     &lt;enumeration value="DisplayableLarge"/>
 *     &lt;enumeration value="DisplayableAll"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DatasetValue")
@XmlEnum
public enum DatasetValue {


    /**
     * 
     * 								Indicates ....
     * 							
     * 
     */
    @XmlEnumValue("Searchable")
    SEARCHABLE("Searchable"),

    /**
     * 
     * 								Indicates ....
     * 							
     * 
     */
    @XmlEnumValue("Sortable")
    SORTABLE("Sortable"),

    /**
     * 
     * 								Indicates ....
     * 							
     * 
     */
    @XmlEnumValue("DisplayableSmall")
    DISPLAYABLE_SMALL("DisplayableSmall"),

    /**
     * 
     * 								Indicates ....
     * 							
     * 
     */
    @XmlEnumValue("DisplayableMedium")
    DISPLAYABLE_MEDIUM("DisplayableMedium"),

    /**
     * 
     * 								Indicates ....
     * 							
     * 
     */
    @XmlEnumValue("DisplayableLarge")
    DISPLAYABLE_LARGE("DisplayableLarge"),

    /**
     * 
     * 								Indicates ....
     * 							
     * 
     */
    @XmlEnumValue("DisplayableAll")
    DISPLAYABLE_ALL("DisplayableAll");
    private final String value;

    DatasetValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatasetValue fromValue(String v) {
        for (DatasetValue c: DatasetValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
