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


import com.dao.DiscussjiankangkepuDao;
import com.entity.DiscussjiankangkepuEntity;
import com.service.DiscussjiankangkepuService;
import com.entity.vo.DiscussjiankangkepuVO;
import com.entity.view.DiscussjiankangkepuView;

@Service("discussjiankangkepuService")
public class DiscussjiankangkepuServiceImpl extends ServiceImpl<DiscussjiankangkepuDao, DiscussjiankangkepuEntity> implements DiscussjiankangkepuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangkepuEntity> page = this.selectPage(
                new Query<DiscussjiankangkepuEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangkepuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangkepuEntity> wrapper) {
		  Page<DiscussjiankangkepuView> page =new Query<DiscussjiankangkepuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangkepuVO> selectListVO(Wrapper<DiscussjiankangkepuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangkepuVO selectVO(Wrapper<DiscussjiankangkepuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangkepuView> selectListView(Wrapper<DiscussjiankangkepuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangkepuView selectView(Wrapper<DiscussjiankangkepuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
