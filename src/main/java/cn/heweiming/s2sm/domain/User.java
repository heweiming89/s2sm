package cn.heweiming.s2sm.domain;

import java.util.Date;

public class User {

	private Integer id;
	private String userId;
	private String username;
	private String password;
	private int age;
	private char gender;
	private Date birthday;
	public int getAge() {
		return age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public char getGender() {
		return gender;
	}
	public Integer getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", username=" + username
				+ ", password=" + password + ", age=" + age + ", gender=" + gender
				+ ", birthday=" + birthday + "]";
	}
	
	
	
}
