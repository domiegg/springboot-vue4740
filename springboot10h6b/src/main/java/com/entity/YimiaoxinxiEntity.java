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
 * 疫苗信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-24 11:13:03
 */
@TableName("yimiaoxinxi")
public class YimiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YimiaoxinxiEntity() {
		
	}
	
	public YimiaoxinxiEntity(T t) {
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
	 * 疫苗种类
	 */
					
	private String yimiaozhonglei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 适合人群
	 */
					
	private String shiherenqun;
	
	/**
	 * 年龄段
	 */
					
	private String nianlingduan;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 数量
	 */
					
	private String shuliang;
	
	/**
	 * 接种次数
	 */
					
	private String jiezhongcishu;
	
	/**
	 * 厂家
	 */
					
	private String changjia;
	
	/**
	 * 接种地点
	 */
					
	private String jiezhongdidian;
	
	/**
	 * 作用
	 */
					
	private String zuoyong;
	
	
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
	 * 设置：疫苗种类
	 */
	public void setYimiaozhonglei(String yimiaozhonglei) {
		this.yimiaozhonglei = yimiaozhonglei;
	}
	/**
	 * 获取：疫苗种类
	 */
	public String getYimiaozhonglei() {
		return yimiaozhonglei;
	}
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
	 * 设置：适合人群
	 */
	public void setShiherenqun(String shiherenqun) {
		this.shiherenqun = shiherenqun;
	}
	/**
	 * 获取：适合人群
	 */
	public String getShiherenqun() {
		return shiherenqun;
	}
	/**
	 * 设置：年龄段
	 */
	public void setNianlingduan(String nianlingduan) {
		this.nianlingduan = nianlingduan;
	}
	/**
	 * 获取：年龄段
	 */
	public String getNianlingduan() {
		return nianlingduan;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：接种次数
	 */
	public void setJiezhongcishu(String jiezhongcishu) {
		this.jiezhongcishu = jiezhongcishu;
	}
	/**
	 * 获取：接种次数
	 */
	public String getJiezhongcishu() {
		return jiezhongcishu;
	}
	/**
	 * 设置：厂家
	 */
	public void setChangjia(String changjia) {
		this.changjia = changjia;
	}
	/**
	 * 获取：厂家
	 */
	public String getChangjia() {
		return changjia;
	}
	/**
	 * 设置：接种地点
	 */
	public void setJiezhongdidian(String jiezhongdidian) {
		this.jiezhongdidian = jiezhongdidian;
	}
	/**
	 * 获取：接种地点
	 */
	public String getJiezhongdidian() {
		return jiezhongdidian;
	}
	/**
	 * 设置：作用
	 */
	public void setZuoyong(String zuoyong) {
		this.zuoyong = zuoyong;
	}
	/**
	 * 获取：作用
	 */
	public String getZuoyong() {
		return zuoyong;
	}

}
