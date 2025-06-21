package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangkepuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangkepuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangkepuView;


/**
 * 健康科普
 *
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public interface JiankangkepuService extends IService<JiankangkepuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangkepuVO> selectListVO(Wrapper<JiankangkepuEntity> wrapper);
   	
   	JiankangkepuVO selectVO(@Param("ew") Wrapper<JiankangkepuEntity> wrapper);
   	
   	List<JiankangkepuView> selectListView(Wrapper<JiankangkepuEntity> wrapper);
   	
   	JiankangkepuView selectView(@Param("ew") Wrapper<JiankangkepuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangkepuEntity> wrapper);
   	

}

