/*
Mei Slifka
2/8/22
This program performs selection sort and puts array in ascending order
*/
import java.util.Scanner;

public class selectionSort {

    // method finds the prime numbers
    private static int[] selectionAscending(int[] arr) {
       int smallest = 0;
       int temp;
       //System.out.println("DO I GET HERE");
       for(int i = 0; i <arr.length;i++)
       {
           smallest = i;
            for(int j = i+1; j <arr.length;j++)
            {
                if(arr[j]<arr[smallest]){
                    smallest = j; 
                    
                }

            }
                    temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
                    
                    
    }
        return arr;
    }

    //WIP
    private static int[] selectionDecending(int[] arr) {
        int smallest = 0;
        int temp;
        //System.out.println("DO I GET HERE");
        for(int i = 0; i <arr.length;i++)
        {
            smallest = i;
             for(int j = i+1; j <arr.length;j++)
             {
                 if(arr[j]<arr[smallest]){
                     smallest = j; 
                     
                 }
 
             }
                     temp = arr[smallest];
                     arr[smallest] = arr[i];
                     arr[i] = temp;
                     
                     
     }
         return arr;
     }


    public static void main(String[] args) {
        
        // creating scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements of the array sepearted by spaces:");
        for(int i = 0;i<n;i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.print("Sort acesnding (1) or descending(2)");
        int choice = scan.nextInt();
        int[] sortedArr = new int[n];
        switch(choice){
            case 1:
                sortedArr = selectionAscending(array);
            case 2:
                sortedArr = selectionDecending(array);
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(sortedArr[i] + " ");
        } 
        scan.close();
    }
}
