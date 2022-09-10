import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.lang.Object;

public class Main {
	
	    public static void main(String[] args) {	    	
	    	
	        int number;
	        do {
				try {
					number = Integer.parseInt(JOptionPane.showInputDialog("Enter an even number (>2):"));
				}
				catch(NumberFormatException exf) {
					System.out.println("You didn't enter an even number (>2). Try again!");
					return;
				} 
			} while (number <= 2  || number%2 != 0);


	        ArrayList<Integer> arr= new ArrayList<Integer>();
	        arr.add(2);	        

	        int n;
	        for (int i=3;i<number;i+=2){
	            n=0;
	            for (int j=3;j<i;j++){
	                if (i%j==0){
	                    n++;
	                }
	            }
	            if(n==0){
	            	arr.add(i);
	            }
	        }

	        int[] array = new int[arr.size()];
	        for (int i=0; i < array.length; i++){
	            array[i] = arr.get(i).intValue();
	        }
	        
			System.out.println("Number "+number+" can be expressed as a sum of two prime numbers in so many cases: ");
            for(int i=0;i<array.length;i++) {
	        	for(int j=0;j<array.length;j++) {
	        		if((array[i]+array[j]==number)&&(array[i]<array[j])) {
						System.out.println(array[i]+" + "+array[j]);
	        		}
	        	}
	        }
	    }
}
