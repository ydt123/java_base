package com.school;
//POJO
public class Course {
	private String course_id;
	private String course_name;
	private String course_book;
	
	//3对getter setter方法
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_book() {
		return course_book;
	}
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}
	
	//定义有参的构造方法：
	public Course(String course_id, String course_name, String course_book) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_book = course_book;
	}
	
	//定义无参的构造方法：
	public Course() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	
}
