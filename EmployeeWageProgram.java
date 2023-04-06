public class EmployeeWageProgram{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS_PER_MONTH = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Computation program");
	
	//UC6
	
	int empHrs = 0;
	int empWage = 0;
	int totalEmpWage = 0;
	int totalEmpHrs = 0;
	int totalWorkingDays = 0;
	
	while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<WORKING_DAYS_PER_MONTH){
		totalWorkingDays++;
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
	totalEmpHrs += empHrs;
	System.out.println("Day#:" +totalWorkingDays + "Emp Hr: " +empHrs);
	
	}
	totalEmpWage = totalEmpHrs * WAGE_PER_HOUR;
	System.out.println("Total employee wage:" +totalEmpWage);
}
}