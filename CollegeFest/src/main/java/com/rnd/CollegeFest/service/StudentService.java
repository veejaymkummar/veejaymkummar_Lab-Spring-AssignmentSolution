package com.rnd.CollegeFest.service;

import java.util.List;

import com.rnd.CollegeFest.entity.Student;

public interface StudentService {

	public boolean Add(Student S);

	public boolean Upate(Student S);

	public boolean Delete(int id);

	public Student getbyStudentID(int id);

	public List<Student> getAll();

}
