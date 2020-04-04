
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addSeason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addSeason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="season" type="{http://services/}season" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSeason", propOrder = {
    "season"
})
public class AddSeason {

    protected Season season;

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link Season }
     *     
     */
    public Season getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link Season }
     *     
     */
    public void setSeason(Season value) {
        this.season = value;
    }

}
