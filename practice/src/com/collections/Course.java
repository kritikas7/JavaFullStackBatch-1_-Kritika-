package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class Course {
		Integer id;
		String name;
		Double fee;
		public Course(Integer id, String name, Double fee) {
			super();
			this.id = id;
			this.name = name;
			this.fee = fee;
		}
		@Override
		public String toString() {
			return "Course1 [id=" + id + ", name=" + name + ", fee=" + fee + "]";
		}
interface CourseService{
	String addCourse1(Course c);
	String deleteCourse1(Integer cid);
	String UpdateCourse1(Integer cid);
	 List<Course> listCourses();
}
 class CourseServiceImpl implements CourseService{
	List<Course> courseList =new ArrayList<>{
	
	public String addCourse(Course c) {
		courseList.add(c);
		return "Course added succesfully";
	}
	public String deleteCourse(Integer cid) {
		return "ok";
	}
	public String updateCourse(Integer cid) {
		return "ok";
	}
	public List<Course> listCourses() {
		return courseList;
	}
}
	public class CourseDemo{
		public static void main(String args[]) {
			Course c1=new Course(30,"React",5000.00);
			Course c2=new Course(40,"Angular",5000.00);
			CourseService cs=new CourseServiceImpl();
			System.out.println(cs.addCourse1(c1));
			System.out.println(cs.addCourse1(c2));
			List<Course> returnedList=cs.listCourses();
			for( Course c: returnedList)
				System.out.println(c);
		}
	}
		
	}

		

