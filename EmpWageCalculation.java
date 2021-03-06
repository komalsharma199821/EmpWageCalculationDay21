

public class EmpWageCalculation {
	
	//declaring the class variables(use case 7)
	   static int MAX_WORKING_DAYS = 20;
       static int MAX_WORKING_HOURS = 100;
       static int EMPLOYEE_PER_HOUR_WAGE = 20;
      
    //use case 1
   public static int generateRandomNumber(){
        double x=Math.random();
       int y = (int) Math.round(x);
       return y;
   }
   
   public static String presenteeCheckForEmployee(int value){
       if(value==1){
           return "Employee is Present" ;
       }else{
           return "Employee is Absent" ;
       }}
   //use case 2
    public static int calculateEmpDailyWage( int wagePerHour, int workingHrs ){
       return ( wagePerHour * workingHrs );
   }

    //use case 3
    public static String calculateWageCalculationForPartTimeEmps (){
       
       int random = generateRandomNumber();
       int wagePerHour = 20;
       int partTimeEmpWage = 0;
       if(random ==1 ){
           partTimeEmpWage = (random+8) * 20 * wagePerHour;//20 being the number of days in a month
           return "Employee is a Part Time Employee and the wage is :"+partTimeEmpWage;
       }else{
           return "Employee is not a Part Time Employee ";
       }
   }

    //use case 4
	public static int generateWorkHours ( int randomValue ){
       int workingHours = 0;
       switch (randomValue){
           case 0: 
                workingHours = 4;
               break;
           case 1 :
                workingHours = 3;
               break;
           case 2:
               workingHours = 5;
               break;
           case 3:
               workingHours = 10;
               break;
       }
       return workingHours;
   }
   
   public static int generateRandomWorkDays ( int randomValue ) {
       int workingDays = 0;
       switch (randomValue){
           case 0: 
                workingDays = 20;
               break;
           case 1 :
                workingDays = 8;
               break;
           case 2:
               workingDays = 5;
               break;
           case 3:
               workingDays = 1;
               break;
       }
       return workingDays;
   }
   //use case 5
	public static int calculateMonthlyWage (int wagePerHour,int randomWorkingHrs ){
       
       int empMonthlyWage = randomWorkingHrs * 20 * wagePerHour;//20 being the umber of days in a month
       return empMonthlyWage;
   }
   //use case 6
	//calculation till the condition of 100 working Hours and 20 working days is reached
    //use case 7
	//the class method for calculating the emp wage
   public static int conditionalEmpWageCalculational(){
       
       int totalWorkingDays = 0;
       int totalWorkingHrs = 0;
       int EMP_WORK_HOURS = 0;
       int EMP_WORK_DAYS = 0;
       int oldWage = 0;
       
       int value = 0;
       int empWage = 0;
       
       while ( (EMP_WORK_HOURS < MAX_WORKING_HOURS) || (EMP_WORK_DAYS < MAX_WORKING_DAYS) ){
           
           value = generateRandomNumber();
           
           totalWorkingDays = generateRandomWorkDays(value+1);
           totalWorkingHrs = generateWorkHours(value+1); 
           
           empWage = oldWage + (totalWorkingDays * totalWorkingHrs * EMPLOYEE_PER_HOUR_WAGE);
           oldWage = empWage;
           
           EMP_WORK_HOURS = EMP_WORK_HOURS + totalWorkingHrs;
           EMP_WORK_DAYS = EMP_WORK_DAYS + totalWorkingDays;
           
       }
       
       return empWage;
   }

   public static void main(String args[]) {
     
     System.out.println("Welcome To Employee Wage Calculation Problem");
     // use case 1
     int randomValue = generateRandomNumber();
     
     String presenteeCheck = presenteeCheckForEmployee(randomValue);
     System.out.println("Is Employee Present ? "+presenteeCheck);
     
     //use case 2
	  int empDailyWage = calculateEmpDailyWage(20,8);
     System.out.println("Employees Daily Wage : "+empDailyWage);

     //use case 3
     String wageForPartTimeEmp = calculateWageCalculationForPartTimeEmps();
     System.out.println("Employees Part Time Wage : "+wageForPartTimeEmp);

     //use case 4
	  int randomWorkHrs = generateWorkHours(randomValue+2);
     System.out.println("Randomly generated Work Hours is : "+randomWorkHrs);
   
     //use case 5
	  int empMonthlyWage = calculateMonthlyWage(20,randomWorkHrs);
     System.out.println("Monthly Wage Of an Employee is : "+empMonthlyWage);

     //use case 6
	  int conditionalEmpWageCalculated = conditionalEmpWageCalculational();
     System.out.println("The Conditional Wage Of an Employee is : "+conditionalEmpWageCalculated);
     
     //usecase 7
     int conditionalEmpWageCalculatedForUC7 = conditionalEmpWageCalculational();
     System.out.println("The Conditional Wage Of an Employee for uc7 is : "+conditionalEmpWageCalculatedForUC7);
   }
}
