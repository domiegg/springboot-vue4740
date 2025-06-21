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
 * 接种预约
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-24 11:13:03
 */
@TableName("jiezhongyuyue")
public class JiezhongyuyueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiezhongyuyueEntity() {
		
	}
	
	public JiezhongyuyueEntity(T t) {
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
	 * 预约类型
	 */
					
	private String yuyueleixing;
	
	/**
	 * 人数
	 */
					
	private Integer renshu;
	
	/**
	 * 预约资料
	 */
					
	private String yuyueziliao;
	
	/**
	 * 预约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：预约类型
	 */
	public void setYuyueleixing(String yuyueleixing) {
		this.yuyueleixing = yuyueleixing;
	}
	/**
	 * 获取：预约类型
	 */
	public String getYuyueleixing() {
		return yuyueleixing;
	}
	/**
	 * 设置：人数
	 */
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
	/**
	 * 设置：预约资料
	 */
	public void setYuyueziliao(String yuyueziliao) {
		this.yuyueziliao = yuyueziliao;
	}
	/**
	 * 获取：预约资料
	 */
	public String getYuyueziliao() {
		return yuyueziliao;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
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
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
