public class EmployeeWageProgram{
	
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Computation program");
	
	int IS_ABSENT = 0;
	int empCheck = (int)Math.floor(Math.random()*10)%2;
	if(empCheck == IS_ABSENT){
    System.out.println("Emploee is Absent");
	}else{
    System.out.println("Emploee is Present");
	}
}
}