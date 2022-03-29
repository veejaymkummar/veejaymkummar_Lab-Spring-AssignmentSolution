package com.rnd.CollegeFest.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rnd.CollegeFest.entity.Student;

@Repository
public class StudentdaoImpl implements Studentdao {

	private SessionFactory sessionFactory;
	private Session session;

	@Autowired
	public StudentdaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();

		} catch (HibernateException exception) {
			session = sessionFactory.openSession();
		}
	}

	@Override
	public boolean AddStudent(Student s) {
		Transaction Txn = session.beginTransaction();
		session.save(s);
		Txn.commit();
		return true;
	}

	@Override
	public boolean UpdateStudent(Student s) {
		Transaction Txn = session.beginTransaction();
		session.merge(s);
		Txn.commit();
		return true;
	}

	@Override
	public boolean DeleteStudent(int id) {
		Transaction Txn = session.beginTransaction();
		Student S = session.get(Student.class, id);
		session.delete(S);
		Txn.commit();
		return true;
	}

	@Override
	public Student FindStudent(int id) {
		Student S = session.get(Student.class, id);
		return S;
	}

	@Override
	public List<Student> ShowAllStudents() {
		return session.createQuery("from Student", Student.class).getResultList();
	}

}
