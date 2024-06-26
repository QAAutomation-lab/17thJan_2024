package api.payload;
/*
 * POJO class is created for User
 */
public class User {
	
	int id;
	String username;
	String firstName;
	String lastName;
	String email;
	String password;
	String phone;
	int statuStatus=0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getStatuStatus() {
		return statuStatus;
	}
	public void setStatuStatus(int statuStatus) {
		this.statuStatus = statuStatus;
	}
}
