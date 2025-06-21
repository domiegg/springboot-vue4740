package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiankangkepuDao;
import com.entity.JiankangkepuEntity;
import com.service.JiankangkepuService;
import com.entity.vo.JiankangkepuVO;
import com.entity.view.JiankangkepuView;

@Service("jiankangkepuService")
public class JiankangkepuServiceImpl extends ServiceImpl<JiankangkepuDao, JiankangkepuEntity> implements JiankangkepuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangkepuEntity> page = this.selectPage(
                new Query<JiankangkepuEntity>(params).getPage(),
                new EntityWrapper<JiankangkepuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangkepuEntity> wrapper) {
		  Page<JiankangkepuView> page =new Query<JiankangkepuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangkepuVO> selectListVO(Wrapper<JiankangkepuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangkepuVO selectVO(Wrapper<JiankangkepuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangkepuView> selectListView(Wrapper<JiankangkepuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangkepuView selectView(Wrapper<JiankangkepuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
