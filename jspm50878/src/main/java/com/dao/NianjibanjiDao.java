package com.dao;

import com.entity.NianjibanjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NianjibanjiVO;
import com.entity.view.NianjibanjiView;


/**
 * 年级班级
 * 
 * @author 
 * @email 
 * @date 2022-03-26 09:34:09
 */
public interface NianjibanjiDao extends BaseMapper<NianjibanjiEntity> {
	
	List<NianjibanjiVO> selectListVO(@Param("ew") Wrapper<NianjibanjiEntity> wrapper);
	
	NianjibanjiVO selectVO(@Param("ew") Wrapper<NianjibanjiEntity> wrapper);
	
	List<NianjibanjiView> selectListView(@Param("ew") Wrapper<NianjibanjiEntity> wrapper);

	List<NianjibanjiView> selectListView(Pagination page,@Param("ew") Wrapper<NianjibanjiEntity> wrapper);
	
	NianjibanjiView selectView(@Param("ew") Wrapper<NianjibanjiEntity> wrapper);
	

}
