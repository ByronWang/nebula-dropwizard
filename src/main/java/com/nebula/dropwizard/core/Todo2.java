package com.nebula.dropwizard.core;

import nebula.define.Title;
import nebula.define.YesNo;

public class Todo2 {
	YesNo completed;
	Title title;

	public Todo2(YesNo completed, Title title) {
		super();
		this.completed = completed;
		this.title = title;
	}

	public void changeCompleted(YesNo completed) {
		this.setCompleted(completed);
	}

	public void changeTitle(Title title){
		this.setTitle(title);
	}

	public void delete(){
		
	}

	public YesNo getCompleted() {
		return completed;
	}
	
	public Title getTitle() {
		return title;
	}

	public void setCompleted(YesNo completed) {
		this.completed = completed;
	}
	
	public void setTitle(Title title) {
		this.title = title;
	}
}
