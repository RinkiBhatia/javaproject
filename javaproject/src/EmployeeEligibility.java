class employee {
int age;
public employee(int age){
	this.age=age;
	
}
public boolean isEligibleToWork() throws Exception
{ if(age>18)
{return true;

}
else{
	throw new Exception("Age is small to work");
	
}
	}
}
public class EmployeeEligibility {

	public static void main(String[] args) {
    employee emp=new employee(21);
	try{
		if(emp.isEligibleToWork())
		{System.out.println("Eligible to work");
		
		}
	}
		catch(Exception excep)
	{System.out.println(excep);
	}
	}

}
