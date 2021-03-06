package com.spring.boot.ss.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.Temporal;
;

@Entity
public class Product {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ProductID;
	@Column
	private String ProductName;
	@Column
	private Integer MSRP;
	@Column
	private Integer Quantity;
	@Column
	private String Vendor;

    @Column(name = "Create_Date", nullable = false)
    private Date createDate;
	
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getProductID() {
		return ProductID;
	}
	
	public void setProductID(Integer productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public Integer getMSRP() {
		return MSRP;
	}
	public void setMSRP(Integer mSRP) {
		MSRP = mSRP;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public String getVendor() {
		return Vendor;
	}
	public void setVendor(String vendor) {
		Vendor = vendor;
	}
	
}
