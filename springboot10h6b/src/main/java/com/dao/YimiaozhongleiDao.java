package com.dao;

import com.entity.YimiaozhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaozhongleiVO;
import com.entity.view.YimiaozhongleiView;


/**
 * 疫苗种类
 * 
 * @author 
 * @email 
 * @date 2022-02-24 11:13:03
 */
public interface YimiaozhongleiDao extends BaseMapper<YimiaozhongleiEntity> {
	
	List<YimiaozhongleiVO> selectListVO(@Param("ew") Wrapper<YimiaozhongleiEntity> wrapper);
	
	YimiaozhongleiVO selectVO(@Param("ew") Wrapper<YimiaozhongleiEntity> wrapper);
	
	List<YimiaozhongleiView> selectListView(@Param("ew") Wrapper<YimiaozhongleiEntity> wrapper);

	List<YimiaozhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaozhongleiEntity> wrapper);
	
	YimiaozhongleiView selectView(@Param("ew") Wrapper<YimiaozhongleiEntity> wrapper);
	

}
