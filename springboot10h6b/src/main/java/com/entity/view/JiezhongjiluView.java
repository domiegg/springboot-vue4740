package com.entity.view;

import com.entity.JiezhongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 接种记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
@TableName("jiezhongjilu")
public class JiezhongjiluView  extends JiezhongjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiezhongjiluView(){
	}
 
 	public JiezhongjiluView(JiezhongjiluEntity jiezhongjiluEntity){
 	try {
			BeanUtils.copyProperties(this, jiezhongjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
