import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++){
            int num = list.get(i);
            int x = i - 1;
            while ((x > -1) && (list.get(x).compareTo(num) == 1)){
                list.set(x + 1, list.get(x));
                x--;
            }
            list.set(x + 1, num);
        }
        return list;
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
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 10, 9, 5, 4, 7, 18, 3}));
        System.out.println(Arrays.asList(insertionSort(list)));

        int[] arr1 = {-4, 5, 10, 8};
        int[] arr2 = {-5, -1, 11, 20};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
