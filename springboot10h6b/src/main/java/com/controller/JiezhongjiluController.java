package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiezhongjiluEntity;
import com.entity.view.JiezhongjiluView;

import com.service.JiezhongjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 接种记录
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
@RestController
@RequestMapping("/jiezhongjilu")
public class JiezhongjiluController {
    @Autowired
    private JiezhongjiluService jiezhongjiluService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiezhongjiluEntity jiezhongjilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiezhongjilu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiezhongjiluEntity> ew = new EntityWrapper<JiezhongjiluEntity>();
		PageUtils page = jiezhongjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiezhongjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiezhongjiluEntity jiezhongjilu, 
		HttpServletRequest request){
        EntityWrapper<JiezhongjiluEntity> ew = new EntityWrapper<JiezhongjiluEntity>();
		PageUtils page = jiezhongjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiezhongjilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiezhongjiluEntity jiezhongjilu){
       	EntityWrapper<JiezhongjiluEntity> ew = new EntityWrapper<JiezhongjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiezhongjilu, "jiezhongjilu")); 
        return R.ok().put("data", jiezhongjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiezhongjiluEntity jiezhongjilu){
        EntityWrapper< JiezhongjiluEntity> ew = new EntityWrapper< JiezhongjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiezhongjilu, "jiezhongjilu")); 
		JiezhongjiluView jiezhongjiluView =  jiezhongjiluService.selectView(ew);
		return R.ok("查询接种记录成功").put("data", jiezhongjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiezhongjiluEntity jiezhongjilu = jiezhongjiluService.selectById(id);
        return R.ok().put("data", jiezhongjilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiezhongjiluEntity jiezhongjilu = jiezhongjiluService.selectById(id);
        return R.ok().put("data", jiezhongjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiezhongjiluEntity jiezhongjilu, HttpServletRequest request){
    	jiezhongjilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiezhongjilu);
        jiezhongjiluService.insert(jiezhongjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiezhongjiluEntity jiezhongjilu, HttpServletRequest request){
    	jiezhongjilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiezhongjilu);
        jiezhongjiluService.insert(jiezhongjilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiezhongjiluEntity jiezhongjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiezhongjilu);
        jiezhongjiluService.updateById(jiezhongjilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiezhongjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiezhongjiluEntity> wrapper = new EntityWrapper<JiezhongjiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = jiezhongjiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
