//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.25 at 03:28:03 AM PST 
//


package com.checkmarx.sdk.dto.sca.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicensesLegalRiskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicensesLegalRiskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Unknown" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicensesLegalRiskType", propOrder = {
    "high",
    "medium",
    "low",
    "unknown"
})
public class LicensesLegalRiskType {

    @XmlElement(name = "High")
    protected byte high;
    @XmlElement(name = "Medium")
    protected byte medium;
    @XmlElement(name = "Low")
    protected short low;
    @XmlElement(name = "Unknown")
    protected byte unknown;

    /**
     * Gets the value of the high property.
     * 
     */
    public byte getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     */
    public void setHigh(byte value) {
        this.high = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     */
    public byte getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     */
    public void setMedium(byte value) {
        this.medium = value;
    }

    /**
     * Gets the value of the low property.
     * 
     */
    public short getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     */
    public void setLow(short value) {
        this.low = value;
    }

    /**
     * Gets the value of the unknown property.
     * 
     */
    public byte getUnknown() {
        return unknown;
    }

    /**
     * Sets the value of the unknown property.
     * 
     */
    public void setUnknown(byte value) {
        this.unknown = value;
    }

}
