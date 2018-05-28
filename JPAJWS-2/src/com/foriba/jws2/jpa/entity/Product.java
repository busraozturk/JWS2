package com.foriba.jws2.jpa.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.foriba.jws2.base.entity.BaseEntity;
import java.util.Date;


/**
 * The persistent class for the JWS2_PRODUCTS database table.
 * 
 */
@Entity
@Table(name = "JWS2_PRODUCTS", schema = "TESTUSER")
@NamedQueries( {@NamedQuery(name = "Product.getProductList", query = "SELECT P FROM Product P"), @NamedQuery(name = "Product.getProductByID", query = "SELECT P FROM Product P WHERE P.idx = :id"),
		@NamedQuery(name = "Product.getProductByProdName", query = "SELECT P FROM Product P WHERE P.prodName = :prodName"),
		@NamedQuery(name = "Product.getProductListByProdDate", query = "SELECT P FROM Product P WHERE P.prodProddate = :prodProddate"),
		@NamedQuery(name = "Product.getProductListByMultipleProdDate", query = "SELECT P FROM Product P WHERE P.prodProddate > ?1 AND P.prodProddate < ?2"),
		@NamedQuery(name = "Product.getProductListByProdName", query = "SELECT P FROM Product P WHERE P.prodName LIKE :prodName"),
		@NamedQuery(name = "Product.updateProduct", query = "UPDATE Product P SET P.prodName =?1 WHERE P.idx=?2"),
		@NamedQuery(name = "Product.removeProduct", query = "DELETE  FROM Product P WHERE P.idx = :id"),})
public class Product extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDX_PRO")
	@SequenceGenerator(name = "IDX_PRO", sequenceName = "PRODUCT_SEQ")
	private long idx;

	@Column(name = "PROD_CONSDATE")
	private String prodConsdate;

	@Lob()
	@Column(name = "PROD_DESC")
	private String prodDesc;

	@Column(name = "PROD_NAME")
	private String prodName;

	@Lob()
	@Column(name = "PROD_PICTURE")
	private byte[] prodPicture;

	@Temporal(TemporalType.DATE)
	@Column(name = "PROD_PRODDATE")
	private Date prodProddate;

	public Product() {}

	public long getIdx() {
		return this.idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public String getProdConsdate() {
		return this.prodConsdate;
	}

	public void setProdConsdate(String consDate) {
		this.prodConsdate = consDate;
	}

	public String getProdDesc() {
		return this.prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public byte[] getProdPicture() {
		return this.prodPicture;
	}

	public void setProdPicture(byte[] prodPicture) {
		this.prodPicture = prodPicture;
	}

	public Date getProdProddate() {
		return this.prodProddate;
	}

	public void setProdProddate(Date prodProddate) {
		this.prodProddate = prodProddate;
	}


}
