package com.yuefan.msc.product.record;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 产品运行状态采集记录表
 * */
public class RecordMDL {
	private int id ;
	/**产品id*/
	private int prodId ;
	/**设备序列号*/
	private int equipmentId ;
	/**设备序列号*/
	private String eSerialNo ;
	/**年月格式 201903*/
	private String recordPeriod = null;
	/**采集记录日期*/
	private Date recordDate = null;
	/**采集记录时间*/
	private Timestamp recordTime = null;
	
	/**对应传感器序号的数据记录*/
	private String order1 = null;
	private String order2 = null;
	private String order3 = null;
}
