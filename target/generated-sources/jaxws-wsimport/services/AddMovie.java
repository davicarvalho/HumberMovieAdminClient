
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addMovie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addMovie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movie" type="{http://services/}movie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMovie", propOrder = {
    "movie"
})
public class AddMovie {

    protected Movie movie;

    /**
     * Gets the value of the movie property.
     * 
     * @return
     *     possible object is
     *     {@link Movie }
     *     
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Sets the value of the movie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Movie }
     *     
     */
    public void setMovie(Movie value) {
        this.movie = value;
    }

}
