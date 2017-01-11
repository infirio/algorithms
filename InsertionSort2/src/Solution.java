import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        int temp;
        for(int i=1;i<ar.length;i++){
            temp = ar[i];
            for(int j=i-1;j>=0;j--){//we dont want to compare the int with itself

                
                if (temp<ar[j]){
                    ar[j+1] = ar[j];
                    if(j ==0){
                        
                        ar[j] = temp;
                        break;
                    }
                }
                else{
                	if(j==(i-1)){
                		break;
                	}
                	
                    ar[j+1] = temp;
               
                    break;
                }
               

                
            }
        printArray(ar);
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
