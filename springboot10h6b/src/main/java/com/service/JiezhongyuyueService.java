package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiezhongyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiezhongyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhongyuyueView;


/**
 * 接种预约
 *
 * @author 
 * @email 
 * @date 2022-02-24 11:13:03
 */
public interface JiezhongyuyueService extends IService<JiezhongyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiezhongyuyueVO> selectListVO(Wrapper<JiezhongyuyueEntity> wrapper);
   	
   	JiezhongyuyueVO selectVO(@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);
   	
   	List<JiezhongyuyueView> selectListView(Wrapper<JiezhongyuyueEntity> wrapper);
   	
   	JiezhongyuyueView selectView(@Param("ew") Wrapper<JiezhongyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiezhongyuyueEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiezhongyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiezhongyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiezhongyuyueEntity> wrapper);
}

