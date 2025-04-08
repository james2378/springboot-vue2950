package com.entity.view;

import com.entity.FenshuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 分数信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 09:34:09
 */
@TableName("fenshuxinxi")
public class FenshuxinxiView  extends FenshuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FenshuxinxiView(){
	}
 
 	public FenshuxinxiView(FenshuxinxiEntity fenshuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fenshuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
