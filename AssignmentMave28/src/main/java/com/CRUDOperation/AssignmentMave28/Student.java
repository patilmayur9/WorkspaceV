package com.CRUDOperation.AssignmentMave28;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/
import javax.persistence.*;

@Entity
@Table(name="StudentInformation")
public class Student 
{
	 
		@Id	
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="StudentId")
		int id;
		
		@Column(name="FName")
		String fName;
		
		@Column (name="LName")
		String lName;
		
		@Column (name="SchoolName")
		String sName;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", sName=" + sName + "]";
		}
		
	 
}
