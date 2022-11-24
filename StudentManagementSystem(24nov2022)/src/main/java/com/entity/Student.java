
package com.entity; //creating a package
 
 //importing
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student { //declaring a class

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "student_first_name")
	private String firstName;

	@Column(name = "student_last_name")
	private String lastName;

	@Column(name = "student_email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private Course course;

//declaring a default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	} //end of the default constructor

	public Student(String firstName, String lastName, String email) { //declaring a parameterized constructor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	} //End of the parameterized constructor

//creating getter and setter method 
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
 
 //for toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", course=" + course + "]";
	} //end of toString
} //end of the class