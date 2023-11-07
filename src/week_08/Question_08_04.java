package week_08;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        //Compute the weekly hours for each employee
        int [][]  workingHoursOfEmployee = getTheEmployeesAndWorkingHours();
       int [] totalWorkHours =  getTotalWorkHoursOfWorkers(workingHoursOfEmployee);
        listInDecreasingOrderOfEmployees(totalWorkHours);

    }
    public static  int[][] getTheEmployeesAndWorkingHours(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number,please : ");
        int numberOfEmployeeIs = input.nextInt();
        int dayIs = 7 ;
        int [][] workingHoursOfEmployee = new int[numberOfEmployeeIs][dayIs];

        System.out.println("Enter the working hours of employees : ");
        for (int employees = 0; employees < numberOfEmployeeIs; employees++) {
            for (int days = 0; days < dayIs; days++) {
                workingHoursOfEmployee[employees][days]=input.nextInt();
            }

        }
return workingHoursOfEmployee;
        }

        public static int [] getTotalWorkHoursOfWorkers(int [][]  workingHoursOfEmployee){
        int [] totalWorkHours =new int[workingHoursOfEmployee.length];

            for (int employee = 0; employee < workingHoursOfEmployee.length; employee++) {
                int totalWorkHourForThisEmployee = 0;
                for (int day = 0; day < workingHoursOfEmployee[employee].length; day++) {
                   totalWorkHourForThisEmployee += workingHoursOfEmployee[employee][day];

                }
                totalWorkHours[employee] = totalWorkHourForThisEmployee;
            }
return  totalWorkHours;
        }
        public static void listInDecreasingOrderOfEmployees(int [] totalWOrkHours){
        int [] employees = new int [totalWOrkHours.length];

        //Employee numbers for sorting
            for (int i = 0; i <employees.length; i++) {
                employees[i]=i;
            }

            for (int i = 0; i < totalWOrkHours.length-1; i++) {
                int currentMax = totalWOrkHours[i];
                int currentMaxIndex = i ;
                int indexOfMAxEmployee = i ;

                for (int j = i+1; j < totalWOrkHours.length; j++) {
                    if (currentMax>totalWOrkHours[j]){
                        currentMax = totalWOrkHours[j];
                        currentMaxIndex = j;
                        indexOfMAxEmployee = employees[j];
                    }

                }
                if (currentMaxIndex!=i){
                    totalWOrkHours[currentMaxIndex] = totalWOrkHours[i];
                    totalWOrkHours[i]=currentMax;
                    employees[currentMaxIndex]=employees[i];
                    employees[i]=indexOfMAxEmployee;
                }
            }
            for (int i = 0; i < employees.length; i++) {
                System.out.println("Employee " + employees[i] + "' s total work hour is " + totalWOrkHours[i]);
            }
        }

    }

