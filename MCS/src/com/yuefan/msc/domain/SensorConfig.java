package com.yuefan.msc.domain;

/**
 * 传感器配置
 * */
public class SensorConfig {
	private int id ;
	private int pordId ; 
	/**序号*/
	private int order ;
	/**传感器名称*/
	private String sensorName = null;
	/**传感器类型*/
	private String type = null ;
	/**精度*/
	private String precision = null;
	/**单位*/
	private String units = null;
	/**传感器状态*/
	private int status ;
	
	public SensorConfig() {
	}

	public SensorConfig(int id, int pordId, int order, String sensorName, String type, String precision, String units,
			int status) {
		super();
		this.id = id;
		this.pordId = pordId;
		this.order = order;
		this.sensorName = sensorName;
		this.type = type;
		this.precision = precision;
		this.units = units;
		this.status = status;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the pordId
	 */
	public int getPordId() {
		return pordId;
	}

	/**
	 * @param pordId the pordId to set
	 */
	public void setPordId(int pordId) {
		this.pordId = pordId;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the precision
	 */
	public String getPrecision() {
		return precision;
	}

	/**
	 * @param precision the precision to set
	 */
	public void setPrecision(String precision) {
		this.precision = precision;
	}

	/**
	 * @return the units
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * @param units the units to set
	 */
	public void setUnits(String units) {
		this.units = units;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
}
