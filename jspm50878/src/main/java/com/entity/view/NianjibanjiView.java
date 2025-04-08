package com.entity.view;

import com.entity.NianjibanjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 年级班级
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 09:34:09
 */
@TableName("nianjibanji")
public class NianjibanjiView  extends NianjibanjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NianjibanjiView(){
	}
 
 	public NianjibanjiView(NianjibanjiEntity nianjibanjiEntity){
 	try {
			BeanUtils.copyProperties(this, nianjibanjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
