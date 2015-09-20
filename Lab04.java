import java.io.File;
import java.util.*;
import java.io.FileReader;

public class Csm10j_lab4 {
    
    static int numberOfIntegers = 0;
    
    public static void main(String[] args) throws java.io.FileNotFoundException {
        String filename = "inData.txt"; 
        Scanner console = new Scanner (new FileReader(filename));
        System.out.printf("Input: ");
        while (console.hasNext()){
            System.out.printf(console.nextInt() + " ");
        }
        double mean = computeMean(filename);
        System.out.println("\nMean: " + String.format("%.2f", mean));
        System.out.println("StdDev: " + String.format("%.2f", computeDeviation(filename, mean)));  
    }
    
    public static double computeMean(String input) throws java.io.FileNotFoundException {
        Scanner console = new Scanner (new FileReader(input));
    
        double mean;
        double total = 0;
        
        while (console.hasNext()) {
            total = total + console.nextInt();
            numberOfIntegers++;
        }
        mean = total / numberOfIntegers; 
            
        return mean;
    }
    
    public static double computeDeviation(String input, double mean)throws java.io.FileNotFoundException {
        Scanner console = new Scanner (new FileReader(input));
        
        double stdDev = 0;
        double total = 0;
        
        while (console.hasNext()) {
            total = total + Math.pow(console.nextInt() - mean, 2); 
        }
        stdDev = Math.sqrt(total / numberOfIntegers);
        
        return stdDev;
    }
