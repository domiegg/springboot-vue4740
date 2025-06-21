package com.dao;

import com.entity.JiezhongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhongjiluVO;
import com.entity.view.JiezhongjiluView;


/**
 * 接种记录
 * 
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public interface JiezhongjiluDao extends BaseMapper<JiezhongjiluEntity> {
	
	List<JiezhongjiluVO> selectListVO(@Param("ew") Wrapper<JiezhongjiluEntity> wrapper);
	
	JiezhongjiluVO selectVO(@Param("ew") Wrapper<JiezhongjiluEntity> wrapper);
	
	List<JiezhongjiluView> selectListView(@Param("ew") Wrapper<JiezhongjiluEntity> wrapper);

	List<JiezhongjiluView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhongjiluEntity> wrapper);
	
	JiezhongjiluView selectView(@Param("ew") Wrapper<JiezhongjiluEntity> wrapper);
	

}
