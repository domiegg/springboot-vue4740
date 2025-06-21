package com.entity.model;

import com.entity.JiankangkepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康科普
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public class JiankangkepuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 视频讲解
	 */
	
	private String shipinjiangjie;
		
	/**
	 * 科普内容
	 */
	
	private String kepuneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：视频讲解
	 */
	 
	public void setShipinjiangjie(String shipinjiangjie) {
		this.shipinjiangjie = shipinjiangjie;
	}
	
	/**
	 * 获取：视频讲解
	 */
	public String getShipinjiangjie() {
		return shipinjiangjie;
	}
				
	
	/**
	 * 设置：科普内容
	 */
	 
	public void setKepuneirong(String kepuneirong) {
		this.kepuneirong = kepuneirong;
	}
	
	/**
	 * 获取：科普内容
	 */
	public String getKepuneirong() {
		return kepuneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
