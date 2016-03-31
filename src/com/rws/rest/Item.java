package com.rws.rest;

import javax.xml.bind.annotation.XmlRootElement;

/*@XmlRootElement*/
public class Item {
	
	public Item(){
		
	}
	
	private String itemId;
	private String itemDescription;
	private String rfId;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getRfId() {
		return rfId;
	}
	public void setRfId(String rfId) {
		this.rfId = rfId;
	}

}
