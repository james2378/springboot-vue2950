package com.entity.model;

import com.entity.FenshuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 分数信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 09:34:09
 */
public class FenshuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 年级班级
	 */
	
	private String nianjibanji;
		
	/**
	 * 成绩分数
	 */
	
	private Float chengjifenshu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：年级班级
	 */
	 
	public void setNianjibanji(String nianjibanji) {
		this.nianjibanji = nianjibanji;
	}
	
	/**
	 * 获取：年级班级
	 */
	public String getNianjibanji() {
		return nianjibanji;
	}
				
	
	/**
	 * 设置：成绩分数
	 */
	 
	public void setChengjifenshu(Float chengjifenshu) {
		this.chengjifenshu = chengjifenshu;
	}
	
	/**
	 * 获取：成绩分数
	 */
	public Float getChengjifenshu() {
		return chengjifenshu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
