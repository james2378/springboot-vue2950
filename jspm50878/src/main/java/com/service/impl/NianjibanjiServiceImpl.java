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


import com.dao.NianjibanjiDao;
import com.entity.NianjibanjiEntity;
import com.service.NianjibanjiService;
import com.entity.vo.NianjibanjiVO;
import com.entity.view.NianjibanjiView;

@Service("nianjibanjiService")
public class NianjibanjiServiceImpl extends ServiceImpl<NianjibanjiDao, NianjibanjiEntity> implements NianjibanjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NianjibanjiEntity> page = this.selectPage(
                new Query<NianjibanjiEntity>(params).getPage(),
                new EntityWrapper<NianjibanjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NianjibanjiEntity> wrapper) {
		  Page<NianjibanjiView> page =new Query<NianjibanjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NianjibanjiVO> selectListVO(Wrapper<NianjibanjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NianjibanjiVO selectVO(Wrapper<NianjibanjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NianjibanjiView> selectListView(Wrapper<NianjibanjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NianjibanjiView selectView(Wrapper<NianjibanjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
