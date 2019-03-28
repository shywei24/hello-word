package com.yuefan.msc.domain;

/**
 * 设备调配记录表
 */

public class EquAssignment {

	private int id ;
	private String prodName = null;
	/**归属人*/
	private String ownerName = null;
	/**前归属人*/
	private String preowned = null;
	/**设备id*/
	private int equipmentId ;
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}
	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the preowned
	 */
	public String getPreowned() {
		return preowned;
	}
	/**
	 * @param preowned the preowned to set
	 */
	public void setPreowned(String preowned) {
		this.preowned = preowned;
	}
	/**
	 * @return the equipmentId
	 */
	public int getEquipmentId() {
		return equipmentId;
	}
	/**
	 * @param equipmentId the equipmentId to set
	 */
	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}
	
	
	
}
