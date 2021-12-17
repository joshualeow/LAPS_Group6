package sg.com.laps.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotEmpty;




@Entity
@Table(name="AllUsers")//, uniqueConstraints = {@UniqueConstraint(name="user_id_unique",columnNames = {"theuserid"})
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "theuserid",  nullable = false)//, unique = true)
	private String userId;
	
	@NotEmpty
	@Column(name = "name")
	private String name;
	@NotEmpty
	@Column(name = "password")
	private String password;
	@Column(name = "employeeid")
	private String employeeId;
	
//	private List<Role> role;
//	@NotEmpty
//	@Column(name = "firstname")
//	private String firstName;
//	
//	@Column(name = "secondname")
//	private String secondName;
//	
//	@NotEmpty
//	@Column(name = "lastname")
//	private String lastNamel;
//	
//	@Column(name = "emailaddress")
//	private String emailAddress;

	
//	@ManyToMany(targetEntity = Employee.class, cascade = {CascadeType.ALL, CascadeType.PERSIST}, fetch=FetchType.EAGER)
//	@JoinTable(name = "AllUsers", joinColumns = {
//			@JoinColumn(name = "theuserid", referencedColumnName = "theuserId") }, inverseJoinColumns = {
//					@JoinColumn(name = "roleId", referencedColumnName = "roleId") }
//	)
	
	
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getSecondName() {
//		return secondName;
//	}
//	public void setSecondName(String secondName) {
//		this.secondName = secondName;
//	}
//	public String getLastNamel() {
//		return lastNamel;
//	}
//	public void setLastNamel(String lastNamel) {
//		this.lastNamel = lastNamel;
//	}
//	public String getEmailAddress() {
//		return emailAddress;
//	}
//	public void setEmailAddress(String emailAddress) {
//		this.emailAddress = emailAddress;
//	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	


	public User(String userId, String name, String password, String employeeId) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.employeeId = employeeId;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
