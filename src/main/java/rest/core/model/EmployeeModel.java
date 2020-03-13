package rest.core.model;

public class EmployeeModel {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String fullName;
	private String employementType;
	private boolean deleted;
	
	public EmployeeModel() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeModel(String firstName, String lastName, String fullName, String employementType, boolean deleted) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.employementType = employementType;
		this.deleted = deleted;
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmployementType() {
		return employementType;
	}
	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
