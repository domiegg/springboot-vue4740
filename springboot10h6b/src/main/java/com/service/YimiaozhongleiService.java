package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaozhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaozhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaozhongleiView;


/**
 * 疫苗种类
 *
 * @author 
 * @email 
 * @date 2022-02-24 11:13:03
 */
public interface YimiaozhongleiService extends IService<YimiaozhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaozhongleiVO> selectListVO(Wrapper<YimiaozhongleiEntity> wrapper);
   	
   	YimiaozhongleiVO selectVO(@Param("ew") Wrapper<YimiaozhongleiEntity> wrapper);
   	
   	List<YimiaozhongleiView> selectListView(Wrapper<YimiaozhongleiEntity> wrapper);
   	
   	YimiaozhongleiView selectView(@Param("ew") Wrapper<YimiaozhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaozhongleiEntity> wrapper);
   	

}

