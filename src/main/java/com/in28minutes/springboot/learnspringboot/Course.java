package com.in28minutes.springboot.learnspringboot;

public class Course {
	
private String port;
	private long id;
	private String hello;
	private String name;
	private String author;
	private String welcome;
	private String car;


	//Getters,ToString,Constructor
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	int i=10;

}
