import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,-3,10,1,9,4,2,7,0,-3,9,-5,1,6,4,56};
        int[] aray = {9,4,2,7,0,-3,9,-5,1,6,4,56};
        sortt(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(aray);
        System.out.print(Arrays.toString(aray));

    }
//    static  int max = Integer.MIN_VALUE;
//    static int maximum(int[] arr, int i, int j){
//        for(int k=i; k<j; k++){
//            max = Math.max(arr[k],max);
//        }
//        return max;
//    }
    static void sortt(int[] arr, int low , int high){
        if(low >= high) return ;
        int s = low ;
        int e = high;
        int m = s + (e-s)/2;
        System.out.println("hii");
        int pivot = arr[m];
//        int pivot = maximum(arr,low,high);
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
//        swap(arr,s,e);
        sortt(arr,low,e);
        sortt(arr,s,high);
    }
    static void swap(int[] num , int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
