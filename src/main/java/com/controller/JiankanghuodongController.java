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

import com.entity.JiankanghuodongEntity;
import com.entity.view.JiankanghuodongView;

import com.service.JiankanghuodongService;
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
 * 健康活动
 * 后端接口
 * @author 
 * @email 
 * @date 2023-01-03 15:13:30
 */
@RestController
@RequestMapping("/jiankanghuodong")
public class JiankanghuodongController {
    @Autowired
    private JiankanghuodongService jiankanghuodongService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankanghuodongEntity jiankanghuodong,
		HttpServletRequest request){
        EntityWrapper<JiankanghuodongEntity> ew = new EntityWrapper<JiankanghuodongEntity>();

		PageUtils page = jiankanghuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankanghuodong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankanghuodongEntity jiankanghuodong, 
		HttpServletRequest request){
        EntityWrapper<JiankanghuodongEntity> ew = new EntityWrapper<JiankanghuodongEntity>();

		PageUtils page = jiankanghuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankanghuodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankanghuodongEntity jiankanghuodong){
       	EntityWrapper<JiankanghuodongEntity> ew = new EntityWrapper<JiankanghuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankanghuodong, "jiankanghuodong")); 
        return R.ok().put("data", jiankanghuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankanghuodongEntity jiankanghuodong){
        EntityWrapper< JiankanghuodongEntity> ew = new EntityWrapper< JiankanghuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankanghuodong, "jiankanghuodong")); 
		JiankanghuodongView jiankanghuodongView =  jiankanghuodongService.selectView(ew);
		return R.ok("查询健康活动成功").put("data", jiankanghuodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankanghuodongEntity jiankanghuodong = jiankanghuodongService.selectById(id);
		jiankanghuodong.setClicktime(new Date());
		jiankanghuodongService.updateById(jiankanghuodong);
        return R.ok().put("data", jiankanghuodong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankanghuodongEntity jiankanghuodong = jiankanghuodongService.selectById(id);
		jiankanghuodong.setClicktime(new Date());
		jiankanghuodongService.updateById(jiankanghuodong);
        return R.ok().put("data", jiankanghuodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankanghuodongEntity jiankanghuodong, HttpServletRequest request){
    	jiankanghuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankanghuodong);
        jiankanghuodongService.insert(jiankanghuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankanghuodongEntity jiankanghuodong, HttpServletRequest request){
    	jiankanghuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankanghuodong);
        jiankanghuodongService.insert(jiankanghuodong);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankanghuodongEntity jiankanghuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankanghuodong);
        jiankanghuodongService.updateById(jiankanghuodong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankanghuodongService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiankanghuodongEntity> wrapper = new EntityWrapper<JiankanghuodongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiankanghuodongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JiankanghuodongEntity jiankanghuodong, HttpServletRequest request,String pre){
        EntityWrapper<JiankanghuodongEntity> ew = new EntityWrapper<JiankanghuodongEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = jiankanghuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankanghuodong), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,JiankanghuodongEntity jiankanghuodong, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "fenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "jiankanghuodong").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<JiankanghuodongEntity> jiankanghuodongList = new ArrayList<JiankanghuodongEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                jiankanghuodongList.addAll(jiankanghuodongService.selectList(new EntityWrapper<JiankanghuodongEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<JiankanghuodongEntity> ew = new EntityWrapper<JiankanghuodongEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = jiankanghuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankanghuodong), params), params));
        List<JiankanghuodongEntity> pageList = (List<JiankanghuodongEntity>)page.getList();
        if(jiankanghuodongList.size()<limit) {
            int toAddNum = (limit-jiankanghuodongList.size())<=pageList.size()?(limit-jiankanghuodongList.size()):pageList.size();
            for(JiankanghuodongEntity o1 : pageList) {
                boolean addFlag = true;
                for(JiankanghuodongEntity o2 : jiankanghuodongList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    jiankanghuodongList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(jiankanghuodongList.size()>limit) {
            jiankanghuodongList = jiankanghuodongList.subList(0, limit);
        }
        page.setList(jiankanghuodongList);
        return R.ok().put("data", page);
    }






}
