package com.rnd.CollegeFest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rnd.CollegeFest.entity.Student;
import com.rnd.CollegeFest.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String getAllStudents(Model model) {
		List<Student> student = studentService.getAll();
		model.addAttribute("Students", student);
		return "home";
	}

	@RequestMapping("/SaveStudent")
	public String ShowSaveStudentPage() {
		return "SaveStudent";
	}

	@RequestMapping("/StudSave")
	public String SaveStudent(Student student, Model model) {
		if (studentService.Add(student)) {
			List<Student> s = studentService.getAll();
			model.addAttribute("Students", s);
			return "home";
		} else {
			return "SaveStudent";
		}

		
	}

	@RequestMapping("/OneStudent")
	public String getOneStudent(@RequestParam("id") int id, Model model) {
		Student student = studentService.getbyStudentID(id);
		model.addAttribute("student", student);
		return "UpdateStudent";
	}

	@RequestMapping("/StudUpdate")
	public String UpdateStudent(Student student, Model model) {
		if (studentService.Upate(student)) {
			List<Student> s = studentService.getAll();
			model.addAttribute("Students", s);
			return "home";
		} else {
			return "OneStudent";
		}

	}

	@RequestMapping("/DeleteStudent")
	public String DelStudent(@RequestParam("id") int id, Model model) {
		if (studentService.Delete(id)) {
			List<Student> s = studentService.getAll();
			model.addAttribute("Students", s);
			return "home";
		} else {
			List<Student> s = studentService.getAll();
			model.addAttribute("Students", s);
			return "home";
		}
	}
	@RequestMapping("/403")
	public String AccessDenied()
	{
		return "403";
	}
}
