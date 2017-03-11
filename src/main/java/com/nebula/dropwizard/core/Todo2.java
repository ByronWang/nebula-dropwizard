package com.nebula.dropwizard.core;

import java.util.Optional;

import nebula.define.Age;
import nebula.define.R;
import nebula.define.Title;
import nebula.define.YesNo;

public class Todo2 {
	YesNo completed;
	Title title;
	Age age;

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Todo2(YesNo completed, Title title, Age age) {
		super();
		this.completed = completed;
		this.title = title;
		this.age = age;
	}

	public void changeCompleted(YesNo completed) {
		this.setCompleted(completed);
		this.setAge(this.getAge().$plus(R.of(1)));
	}

	public void changeTitle(Title title) {
		this.setTitle(title);
	}

	public void delete() {

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
