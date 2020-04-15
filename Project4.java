package warren4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Warren4 {

public static void main(String[] args) {
double[][] numbersArray = new double[5][5];
Scanner scnr = new Scanner(System.in);
String[] names = new String[5];

for(int s = 0; s < 5; s++){
numbersArray[s][0] = scnr.nextDouble();
numbersArray[s][1] = scnr.nextDouble()/100.0;
numbersArray[s][2] = scnr.nextDouble()/100.0;
numbersArray[s][3] = Math.ceil(scnr.nextDouble());
names[s] = scnr.nextLine();

double balance = 0;
double interest;
int yrs = (int) numbersArray[s][3];

for (int j = 0; j < yrs; j++){
balance += numbersArray[s][0] * numbersArray[s][1];
interest = balance * numbersArray[s][2];
balance += interest;
}

numbersArray[s][4] = Math.round(balance * 100.0) / 100.0;
}

// Copy array
double [][] numbersArraySorted = new double[numbersArray.length][numbersArray.length];

for(int i = 0; i < numbersArray.length; i++){
numbersArraySorted[i] = numbersArray[i].clone();
}

//Sorting Array
Arrays.sort(numbersArraySorted, new Comparator<double[]>(){
@Override
public int compare(double[] b1, double[] b2){

if (b1[4] < b2[4]) {
return 1;
}
else {
return -1;
}
}
});

// Debug print - check array is sorted
//for(int s = 0; s < 5; s++){
//System.out.println(numbersArraySorted[s][4]);
//}
    for (double[] numbersArraySorted1 : numbersArraySorted) {
        int index = 0;
//look for balance value in original array
        for (int j = 0; j < numbersArray.length; j++) {
            if (numbersArraySorted1[4] == numbersArray[j][4]) {
                // found it
                index = j;
                break;      
            }
        }

//System.out.printf("%-15s\t%.5f\n", names[index],numbersArray[index][4]);
System.out.println(names[index] + " Salary: " + numbersArray[index][0] +  " Savings Rate: " +
        numbersArray[index][1] + " Interest Rate: " +  numbersArray[index][2] + " Years: " + numbersArray[index][3] + " Balance: " + numbersArray[index][4]);

    
    }
}
}