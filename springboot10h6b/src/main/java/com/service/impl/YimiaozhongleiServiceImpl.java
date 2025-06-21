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


import com.dao.YimiaozhongleiDao;
import com.entity.YimiaozhongleiEntity;
import com.service.YimiaozhongleiService;
import com.entity.vo.YimiaozhongleiVO;
import com.entity.view.YimiaozhongleiView;

@Service("yimiaozhongleiService")
public class YimiaozhongleiServiceImpl extends ServiceImpl<YimiaozhongleiDao, YimiaozhongleiEntity> implements YimiaozhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaozhongleiEntity> page = this.selectPage(
                new Query<YimiaozhongleiEntity>(params).getPage(),
                new EntityWrapper<YimiaozhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaozhongleiEntity> wrapper) {
		  Page<YimiaozhongleiView> page =new Query<YimiaozhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaozhongleiVO> selectListVO(Wrapper<YimiaozhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaozhongleiVO selectVO(Wrapper<YimiaozhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaozhongleiView> selectListView(Wrapper<YimiaozhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaozhongleiView selectView(Wrapper<YimiaozhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
