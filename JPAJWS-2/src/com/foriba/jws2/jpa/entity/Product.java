package com.foriba.jws2.jpa.entity;

import java.io.Serializable;




import javax.persistence.*;

import com.foriba.jws2.base.entity.BaseEntity;

import java.sql.Time;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the JWS2_PRODUCTS database table.
 * 
 */
@Entity
@Table(name="JWS2_PRODUCTS", schema="TESTUSER")
public class Product extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idx;

	@Column(name="PROD_CONSDATE")
	private Timestamp prodConsdate;

    @Lob()
	@Column(name="PROD_DESC")
	private String prodDesc;

	@Column(name="PROD_NAME")
	private String prodName;

    @Lob()
	@Column(name="PROD_PICTURE")
	private byte[] prodPicture;

    @Temporal( TemporalType.DATE)
	@Column(name="PROD_PRODDATE")
	private Date prodProddate;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="SYS_LAST_UPDATE")
	private Date SysLastUpdate;

	
    @Column(name="SYS_VERSION")
	private long SysVersion;

    public Product() {
    }

	public long getIdx() {
		return this.idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public Timestamp getProdConsdate() {
		return this.prodConsdate;
	}

	public void setProdConsdate(Timestamp prodConsdate) {
		this.prodConsdate = prodConsdate;
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

	public Date getSysLastUpdate() {
		return this.SysLastUpdate;
	}

	public void setSysLastUpdate(Date prodSysLastUpdate) {
		this.SysLastUpdate = SysLastUpdate;
	}

	public long getSysVersion() {
		return this.SysVersion;
	}

	public void setSysVersion(long prodSysVersion) {
		this.SysVersion = SysVersion;
	}

}