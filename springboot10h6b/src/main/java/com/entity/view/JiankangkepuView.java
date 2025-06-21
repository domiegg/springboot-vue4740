package com.entity.view;

import com.entity.JiankangkepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康科普
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
@TableName("jiankangkepu")
public class JiankangkepuView  extends JiankangkepuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangkepuView(){
	}
 
 	public JiankangkepuView(JiankangkepuEntity jiankangkepuEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangkepuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
