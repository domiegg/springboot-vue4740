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


import com.dao.JiezhongjiluDao;
import com.entity.JiezhongjiluEntity;
import com.service.JiezhongjiluService;
import com.entity.vo.JiezhongjiluVO;
import com.entity.view.JiezhongjiluView;

@Service("jiezhongjiluService")
public class JiezhongjiluServiceImpl extends ServiceImpl<JiezhongjiluDao, JiezhongjiluEntity> implements JiezhongjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiezhongjiluEntity> page = this.selectPage(
                new Query<JiezhongjiluEntity>(params).getPage(),
                new EntityWrapper<JiezhongjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiezhongjiluEntity> wrapper) {
		  Page<JiezhongjiluView> page =new Query<JiezhongjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiezhongjiluVO> selectListVO(Wrapper<JiezhongjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiezhongjiluVO selectVO(Wrapper<JiezhongjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiezhongjiluView> selectListView(Wrapper<JiezhongjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiezhongjiluView selectView(Wrapper<JiezhongjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
