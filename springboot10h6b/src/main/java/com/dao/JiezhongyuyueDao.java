package com.dao;

import com.entity.JiezhongyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhongyuyueVO;
import com.entity.view.JiezhongyuyueView;


/**
 * 接种预约
 * 
 * @author 
 * @email 
 * @date 2022-02-24 11:13:03
 */
public interface JiezhongyuyueDao extends BaseMapper<JiezhongyuyueEntity> {
	
	List<JiezhongyuyueVO> selectListVO(@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);
	
	JiezhongyuyueVO selectVO(@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);
	
	List<JiezhongyuyueView> selectListView(@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);

	List<JiezhongyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);
	
	JiezhongyuyueView selectView(@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);
}
