package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NianjibanjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NianjibanjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NianjibanjiView;


/**
 * 年级班级
 *
 * @author 
 * @email 
 * @date 2022-03-26 09:34:09
 */
public interface NianjibanjiService extends IService<NianjibanjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NianjibanjiVO> selectListVO(Wrapper<NianjibanjiEntity> wrapper);
   	
   	NianjibanjiVO selectVO(@Param("ew") Wrapper<NianjibanjiEntity> wrapper);
   	
   	List<NianjibanjiView> selectListView(Wrapper<NianjibanjiEntity> wrapper);
   	
   	NianjibanjiView selectView(@Param("ew") Wrapper<NianjibanjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NianjibanjiEntity> wrapper);
   	

}

