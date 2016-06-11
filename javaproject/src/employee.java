
public class employee {
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
