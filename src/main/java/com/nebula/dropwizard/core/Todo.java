package com.nebula.dropwizard.core;

import nebula.define.Age;
import nebula.define.R;
import nebula.define.Title;
import nebula.define.YesNo;

public class Todo {
	YesNo completed;
	Title title;
	Age age;

	public Todo(YesNo completed, Title title, Age age) {
		super();
		this.completed = completed;
		this.title = title;
		this.age = age;
	}
	
	public void changeTitle(Title title){
		this.title = title;
	}

	public void changeCompleted(YesNo completed) {
		this.completed = completed;
		this.age = age.$plus(R.of(1));
	}
	
	public void delete(){
		
	}
}
