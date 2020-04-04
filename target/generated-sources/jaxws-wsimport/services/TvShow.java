
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tvShow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tvShow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genreid" type="{http://services/}genre" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yearEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yearStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tvShow", propOrder = {
    "genreid",
    "id",
    "title",
    "yearEnd",
    "yearStart"
})
public class TvShow {

    protected Genre genreid;
    protected Integer id;
    protected String title;
    protected Integer yearEnd;
    protected int yearStart;

    /**
     * Gets the value of the genreid property.
     * 
     * @return
     *     possible object is
     *     {@link Genre }
     *     
     */
    public Genre getGenreid() {
        return genreid;
    }

    /**
     * Sets the value of the genreid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Genre }
     *     
     */
    public void setGenreid(Genre value) {
        this.genreid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the yearEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearEnd() {
        return yearEnd;
    }

    /**
     * Sets the value of the yearEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearEnd(Integer value) {
        this.yearEnd = value;
    }

    /**
     * Gets the value of the yearStart property.
     * 
     */
    public int getYearStart() {
        return yearStart;
    }

    /**
     * Sets the value of the yearStart property.
     * 
     */
    public void setYearStart(int value) {
        this.yearStart = value;
    }

}
