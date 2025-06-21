package com.entity.view;

import com.entity.DiscussjiankangkepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康科普评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
@TableName("discussjiankangkepu")
public class DiscussjiankangkepuView  extends DiscussjiankangkepuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiankangkepuView(){
	}
 
 	public DiscussjiankangkepuView(DiscussjiankangkepuEntity discussjiankangkepuEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiankangkepuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
