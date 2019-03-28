package com.yuefan.msc.domain;

/**
 * 设备传感器详细配置
 * */
public class SensorProtocolConfig {
	private int id ;
	/**产品id*/
	private int prodId ;
	/**设备id*/
	private int equipmentId;
	/**传感器id*/
	private int sensorId;
	/**传感器序号*/
	private int order ;
	/**传感器名称*/
	private String sensorName = null;
	/**从站地址*/
	private int salveId ;
	/**功能码*/
	private int RegisterRange ;
	/**偏移量*/
	private int offset ;
	/**数据类型*/
	private int dataType ;
	/**采集周期*/
	private int period ;
	
	
	public SensorProtocolConfig() {
	}

	public SensorProtocolConfig(int id, int prodId, int equipmentId, int sensorId, int order, String sensorName,
			int salveId, int registerRange, int offset, int dataType, int period) {
		this.id = id;
		this.prodId = prodId;
		this.equipmentId = equipmentId;
		this.sensorId = sensorId;
		this.order = order;
		this.sensorName = sensorName;
		this.salveId = salveId;
		RegisterRange = registerRange;
		this.offset = offset;
		this.dataType = dataType;
		this.period = period;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the prodId
	 */
	public int getProdId() {
		return prodId;
	}

	/**
	 * @param prodId the prodId to set
	 */
	public void setProdId(int prodId) {
		this.prodId = prodId;
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

	/**
	 * @return the sensorId
	 */
	public int getSensorId() {
		return sensorId;
	}

	/**
	 * @param sensorId the sensorId to set
	 */
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	/**
	 * @return the sensorName
	 */
	public String getSensorName() {
		return sensorName;
	}

	/**
	 * @param sensorName the sensorName to set
	 */
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	/**
	 * @return the salveId
	 */
	public int getSalveId() {
		return salveId;
	}

	/**
	 * @param salveId the salveId to set
	 */
	public void setSalveId(int salveId) {
		this.salveId = salveId;
	}

	/**
	 * @return the registerRange
	 */
	public int getRegisterRange() {
		return RegisterRange;
	}

	/**
	 * @param registerRange the registerRange to set
	 */
	public void setRegisterRange(int registerRange) {
		RegisterRange = registerRange;
	}

	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * @return the dataType
	 */
	public int getDataType() {
		return dataType;
	}

	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(int dataType) {
		this.dataType = dataType;
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
	
	
}
