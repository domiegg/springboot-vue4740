package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 接种记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
@TableName("jiezhongjilu")
public class JiezhongjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiezhongjiluEntity() {
		
	}
	
	public JiezhongjiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 疫苗编号
	 */
					
	private String yimiaobianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：疫苗编号
	 */
	public void setYimiaobianhao(String yimiaobianhao) {
		this.yimiaobianhao = yimiaobianhao;
	}
	/**
	 * 获取：疫苗编号
	 */
	public String getYimiaobianhao() {
		return yimiaobianhao;
	}
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
