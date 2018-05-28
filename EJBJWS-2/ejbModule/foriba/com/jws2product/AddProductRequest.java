package foriba.com.jws2product;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prodDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="prodPicture" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="prodDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "prodName", "consDate", "prodDate",
		"prodPicture", "prodDesc" })
@XmlRootElement(name = "addProductRequest")
public class AddProductRequest {

	@XmlElement(required = true)
	protected String prodName;
	@XmlElement(required = true)
	protected String consDate;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected Date prodDate;
	@XmlElement(required = true)
	protected byte[] prodPicture;
	@XmlElement(required = true)
	protected String prodDesc;

	/**
	 * Gets the value of the prodName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProdName() {
		return prodName;
	}

	/**
	 * Sets the value of the prodName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProdName(String value) {
		this.prodName = value;
	}

	/**
	 * Gets the value of the consDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConsDate() {
		return consDate;
	}

	/**
	 * Sets the value of the consDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConsDate(String value) {
		this.consDate = value;
	}

	/**
	 * Gets the value of the prodDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Date getProdDate() {
		return prodDate;
	}

	/**
	 * Sets the value of the prodDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setProdDate(Date value) {
		this.prodDate = value;
	}

	/**
	 * Gets the value of the prodPicture property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getProdPicture() {
		return prodPicture;
	}

	/**
	 * Sets the value of the prodPicture property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setProdPicture(byte[] value) {
		this.prodPicture = ((byte[]) value);
	}

	/**
	 * Gets the value of the prodDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProdDesc() {
		return prodDesc;
	}

	/**
	 * Sets the value of the prodDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProdDesc(String value) {
		this.prodDesc = value;
	}

}
