/**
 * this is a project performs Insertion sort and puts array in ascending or descending order
 * @author Mei Slifka
 * Created at : 2022-02-10
 */

import java.util.Scanner;


/**
     * Class for bubble sort 
     */
public class InsertionSort {

    /**
     * sorts in ascending order
     * @param arr array
     * @return array sorted arary
     */
    private static int[] insertionAscending(int[] arr) {
        int key;
        for(int i =1; i<arr.length;i++){
            key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    /**
    * sorts in descending order
    * @param arr array
    * @return array sorted arary
    */
    private static int[] insertionDescending(int[] arr) {
        int key;
        for(int i =1; i<arr.length;i++){
            key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=key;
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
                sortedArr =insertionAscending(array);
                finish = System.nanoTime();
            case 2:
                start = System.nanoTime();
                sortedArr = insertionDescending(array);
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
