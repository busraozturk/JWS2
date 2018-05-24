
package foriba.com.jws2product;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JWS2ProductList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JWS2ProductList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="prodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prodConsDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prodDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="prodPicture" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="prodDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sysVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sysLastUpdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JWS2ProductList", propOrder = {
    "id",
    "prodName",
    "prodConsDate",
    "prodDate",
    "prodPicture",
    "prodDesc",
    "sysVersion",
    "sysLastUpdate"
})
public class JWS2ProductList {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(required = true)
    protected String prodName;
    @XmlElement(required = true)
    protected String prodConsDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date prodDate;
    @XmlElement(required = true)
    protected byte[] prodPicture;
    @XmlElement(required = true)
    protected String prodDesc;
    protected long sysVersion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sysLastUpdate;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the prodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * Sets the value of the prodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdName(String value) {
        this.prodName = value;
    }

    /**
     * Gets the value of the prodConsDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdConsDate() {
        return prodConsDate;
    }

    /**
     * Sets the value of the prodConsDate property.
     * 
     * @param date
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdConsDate(String date) {
        this.prodConsDate = date;
    }

    /**
     * Gets the value of the prodDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getProdDate() {
        return prodDate;
    }

    /**
     * Sets the value of the prodDate property.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProdDate(Date date) {
        this.prodDate = date;
    }

    /**
     * Gets the value of the prodPicture property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getProdPicture() {
        return prodPicture;
    }

    /**
     * Sets the value of the prodPicture property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setProdPicture(byte[] value) {
        this.prodPicture = ((byte[]) value);
    }

    /**
     * Gets the value of the prodDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdDesc() {
        return prodDesc;
    }

    /**
     * Sets the value of the prodDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdDesc(String value) {
        this.prodDesc = value;
    }

    /**
     * Gets the value of the sysVersion property.
     * 
     */
    public long getSysVersion() {
        return sysVersion;
    }

    /**
     * Sets the value of the sysVersion property.
     * 
     */
    public void setSysVersion(long value) {
        this.sysVersion = value;
    }

    /**
     * Gets the value of the sysLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSysLastUpdate() {
        return sysLastUpdate;
    }

    /**
     * Sets the value of the sysLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSysLastUpdate(XMLGregorianCalendar value) {
        this.sysLastUpdate = value;
    }

}
