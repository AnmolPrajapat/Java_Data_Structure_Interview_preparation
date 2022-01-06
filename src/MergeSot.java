import java.util.Arrays;

public class MergeSot {
    public static void main(String args[]){
        int[] arr = {5,2,3,1,8,6,4,-1,8,0,-27,445,222,-56,0,7,-1,9,4};
        int[] newarr = mergeSort(arr);
        System.out.println(Arrays.toString(newarr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(arr,left,right);
    }
    static int[] merge(int[] arr, int[] first, int[] second){
        int i=0;
        int j=0;
        int k=0;
        int[] mix = new int[first.length+ second.length];

        while(i< first.length && j< second.length){
            if(first[i] <second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        if(i== first.length){
            while(j<second.length){
                mix[k]= second[j];
                j++;
                k++;
            }
        }
        if(j== second.length){
            while(i< first.length){
                mix[k] = first[i];
                i++;
                k++;
            }
        }
        return mix;
    }
}
