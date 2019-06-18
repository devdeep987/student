package com.sprng.demo1.Controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprng.demo1.Entity.Student;
import com.sprng.demo1.Service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("studentServices1")
	StudentService studentService;
	
	@RequestMapping(value="/")
	public String getHomePage() {
    return "index";
	}
	@RequestMapping(value="/create")
	public String getHomePage1() {
    return "create";
	}
	@RequestMapping(value="/processForm")
	public String processform(@RequestParam String  studentName, @RequestParam String courseName, Model model) {
		Student s = new Student(studentName,courseName);
		int i =	studentService.createStudent(s);
			s = (Student)studentService.getStudentbyID(i);
			model.addAttribute("studentName", s.getName());
			model.addAttribute("course", s.getCourse());
		return "index";
	}
	@RequestMapping(value="/show")
	public String getHomePage2(Model model) {
		List<Student> student= studentService.fetchAll();
		//model.addAllAttributes(student);
		model.addAttribute("student", student);
    return "show";
	}
	@RequestMapping(value="/editStudent")
	public String getHomePage3(@RequestParam Integer id, Model model) {
		Student s = studentService.getStudentbyID(id);
		model.addAttribute("student", s);
    return "change";
	}
	@RequestMapping(value="/update")
	public String getHomePage4(@ModelAttribute Student student) {
		System.out.println(student.getId()+"  "+ student.getName()+" " +student.getCourse());
		studentService.updateStudent(student);
		return "redirect:/show";
	}
	@RequestMapping(value="/deleteStudent", method = RequestMethod.GET)
	public String getHomePage5(HttpServletRequest request) {
		int id= Integer.parseInt(request.getParameter("id"));	
		studentService.deleteStudentID(id);
			return "redirect:/show";
	}
	
	
}
  