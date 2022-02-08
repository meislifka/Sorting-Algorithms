/**
 * this is a project performs bubble sort and puts array in ascending or descending order
 * @author Mei Slifka
 * Created at : 2022-02-09
 */

import java.util.Scanner;


/**
     * Class for bubble sort 
     */
public class BubbleSort {

    /**
     * sorts in ascending order
     * @param arr array
     * @return array sorted arary
     */
    private static int[] bubbleAscending(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length-1;i++){
            for(int j = i; j < arr.length-1; j++){
              if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
              }  
            }
        }
        return arr;
    }

    /**
    * sorts in descending order
    * @param arr array
    * @return array sorted arary
    */
    private static int[] bubbleDescending(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length-1;i++){
            for(int j = 0; j < arr.length-i-1; j++){
              if(arr[j] < arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
              } 
              
            }
            
        }
         return arr;
     }


/**
 * the main entry point for applicaiton.
 * @param args
* */
    public static void main(String[] args) {
        
        // creating scanner
        Scanner scan = new Scanner(System.in);

        //getting input 
        System.out.print("Enter the length of the array:");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements of the array sepearted by spaces:");
        for(int i = 0;i<n;i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.print("Sort acesnding (1) or descending(2): ");
        int choice = scan.nextInt();
        int[] sortedArr = new int[n];
        long start=0, finish=0;
        switch(choice){
            case 1:
                start = System.nanoTime();
                sortedArr =bubbleAscending(array);
                finish = System.nanoTime();
            case 2:
                start = System.nanoTime();
                sortedArr = bubbleDescending(array);
                finish = System.nanoTime();
        }

        //printing sorted array
        for(int i = 0;i<n;i++)
        {
            System.out.print(sortedArr[i] + " ");
        } 
        System.out.printf("\n This algorithm took:"  + (finish - start) + " nanoseconds");
        scan.close();

    }
}
