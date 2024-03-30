package com.collection;

public class Eemployee {
	 
		int id;
		String name;
		String salary;
		
		public Eemployee(int id, String name, String salary){
			 this.id=id;
			 this.name=name;
			 this.salary=salary;
		 }
		
		public int getid()
		{
			return id;
		}
		public void setid(int id)
		{
			this.id=id;
		}
		public String getname()
		{
			return name;
		}
		public void setname(String name)
		{
			this.name=name;
		}
		public String get()
		{ 
			return salary;
		}
		public void setsalary(String salary)
		{
			this.salary=salary;
		}

		@Override
		public String toString() {
			return "Eemployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
	 

}
