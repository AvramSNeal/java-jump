package com.collabera.todoapp.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.todoapp.model.Todo;


@Service
public class TodoService {
	
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(1, "Shopping", "Vijay", new Date(), false));
		todos.add(new Todo(2, "Study", "Vijay", new Date(), false));
		todos.add(new Todo(3, "Run", "Vijay", new Date(), false));
	}

	public List<Todo> listTodos(String user) {
		return todos;
	}
}
