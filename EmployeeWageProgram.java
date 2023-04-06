public class EmployeeWageProgram{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS_PER_MONTH = 20;
	
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Computation program");
	
	//UC4
	
	int empHrs = 0;
	int empWage = 0;
	int totalEmpWage = 0;
	
	for(int day =1; day<=WORKING_DAYS_PER_MONTH; day++){
	int empCheck = (int)Math.floor(Math.random()*10)%3;
	switch(empCheck){
	case IS_FULL_TIME:
		System.out.println("Employee is Full-time");
		empHrs = 8;
		break;
		
	case IS_PART_TIME:
		System.out.println("Employee is Part-time");
		empHrs = 4;
		break;
		
	default:
		System.out.println("Employee is Absent");
		empHrs = 0;
	}
	empWage = empHrs * WAGE_PER_HOUR;
	totalEmpWage += empWage;
	System.out.println("Employee at day-"+day+" daily Wage:" +empWage);
	}
	System.out.println("Total employee wage:" +totalEmpWage);
}
}