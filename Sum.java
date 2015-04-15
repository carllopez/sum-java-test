import java.util.Arrays;
import java.util.ArrayList;

public class Sum { 
    
    public static ArrayList<String> checkMatches() {
        ArrayList<String> matches = new ArrayList<String>();
        // numbers.add(5);
        
        // Not using incoming array from arguments, hard-coding it here
        // and using plain loops instead of other approaches since it works
        // very fast for small (~500 items) arrays

        int[] intsArray = {3, 4, 7, 1, 2, 9, 8};
        int sum, sum2 = 0;

        for (int i = 0; i < intsArray.length; i++) {
            for (int j = i+1; j < intsArray.length; j++) {
                // Storing first sum result in an intermediate variable
                sum = intsArray[i] + intsArray[j];
                    for (int k = j+1; k < intsArray.length; k++) {
                        for (int n = k+1; n < intsArray.length; n++) {
                            // Storing second sum result for easiness of comparison
                            sum2 = intsArray[k] + intsArray[n];
                            if (sum == sum2){
                                matches.add("Positions that match: " + i + ", " + j + ", " + k + ", " + n);
                                // System.out.println("Positions that match: " + i + ", " + j + ", " + k + ", " + n);
                                // System.out.println("Summing: " + intsArray[i] + " + " + intsArray[j] + " = " + intsArray[k] + " + " + intsArray[n] + " ==> " + sum);
                            }
                        }    
                    }
            }
        }

        return(matches);
     }

    public static void main(String[] args) { 

        for (String match : checkMatches())
            System.out.println(match);

        // Possible immediate enhancements include not building strings with '+' inside the loops
        // but use a string builder and add those strings to a arraylist that gets printed in the end
        // May update the version soon

    }

}