 package account;

import java.util.Scanner;

//@author Warren

public class Account {

    private double salary;
    private double savingsRate;
    private double interestRate;
    private double years;
    private double balance;
    private String name;
    static int number;
    
    
    public Account(double salary, double savingsRate, double interestRate, double years, String name) {
        this.salary = salary;
        this.savingsRate = savingsRate;
        this.interestRate = interestRate;
        this.years = years;
        this.name = name;
        computeBalance();
        number++;
        
    }

    public Account(double salary, double savingsRate, double interestRate, double years) {
        this.salary = salary;
        this.savingsRate = savingsRate;
        this.interestRate = interestRate;
        this.years = years;
        computeBalance();
        number++;
    }
    
    public static int getNumber(){
        return number;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSavingsRate() {
        return savingsRate;
    }
    
    public void setSavingsRate(double savingsRate) {
        this.savingsRate = savingsRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String accountName) {
        name = accountName;
    }

    public String getName() {
        return name;
    }

    public void computeBalance(){
        
        int yrs = (int) Math.ceil(years);
        
        for(int i =0; i < yrs; i++){
          balance += salary * savingsRate;
          double interest = balance * interestRate;
          balance += interest;
        }
    }
     
    
    @Override
    public String toString() {
        return "Account{" + "salary=" + salary + ", savingsRate=" + savingsRate + ", interestRate=" + interestRate + ", years=" + years + ", balance=" + balance + ", name=" + name + ", number=" + number + '}';
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        

        double salary = scnr.nextDouble();
        double savingsRate = scnr.nextDouble();
        double interestRate = scnr.nextDouble();
        double years = scnr.nextDouble();
        String name = scnr.nextLine();

        Account person1 = new Account(salary, savingsRate, interestRate, years, name);
        System.out.println(person1.toString());

        salary = scnr.nextDouble();
        savingsRate = scnr.nextDouble();
        interestRate = scnr.nextDouble();
        years = scnr.nextDouble();
        name = scnr.nextLine();

        Account person2 = new Account(salary, savingsRate, interestRate, years);
        person2.setName(name);
        System.out.println(person2.toString());
     
        System.out.println("Number of accounts = " + Account.getNumber());
        

    }
    
}
