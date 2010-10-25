package com.chuckanutbay.businessobjects;

// Generated Oct 20, 2010 1:24:33 PM by Hibernate Tools 3.4.0.Beta1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InventoryLots generated by hbm2java
 */
@Entity
@Table(name = "inventory_lots")
public class InventoryLot implements java.io.Serializable {

	private Integer id;
	private InventoryItem inventoryItem;
	private String code;
	private int quantity;
	private Date receivedDatetime;
	private Date startUseDatetime;
	private Date endUseDatetime;
	private Date lastModifiedDatetime;

	public InventoryLot() {
	}

	public InventoryLot(InventoryItem inventoryItem, String code, int quantity,
			Date receivedDatetime, Date lastModifiedDatetime) {
		this.inventoryItem = inventoryItem;
		this.code = code;
		this.quantity = quantity;
		this.receivedDatetime = receivedDatetime;
		this.lastModifiedDatetime = lastModifiedDatetime;
	}

	public InventoryLot(InventoryItem inventoryItem, String code, int quantity,
			Date receivedDatetime, Date startUseDatetime, Date endUseDatetime,
			Date lastModifiedDatetime) {
		this.inventoryItem = inventoryItem;
		this.code = code;
		this.quantity = quantity;
		this.receivedDatetime = receivedDatetime;
		this.startUseDatetime = startUseDatetime;
		this.endUseDatetime = endUseDatetime;
		this.lastModifiedDatetime = lastModifiedDatetime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inventory_item_id", nullable = false)
	public InventoryItem getInventoryItem() {
		return this.inventoryItem;
	}

	public void setInventoryItem(InventoryItem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

	@Column(name = "code", nullable = false, length = 30)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "received_datetime", nullable = false, length = 19)
	public Date getReceivedDatetime() {
		return this.receivedDatetime;
	}

	public void setReceivedDatetime(Date receivedDatetime) {
		this.receivedDatetime = receivedDatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_use_datetime", length = 19)
	public Date getStartUseDatetime() {
		return this.startUseDatetime;
	}

	public void setStartUseDatetime(Date startUseDatetime) {
		this.startUseDatetime = startUseDatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_use_datetime", length = 19)
	public Date getEndUseDatetime() {
		return this.endUseDatetime;
	}

	public void setEndUseDatetime(Date endUseDatetime) {
		this.endUseDatetime = endUseDatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified_datetime", length = 19)
	public Date getLastModifiedDatetime() {
		return this.lastModifiedDatetime;
	}

	public void setLastModifiedDatetime(Date lastModifiedDatetime) {
		this.lastModifiedDatetime = lastModifiedDatetime;
	}

}
