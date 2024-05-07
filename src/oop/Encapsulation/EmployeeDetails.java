package oop.Encapsulation;

public class EmployeeDetails {
	//encapsulation data and function
	//data
   private int id=101;
   private String name="Sarang";
  /*
   * to provide access to the data 
   * we need getter and setter method*/
    //method
    public void Display()
     {
    System.out.println("Employee id is: " +id);	
    System.out.println("Employee name is: "+name  );
    }
	
	//getter and setter method
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		EmployeeDetails e1 =new EmployeeDetails();
				e1.Display();  

	}

}
