package com.entity.view;

import com.entity.JiezhongyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 接种预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 11:13:03
 */
@TableName("jiezhongyuyue")
public class JiezhongyuyueView  extends JiezhongyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiezhongyuyueView(){
	}
 
 	public JiezhongyuyueView(JiezhongyuyueEntity jiezhongyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, jiezhongyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
