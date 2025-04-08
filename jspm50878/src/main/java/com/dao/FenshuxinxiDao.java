package com.dao;

import com.entity.FenshuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenshuxinxiVO;
import com.entity.view.FenshuxinxiView;


/**
 * 分数信息
 * 
 * @author 
 * @email 
 * @date 2022-03-26 09:34:09
 */
public interface FenshuxinxiDao extends BaseMapper<FenshuxinxiEntity> {
	
	List<FenshuxinxiVO> selectListVO(@Param("ew") Wrapper<FenshuxinxiEntity> wrapper);
	
	FenshuxinxiVO selectVO(@Param("ew") Wrapper<FenshuxinxiEntity> wrapper);
	
	List<FenshuxinxiView> selectListView(@Param("ew") Wrapper<FenshuxinxiEntity> wrapper);

	List<FenshuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FenshuxinxiEntity> wrapper);
	
	FenshuxinxiView selectView(@Param("ew") Wrapper<FenshuxinxiEntity> wrapper);
	

}
