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


import com.dao.JiezhongyuyueDao;
import com.entity.JiezhongyuyueEntity;
import com.service.JiezhongyuyueService;
import com.entity.vo.JiezhongyuyueVO;
import com.entity.view.JiezhongyuyueView;

@Service("jiezhongyuyueService")
public class JiezhongyuyueServiceImpl extends ServiceImpl<JiezhongyuyueDao, JiezhongyuyueEntity> implements JiezhongyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiezhongyuyueEntity> page = this.selectPage(
                new Query<JiezhongyuyueEntity>(params).getPage(),
                new EntityWrapper<JiezhongyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiezhongyuyueEntity> wrapper) {
		  Page<JiezhongyuyueView> page =new Query<JiezhongyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiezhongyuyueVO> selectListVO(Wrapper<JiezhongyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiezhongyuyueVO selectVO(Wrapper<JiezhongyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiezhongyuyueView> selectListView(Wrapper<JiezhongyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiezhongyuyueView selectView(Wrapper<JiezhongyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiezhongyuyueEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiezhongyuyueEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiezhongyuyueEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
