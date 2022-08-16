package com.java.jpa.employeee;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="employeeee")
public class EmployeeEntry {


	  @Id

	  private int e_id;

	  private String e_name;

	  private String e_desig;
	  
	  private int e_sal;
	  

	  public EmployeeEntry(int e_id, String e_name, String e_desig, int e_sal) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_desig = e_desig;
		this.e_sal = e_sal;
	}
	  public EmployeeEntry() {

		    super();

		  }

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_desig() {
		return e_desig;
	}

	public void setE_desig(String e_desig) {
		this.e_desig = e_desig;
	}

	public int getE_sal() {
		return e_sal;
	}

	public void setE_sal(int e_sal) {
		this.e_sal = e_sal;
	}





}
