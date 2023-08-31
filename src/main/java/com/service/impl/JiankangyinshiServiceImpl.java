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


import com.dao.JiankangyinshiDao;
import com.entity.JiankangyinshiEntity;
import com.service.JiankangyinshiService;
import com.entity.vo.JiankangyinshiVO;
import com.entity.view.JiankangyinshiView;

@Service("jiankangyinshiService")
public class JiankangyinshiServiceImpl extends ServiceImpl<JiankangyinshiDao, JiankangyinshiEntity> implements JiankangyinshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangyinshiEntity> page = this.selectPage(
                new Query<JiankangyinshiEntity>(params).getPage(),
                new EntityWrapper<JiankangyinshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangyinshiEntity> wrapper) {
		  Page<JiankangyinshiView> page =new Query<JiankangyinshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangyinshiVO> selectListVO(Wrapper<JiankangyinshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangyinshiVO selectVO(Wrapper<JiankangyinshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangyinshiView> selectListView(Wrapper<JiankangyinshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangyinshiView selectView(Wrapper<JiankangyinshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
