package com.boy.boy.domin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Gril {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String cupSize;
	
	@Min(value = 18 , message = "未成年少女禁止入内")
	private Integer age;
	//先把数据插入，再转换
	@JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	
	private String love;
	
	@OneToOne
	@JoinColumn(name = "state_id")
	private GrilState grilState;
	
	public Gril(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public GrilState getGrilState() {
		return grilState;
	}

	public void setGrilState(GrilState grilState) {
		this.grilState = grilState;
	}

	@Override
	public String toString() {
		return "Gril [id=" + id + ", cupSize=" + cupSize + ", age=" + age + ", createTime=" + createTime + ", love="
				+ love + ", grilState=" + grilState + "]";
	}
	
	
}
