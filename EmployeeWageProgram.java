public class EmployeeWageProgram{
	
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Computation program");
	
	//UC4
	int IS_FULL_TIME = 1;
	int IS_PART_TIME = 2;
	int WAGE_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;
	int empCheck = (int)Math.floor(Math.random()*10)%3;
	switch(empCheck){
	case 1:
		System.out.println("Employee is Full-time");
		empHrs = 8;
		break;
		
	case 2:
		System.out.println("Employee is Part-time");
		empHrs = 4;
		break;
		
	default:
		System.out.println("Employee is Absent");
		empHrs = 0;
	}
		
	empWage = empHrs * WAGE_PER_HOUR;
	System.out.println("Employee Daily Wage:" +empWage);
}
}