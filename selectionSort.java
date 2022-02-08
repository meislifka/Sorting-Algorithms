/**
 * this is a project performs selection sort and puts array in ascending or descending order
 * @author Mei Slifka
 * Created at : 2022-02-09
 */

import java.util.Scanner;


/**
     * Class for selectionSort
     */
public class selectionSort {

    /**
     * sorts in ascending order
     * @param arr array
     * @return array sorted arary
     */
    private static int[] selectionAscending(int[] arr) {
       int smallest = 0, temp;

       //loop through entire array
       for(int i = 0; i <arr.length;i++)
       {
           smallest = i;
           //search for a new smallest element starting at i until end of array
            for(int j = i+1; j <arr.length;j++)
            {
                //if new smallest is found sest smallest to the index
                if(arr[j]<arr[smallest]){ 
                    smallest = j; 
                    
                }

            }       //swaping
                    temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;       
    }
        return arr;
    }

     /**
     * sorts in descending order
     * @param arr array
     * @return array sorted arary
     */
    private static int[] selectionDescending(int[] arr) {
        int largest = arr.length-1;
        int temp;

        //search for a new largest element starting at end of array until start
        for(int i = arr.length-1; i >=0;i--)
        {
            largest = i;
             for(int j = i-1; j >=0;j--)
             {
                 if(arr[j]<arr[largest]){
                     largest = j; 
                     
                 }
             }       //swapping largest with smaller value
                     temp = arr[largest];
                     arr[largest] = arr[i];
                     arr[i] = temp;                              
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
                sortedArr = selectionAscending(array);
                finish = System.nanoTime();
            case 2:
                start = System.nanoTime();
                sortedArr = selectionDescending(array);
                finish = System.nanoTime();
        }

        //printing sorted array
        for(int i = 0;i<n;i++)
        {
            System.out.print(sortedArr[i] + " ");
        } 
        System.out.printf("\nThis algorithm took:"  + (finish - start) + " nanoseconds");
        scan.close();

    }
}
