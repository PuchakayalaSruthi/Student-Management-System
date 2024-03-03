package com.psr.spring;

public class Student {
	private int id;
	private String name;
	private String email;
	private  String branch;
	private String  address;
	private String phoneno; 
	
	public Student() {}
	
	public Student(int id,String name, String email, String branch, String address, String phoneno) {
		super();
		this.id= id;
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.address = address;
		this.phoneno = phoneno;
	}

	public Student(String name, String email, String branch, String address, String phoneno) {
		super();
		
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.address = address;
		this.phoneno = phoneno;
	}
	


	public int getId() {
		return id;
	}

	
	 public void setId(int id) {
			this.id = id;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", branch=" + branch + ", address="
				+ address + ", phoneno=" + phoneno + "]";
	}
	

	
	
	
	

}
