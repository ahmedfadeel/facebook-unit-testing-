package model;

public class User {
   private String FirstName;
   private String lastName;
   private String Email ;
   private UserDetail userDetail ;
public User() {
}   
public User(String firstName, String lastName, String email, UserDetail userDetail) {
	super();
	FirstName = firstName;
	this.lastName = lastName;
	Email = email;
	this.userDetail = userDetail;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public UserDetail getUserDetail() {
	return userDetail;
}

public void setUserDetail(UserDetail userDetail) {
	this.userDetail = userDetail;
}
   
   
	

}
