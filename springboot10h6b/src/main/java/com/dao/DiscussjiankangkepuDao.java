package com.dao;

import com.entity.DiscussjiankangkepuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangkepuVO;
import com.entity.view.DiscussjiankangkepuView;


/**
 * 健康科普评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public interface DiscussjiankangkepuDao extends BaseMapper<DiscussjiankangkepuEntity> {
	
	List<DiscussjiankangkepuVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangkepuEntity> wrapper);
	
	DiscussjiankangkepuVO selectVO(@Param("ew") Wrapper<DiscussjiankangkepuEntity> wrapper);
	
	List<DiscussjiankangkepuView> selectListView(@Param("ew") Wrapper<DiscussjiankangkepuEntity> wrapper);

	List<DiscussjiankangkepuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangkepuEntity> wrapper);
	
	DiscussjiankangkepuView selectView(@Param("ew") Wrapper<DiscussjiankangkepuEntity> wrapper);
	

}
