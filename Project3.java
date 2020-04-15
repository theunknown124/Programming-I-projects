/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;

import java.util.Scanner;

/**
 *
 * @author Warren
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scnr = new Scanner (System.in);
    
    int salary = 0;
    double savingsRate = 0;
    double interestRate = 0;
    double yearsOfEmployment = 0;
    String employeeName;
    
    
    
      //salary  
    if (scnr.hasNextInt()){
        salary = (int) (double) scnr.nextInt();
    }
    else if(scnr.hasNextDouble()) {
        salary = (int) scnr.nextDouble();
    }
        System.out.println("Salary: " + salary);
    
   
     
    //SavingsRate
    if (scnr.hasNextInt()){
        savingsRate = (double)scnr.nextInt();
        savingsRate = savingsRate/100;
    }
    else if (scnr.hasNextDouble()){
        savingsRate = scnr.nextDouble();
        savingsRate = savingsRate/100;
    }
    
        System.out.println("Savings Rate: " + savingsRate);
   
    
    //Interest Rate 
   if (scnr.hasNextInt()){
       interestRate = (double)scnr.nextInt();
       interestRate = interestRate/100;
   }
   else if (scnr.hasNextDouble()){
       interestRate = (double)scnr.nextDouble();
       interestRate = interestRate/100;
   }
    
        System.out.println("Interest Rate: " + interestRate);
    
    //Years of Employment
    
    if (scnr.hasNextInt()){
        yearsOfEmployment = (int)(double)scnr.nextInt();
    }
    else if (scnr.hasNextDouble()){
        yearsOfEmployment = (double)scnr.nextDouble();
    }
    
        System.out.println("Years of Employment: " + Math.ceil(yearsOfEmployment));
    
    //Employee Name
    employeeName = scnr.nextLine();
    if (employeeName.length() != 0){
        System.out.println("Name:" + employeeName);
    }
        
   
    double balance = 0;
    double interest;
    
    for (int i = 0; i <= yearsOfEmployment; i++){
        
        balance +=  salary * savingsRate;
    
        interest = balance * interestRate;
        
        balance += interest;
     
    
System.out.printf("Year: %d Interest Earned: %.2f Balance: %.2f\n", i + 1, interest, balance);

    }
    
  }
    
}


