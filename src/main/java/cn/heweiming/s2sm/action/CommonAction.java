package cn.heweiming.s2sm.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionContext;

public class CommonAction extends CouplingActionWrapper {

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	private static final long serialVersionUID = 8945832758158793164L;

	private String test;

	private String userId;
	private String username;
	private String password;
	private char gender;
	private int age;
	private Date birthday;

	public CommonAction() {
		System.out.println("CommonAction.CommonAction()");
	}

	@Override
	public String execute() throws Exception {
		System.out.println("CommonAction.execute()");
		setTest("432142314");
		return SUCCESS;
	}

	public String common() throws Exception {

		// setTest("test test");
		requestMap.put("test1", "test1 test1");
		ActionContext actionContext = ActionContext.getContext();
		ActionContext actCtx = ActionContext.getContext();
		actionContext.put("test2", "test2 test24444444");
		actCtx.put("test3", "fdsafs");

		return SUCCESS;
	}

	public String common2() throws Exception {
		return SUCCESS;
	}

	public String common3() throws Exception {
		return SUCCESS;
	}

	public String form() throws Exception {
		return SUCCESS;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
