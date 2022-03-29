package com.rnd.CollegeFest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rnd.CollegeFest.dao.Studentdao;
import com.rnd.CollegeFest.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private Studentdao studentDao;

	@Override
	public boolean Add(Student S) {

		return studentDao.AddStudent(S);
	}

	@Override
	public boolean Upate(Student S) {
		return studentDao.UpdateStudent(S);
	}

	@Override
	public boolean Delete(int id) {
		return studentDao.DeleteStudent(id);
	}

	@Override
	public Student getbyStudentID(int id) {
		return studentDao.FindStudent(id);
	}

	@Override
	public List<Student> getAll() {
		return studentDao.ShowAllStudents();
	}

}
