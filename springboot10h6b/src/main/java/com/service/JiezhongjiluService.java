package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiezhongjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiezhongjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhongjiluView;


/**
 * 接种记录
 *
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public interface JiezhongjiluService extends IService<JiezhongjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiezhongjiluVO> selectListVO(Wrapper<JiezhongjiluEntity> wrapper);
   	
   	JiezhongjiluVO selectVO(@Param("ew") Wrapper<JiezhongjiluEntity> wrapper);
   	
   	List<JiezhongjiluView> selectListView(Wrapper<JiezhongjiluEntity> wrapper);
   	
   	JiezhongjiluView selectView(@Param("ew") Wrapper<JiezhongjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiezhongjiluEntity> wrapper);
   	

}

