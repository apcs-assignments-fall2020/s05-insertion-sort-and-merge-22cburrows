import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        // YOUR CODE HERE
        return null;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] end = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while ((i < arr1.length) && ( j < arr2.length)){
            if (arr1[i] < arr2[j]){
                end[k] = arr1[i];
                i++;
            }
            else{
                end[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length){
            end[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length){
            end[k] = arr2[j];
            j++;
            k++;
        }
        return end;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
