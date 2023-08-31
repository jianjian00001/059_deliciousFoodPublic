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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DazhongcepingEntity;
import com.entity.view.DazhongcepingView;

import com.service.DazhongcepingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 大众测评
 * 后端接口
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
@RestController
@RequestMapping("/dazhongceping")
public class DazhongcepingController {
    @Autowired
    private DazhongcepingService dazhongcepingService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DazhongcepingEntity dazhongceping,
		HttpServletRequest request){
        EntityWrapper<DazhongcepingEntity> ew = new EntityWrapper<DazhongcepingEntity>();

		PageUtils page = dazhongcepingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dazhongceping), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DazhongcepingEntity dazhongceping, 
		HttpServletRequest request){
        EntityWrapper<DazhongcepingEntity> ew = new EntityWrapper<DazhongcepingEntity>();

		PageUtils page = dazhongcepingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dazhongceping), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DazhongcepingEntity dazhongceping){
       	EntityWrapper<DazhongcepingEntity> ew = new EntityWrapper<DazhongcepingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dazhongceping, "dazhongceping")); 
        return R.ok().put("data", dazhongcepingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DazhongcepingEntity dazhongceping){
        EntityWrapper< DazhongcepingEntity> ew = new EntityWrapper< DazhongcepingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dazhongceping, "dazhongceping")); 
		DazhongcepingView dazhongcepingView =  dazhongcepingService.selectView(ew);
		return R.ok("查询大众测评成功").put("data", dazhongcepingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DazhongcepingEntity dazhongceping = dazhongcepingService.selectById(id);
        return R.ok().put("data", dazhongceping);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DazhongcepingEntity dazhongceping = dazhongcepingService.selectById(id);
        return R.ok().put("data", dazhongceping);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DazhongcepingEntity dazhongceping, HttpServletRequest request){
    	dazhongceping.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dazhongceping);
        dazhongcepingService.insert(dazhongceping);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DazhongcepingEntity dazhongceping, HttpServletRequest request){
    	dazhongceping.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dazhongceping);
        dazhongcepingService.insert(dazhongceping);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DazhongcepingEntity dazhongceping, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dazhongceping);
        dazhongcepingService.updateById(dazhongceping);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dazhongcepingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DazhongcepingEntity> wrapper = new EntityWrapper<DazhongcepingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = dazhongcepingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<DazhongcepingEntity> ew = new EntityWrapper<DazhongcepingEntity>();
        List<Map<String, Object>> result = dazhongcepingService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<DazhongcepingEntity> ew = new EntityWrapper<DazhongcepingEntity>();
        List<Map<String, Object>> result = dazhongcepingService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<DazhongcepingEntity> ew = new EntityWrapper<DazhongcepingEntity>();
        List<Map<String, Object>> result = dazhongcepingService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,DazhongcepingEntity dazhongceping, HttpServletRequest request){
        EntityWrapper<DazhongcepingEntity> ew = new EntityWrapper<DazhongcepingEntity>();
        int count = dazhongcepingService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dazhongceping), params), params));
        return R.ok().put("data", count);
    }

}
