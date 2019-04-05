package jdbcdemo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	//Attributes
	@Id
	@Column(name="employee_Id")
	 int employeeId;     
	@Column(name="first_name")
	 String firstName;      
	@Column(name="last_name")
	 String lastName;  
	
	//no-arg constructor
	
	public Employee(){
		
	}
	
	//args constructor
	
	public Employee(int employeeId, String firstName, String lastName) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//getters and setters

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
}
