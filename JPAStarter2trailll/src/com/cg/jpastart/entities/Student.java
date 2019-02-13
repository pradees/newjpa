package com.cg.jpastart.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="students1")
public class Student implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	
	private String student_name;
	private String Address;
	private String city;
	private int cs_marks;
	private int physics_marks;
	private int total;
	public void  getsum(int cs_marks ,int physics_marks)
	{
		//return cs_marks+physics_marks;
		total=cs_marks+physics_marks;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal() {
		return total;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getStudent_name() {
		return student_name;
	}
	public String getAddress() {
		return Address;
	}
	public String getCity() {
		return city;
	}
	public int getCs_marks() {
		return cs_marks;
	}
	public int getPhysics_marks() {
		return physics_marks;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCs_marks(int cs_marks) {
		this.cs_marks = cs_marks;
	}
	public void setPhysics_marks(int physics_marks) {
		this.physics_marks = physics_marks;
	}

	
	
	
}
