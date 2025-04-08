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


import com.dao.FenshuxinxiDao;
import com.entity.FenshuxinxiEntity;
import com.service.FenshuxinxiService;
import com.entity.vo.FenshuxinxiVO;
import com.entity.view.FenshuxinxiView;

@Service("fenshuxinxiService")
public class FenshuxinxiServiceImpl extends ServiceImpl<FenshuxinxiDao, FenshuxinxiEntity> implements FenshuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenshuxinxiEntity> page = this.selectPage(
                new Query<FenshuxinxiEntity>(params).getPage(),
                new EntityWrapper<FenshuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenshuxinxiEntity> wrapper) {
		  Page<FenshuxinxiView> page =new Query<FenshuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenshuxinxiVO> selectListVO(Wrapper<FenshuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenshuxinxiVO selectVO(Wrapper<FenshuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenshuxinxiView> selectListView(Wrapper<FenshuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenshuxinxiView selectView(Wrapper<FenshuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
