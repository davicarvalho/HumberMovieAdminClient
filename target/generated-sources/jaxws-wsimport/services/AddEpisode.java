
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addEpisode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addEpisode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="episode" type="{http://services/}episode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEpisode", propOrder = {
    "episode"
})
public class AddEpisode {

    protected Episode episode;

    /**
     * Gets the value of the episode property.
     * 
     * @return
     *     possible object is
     *     {@link Episode }
     *     
     */
    public Episode getEpisode() {
        return episode;
    }

    /**
     * Sets the value of the episode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Episode }
     *     
     */
    public void setEpisode(Episode value) {
        this.episode = value;
    }

}
