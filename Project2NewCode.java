/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2.pkgnew.code;

import java.util.Scanner;
/**
 *
 * @author Warren
 */
public class Project2NewCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scnr = new Scanner (System.in);
    
        int salary = 0; 
        double  savingsRate = 0; 
        double interestRate = 0; 
       int yearsOfEmployment = 0; 
       double retirementSavings;
       String employeeName = null; //= scnr.nextLine();
               
     //salary  
    if (scnr.hasNextInt()){
        salary = (int) (double) scnr.nextInt();
    }
    else if (scnr.hasNextDouble()) {
        salary = (int) scnr.nextDouble();
    }
    else {
        System.out.println("Error: invalid input for Salary - exiting");
        System.exit(0);
    }
    
    if ((salary > 0) && (salary < 300000)){
        System.out.println("Salary: "+ salary);
       }
    else {
       System.out.println("Error: invalid input for Salary - exiting");
       System.exit(0);
    }
     
    //SavingsRate
    if (scnr.hasNextInt()){
        savingsRate = (double)scnr.nextInt();
        savingsRate = savingsRate/100;
    }
    else if (scnr.hasNextDouble()){
        savingsRate = scnr.nextDouble();
    }
    
    else{
        System.out.println("Error: illegal input for Savings Rate - exiting");
        System.exit(0);
    }
       
    if ((savingsRate > 0) && (savingsRate <= .30)) {        
       System.out.println("Savings rate: " + savingsRate);
       }
    
       else if ((savingsRate > 0) && (savingsRate <= 100) && (savingsRate <= .30)){
        System.out.println("Savings rate: " + savingsRate);
       }
   
    else {
        System.out.println("Error invalid value for savings");
        System.exit(0);
    }
    
    //Interest Rate 
   if (scnr.hasNextInt()){
       interestRate = (double)scnr.nextInt();
       interestRate = interestRate/100;
   }
   else if (scnr.hasNextDouble()){
       interestRate = (double)scnr.nextDouble();
   }
   else {
       System.out.println("Error: invalid value for interest rate");
       System.exit(0);
   }
    
    if ((interestRate > 0) && (interestRate <= .20)){
        System.out.println("Interest Rate: " + interestRate);
    }
     else if((interestRate > 0) && (interestRate <= 100) && (interestRate <= .20)){
        System.out.println("Interest Rate: " + interestRate);
    
    }
    
    else {
       System.out.println("Error: invalid value for interest rate");
       System.exit(0);        
    }
    
    //Years of Employment
    
    if (scnr.hasNextInt()){
        yearsOfEmployment = (int)(double)scnr.nextInt();
    }
    else {
        System.out.println("Error: invalid value for years of employment");
        System.exit(0);
    }
    
    if ((yearsOfEmployment > 0) && (yearsOfEmployment <= 40)){
        System.out.println("Years of Employment: " + yearsOfEmployment);
    }
    else {
        System.out.println("Error: invalid value for years of employment");
        System.exit(0);
    }
    
    //Employee Name
    employeeName = scnr.nextLine();
    if (employeeName.length() != 0){
        System.out.println("Name:" + employeeName);
    }
    else {
        System.out.println("Missing name");
        System.exit(0);
    }
    //Retirement Savings Formula
       retirementSavings = (salary * savingsRate * (1 + interestRate)* yearsOfEmployment); 
       System.out.println("Retirement Savings: " + retirementSavings);
       
     }
   }
       
            
    
    

