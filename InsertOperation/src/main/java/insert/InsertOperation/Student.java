package insert.InsertOperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//this is for maping of database to student class for database table
@Table(name="Student")//this gives the table name in database
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="StudentId")
	int id;
	
	@Column(name="FirstName")
	String firstName;
	
	@Column(name="LastName")
	String lastName;
	
	//if we not declare column annotation databse take column name asit is variable name
	String city;
	String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
