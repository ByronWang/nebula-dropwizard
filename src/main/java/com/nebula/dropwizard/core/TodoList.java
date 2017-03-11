package com.nebula.dropwizard.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import nebula.define.Title;
import nebula.define.YesNo;

import static nebula.define.R.of;

public class TodoList {
	List<Todo> todos;

	public TodoList() {
		todos = new ArrayList<>();
	}

	public List<Todo> getAll() {
		return todos;
	}

	public List<Todo> getCompleted(YesNo completed) {
		return todos.stream().filter(todo -> todo.completed == completed).collect(Collectors.toList());
	}

	public void newTodo(Title title) {
		Todo todo = new Todo(YesNo.Yes, title, of(0));
		todos.add(todo);
	}

	public void changeTodoTitle(int index, Title title) {
		todos.get(index).changeTitle(title);
	}

	public Todo getTodo(int index) {
		return todos.get(index);
	}

	public void deleteTodo(int index) {
		todos.get(index).delete();
	}

	public void changeStatus(int index, YesNo completed) {
		todos.get(index).changeCompleted(completed);
	}
}
