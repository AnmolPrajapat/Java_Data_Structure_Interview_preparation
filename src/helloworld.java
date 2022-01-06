import java.net.StandardSocketOptions;
import java.util.Arrays;

public class helloworld {
    public static void main(String args[]){
        int[] arr = {4,7,2,8,5,10,-4,-9,0};
        int[] array = bubbleSort(arr,arr.length-1,0);
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr)+ "\n "+ Arrays.toString(array));
    }

    private static int[] bubbleSort(int[] arr, int r, int c) {
        if(r ==  0) return arr;
        if(c<r){
            if(arr[c]>arr[c+1]){
                swap(arr,c,c+1);
                return bubbleSort(arr,r,c+1);
            }
            return bubbleSort(arr,r,c+1);
        }
        return bubbleSort(arr, r-1,0);
    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int[] bubbleSort2(int[] arr){
        for(int r=0; r < arr.length-1; r++){
            int j =0;
            boolean swapping = false;
            while(j<arr.length-1-r){
                if(arr[j]>arr[j+1]){
                    swapping = true;
                    swap(arr,j,j+1);
                }
                j++;
            }
            if(swapping == false)
                return arr;
        }
        return arr;
    }

}
