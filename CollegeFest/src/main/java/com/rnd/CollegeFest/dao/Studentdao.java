package com.rnd.CollegeFest.dao;

import java.util.List;

import com.rnd.CollegeFest.entity.Student;

public interface Studentdao {
	public boolean AddStudent(Student s);

	public boolean UpdateStudent(Student s);

	public boolean DeleteStudent(int id);

	public Student FindStudent(int id);

	public List<Student> ShowAllStudents();

}
