package com.entity.model;

import com.entity.JiezhongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 接种记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public class JiezhongjiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 疫苗名称
	 */
	
	private String yimiaomingcheng;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 接种时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhongshijian;
		
	/**
	 * 完成次数
	 */
	
	private String wanchengcishu;
		
	/**
	 * 剩余次数
	 */
	
	private String shengyucishu;
		
	/**
	 * 是否不适
	 */
	
	private String shifoubushi;
		
	/**
	 * 时间间隔
	 */
	
	private String shijianjiange;
		
	/**
	 * 接种内容
	 */
	
	private String jiezhongneirong;
				
	
	/**
	 * 设置：疫苗名称
	 */
	 
	public void setYimiaomingcheng(String yimiaomingcheng) {
		this.yimiaomingcheng = yimiaomingcheng;
	}
	
	/**
	 * 获取：疫苗名称
	 */
	public String getYimiaomingcheng() {
		return yimiaomingcheng;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：接种时间
	 */
	 
	public void setJiezhongshijian(Date jiezhongshijian) {
		this.jiezhongshijian = jiezhongshijian;
	}
	
	/**
	 * 获取：接种时间
	 */
	public Date getJiezhongshijian() {
		return jiezhongshijian;
	}
				
	
	/**
	 * 设置：完成次数
	 */
	 
	public void setWanchengcishu(String wanchengcishu) {
		this.wanchengcishu = wanchengcishu;
	}
	
	/**
	 * 获取：完成次数
	 */
	public String getWanchengcishu() {
		return wanchengcishu;
	}
				
	
	/**
	 * 设置：剩余次数
	 */
	 
	public void setShengyucishu(String shengyucishu) {
		this.shengyucishu = shengyucishu;
	}
	
	/**
	 * 获取：剩余次数
	 */
	public String getShengyucishu() {
		return shengyucishu;
	}
				
	
	/**
	 * 设置：是否不适
	 */
	 
	public void setShifoubushi(String shifoubushi) {
		this.shifoubushi = shifoubushi;
	}
	
	/**
	 * 获取：是否不适
	 */
	public String getShifoubushi() {
		return shifoubushi;
	}
				
	
	/**
	 * 设置：时间间隔
	 */
	 
	public void setShijianjiange(String shijianjiange) {
		this.shijianjiange = shijianjiange;
	}
	
	/**
	 * 获取：时间间隔
	 */
	public String getShijianjiange() {
		return shijianjiange;
	}
				
	
	/**
	 * 设置：接种内容
	 */
	 
	public void setJiezhongneirong(String jiezhongneirong) {
		this.jiezhongneirong = jiezhongneirong;
	}
	
	/**
	 * 获取：接种内容
	 */
	public String getJiezhongneirong() {
		return jiezhongneirong;
	}
			
}
