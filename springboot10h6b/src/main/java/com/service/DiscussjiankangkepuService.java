package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangkepuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangkepuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangkepuView;


/**
 * 健康科普评论表
 *
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public interface DiscussjiankangkepuService extends IService<DiscussjiankangkepuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangkepuVO> selectListVO(Wrapper<DiscussjiankangkepuEntity> wrapper);
   	
   	DiscussjiankangkepuVO selectVO(@Param("ew") Wrapper<DiscussjiankangkepuEntity> wrapper);
   	
   	List<DiscussjiankangkepuView> selectListView(Wrapper<DiscussjiankangkepuEntity> wrapper);
   	
   	DiscussjiankangkepuView selectView(@Param("ew") Wrapper<DiscussjiankangkepuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangkepuEntity> wrapper);
   	

}

