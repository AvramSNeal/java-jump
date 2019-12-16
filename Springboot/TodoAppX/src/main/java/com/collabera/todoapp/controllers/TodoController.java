package com.collabera.todoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.collabera.todoapp.services.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService service;
	
	@RequestMapping(value="/listtodos", method = RequestMethod.GET)
	public String listTodos(ModelMap model) {
		
		model.put("todos", service.listTodos("vijay"));
		
		return "listtodos";
	}
}
