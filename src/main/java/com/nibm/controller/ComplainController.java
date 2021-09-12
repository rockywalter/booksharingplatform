package com.nibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nibm.model.Complain;
import com.nibm.repository.ComplainService;

@RestController
public class ComplainController {

	@Autowired
	ComplainService complainservice;
	
	@RequestMapping("/cpmplains")
	public List<Complain> getComplains()
	{
		return complainservice.findAll();
		
	}
	
	@PostMapping("/cpmplain")
	public Complain addComplain(@RequestBody Complain complain)
	{
		return complainservice.addOrUpdateComplain(complain);
		
	}
	
	
	@DeleteMapping("/cpmplain/{id}")
	public void deleteComplain(@PathVariable int id)
	{
		complainservice.deleteComplain(id);
		
	}
	
	
	@RequestMapping("webcomplains")
	public ModelAndView webcomplains()
	{
		ModelAndView mv =new ModelAndView();
		mv.addObject("complainlist",complainservice.findAll());	
		mv.setViewName("complains");
		return mv;
		
	}
	
	
	@RequestMapping("deletecomplain")
	public ModelAndView deletecomplain(int id)
	{
		complainservice.deleteComplain(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("complainlist",complainservice.findAll());	
		mv.setViewName("complains");
		return mv;
		
	}
	
	@RequestMapping("updatecomplainform")
	public ModelAndView updatecomplainform(int id)
	{
		ModelAndView mv =new ModelAndView();
		mv.addObject("complainlist",complainservice.getComplain(id));	
		mv.setViewName("updatecomplainform");
		return mv;
		
	}
	
	@RequestMapping("updatecomplainweb")
	public ModelAndView updatecomplainweb(Complain complain)
	{
		complainservice.addOrUpdateComplain(complain);
		ModelAndView mv =new ModelAndView();
		mv.addObject("complainlist",complainservice.findAll());	
		mv.setViewName("complains");
		return mv;
		
	}
	
}
