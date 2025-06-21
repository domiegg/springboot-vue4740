package com.dao;

import com.entity.JiankangkepuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangkepuVO;
import com.entity.view.JiankangkepuView;


/**
 * 健康科普
 * 
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public interface JiankangkepuDao extends BaseMapper<JiankangkepuEntity> {
	
	List<JiankangkepuVO> selectListVO(@Param("ew") Wrapper<JiankangkepuEntity> wrapper);
	
	JiankangkepuVO selectVO(@Param("ew") Wrapper<JiankangkepuEntity> wrapper);
	
	List<JiankangkepuView> selectListView(@Param("ew") Wrapper<JiankangkepuEntity> wrapper);

	List<JiankangkepuView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangkepuEntity> wrapper);
	
	JiankangkepuView selectView(@Param("ew") Wrapper<JiankangkepuEntity> wrapper);
	

}
