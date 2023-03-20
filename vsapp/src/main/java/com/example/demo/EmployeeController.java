package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDAO dao;
Logger log=Logger.getAnonymousLogger();
	@RequestMapping("/")
	public ModelAndView displaydefaultpage(HttpServletRequest request,HttpServletResponse response)
	{
		log.info("entered into the request mapping /");
		ModelAndView mv=new ModelAndView();
		log.info("going to index.jsp");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpname(request.getParameter("empname"));
		e.setEmpemail(request.getParameter("empemail"));
		e.setAge(Integer.parseInt(request.getParameter("age")));
		Employee ee=dao.insert(e);
		if(ee!=null) {
			mv.setViewName("success");
		}

		return mv;
	}



	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		List<Employee> list= dao.getall();
		mv.setViewName("display");
		mv.addObject("list",list);

		return mv;
	}
}
