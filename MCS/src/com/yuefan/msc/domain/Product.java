package com.yuefan.msc.domain;

import java.util.List;

/**
 * 产品配置
 * */
public class Product {
	private int id ;
	private String prodName = null;
	/**型号*/
	private String prodModel = null;
	/**图标*/
	private byte[] img = null;
	/**描述*/
	private String prodDesc = null;
	/**连接协议*/
	private String protocol = null;
	/**采集周期*/
	private int period ;
	/**产品默认传感器配置*/
	private List<SensorConfig> sensorConfigs = null;
	/**产品创建人*/
	private String ownerName = null;
	
	public Product() {
	}
	


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	public Product(int id, String prodName, String prodModel, byte[] img, String prodDesc, String protocol, int period,
			List<SensorConfig> sensorConfigs, String ownerName) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodModel = prodModel;
		this.img = img;
		this.prodDesc = prodDesc;
		this.protocol = protocol;
		this.period = period;
		this.sensorConfigs = sensorConfigs;
		this.ownerName = ownerName;
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
	 * @return the prodModel
	 */
	public String getProdModel() {
		return prodModel;
	}
	/**
	 * @param prodModel the prodModel to set
	 */
	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
	}
	/**
	 * @return the img
	 */
	public byte[] getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(byte[] img) {
		this.img = img;
	}
	/**
	 * @return the prodDesc
	 */
	public String getProdDesc() {
		return prodDesc;
	}
	/**
	 * @param prodDesc the prodDesc to set
	 */
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}
	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	/**
	 * @return the period
	 */
	public int getPeriod() {
		return period;
	}
	/**
	 * @param period the period to set
	 */
	public void setPeriod(int period) {
		this.period = period;
	}

	/**
	 * @return the sensorConfigs
	 */
	public List<SensorConfig> getSensorConfigs() {
		return sensorConfigs;
	}

	/**
	 * @param sensorConfigs the sensorConfigs to set
	 */
	public void setSensorConfigs(List<SensorConfig> sensorConfigs) {
		this.sensorConfigs = sensorConfigs;
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
	
}
