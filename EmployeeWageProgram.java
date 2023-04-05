public class EmployeeWageProgram{
	
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Computation program");
	
	//UC2
	int IS_FULL_TIME = 1;
	int WAGE_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;
	int empCheck = (int)Math.floor(Math.random()*10)%2;
	if(empCheck == IS_FULL_TIME){
		System.out.println("Employee is Present");
		empHrs = 8;
	}else{
		System.out.println("Employee is Absent");
		empHrs = 0;
	}
		
	empWage = empHrs * WAGE_PER_HOUR;
	System.out.println("Employee Daily Wage:" +empWage);
}
}