package com.citi.xzf.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public String execute() throws Exception {
		if(getUserName().equals("xzf")&&getPassWord().equals("fuck")){
			System.out.println("password correct");
			return SUCCESS;
		}
		else {
			System.out.println("invalide user!");
			return INPUT;
		}
		
		
	}

}
