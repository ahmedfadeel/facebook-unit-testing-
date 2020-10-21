package model;

public class UserDetail {
   private String userName;
   private String password ;
   private boolean isActive ;
public UserDetail(String userName, String password, boolean isActive) {
	super();
	this.userName = userName;
	this.password = password;
	this.isActive = isActive;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
   
   
}
