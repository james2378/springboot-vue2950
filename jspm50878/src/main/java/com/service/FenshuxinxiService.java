package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenshuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenshuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenshuxinxiView;


/**
 * 分数信息
 *
 * @author 
 * @email 
 * @date 2022-03-26 09:34:09
 */
public interface FenshuxinxiService extends IService<FenshuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenshuxinxiVO> selectListVO(Wrapper<FenshuxinxiEntity> wrapper);
   	
   	FenshuxinxiVO selectVO(@Param("ew") Wrapper<FenshuxinxiEntity> wrapper);
   	
   	List<FenshuxinxiView> selectListView(Wrapper<FenshuxinxiEntity> wrapper);
   	
   	FenshuxinxiView selectView(@Param("ew") Wrapper<FenshuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenshuxinxiEntity> wrapper);
   	

}

