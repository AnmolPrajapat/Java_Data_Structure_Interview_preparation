public class mergeSortingArrays {
    public static void main(String[] args) {
        int[] arr = {9,3,7,1,6,4,5,8,2,9};
        int[] newArr =mergeSort(arr,0,arr.length-1);
        System.out.print(newArr);
    }

    private static int[] mergeSort(int[] arr, int s, int e) {
        if(arr.length==1) return arr;
        int m = arr.length/2;
       int[] left= mergeSort(arr,s,m);
       int[] right = mergeSort(arr,m, e);
       return merge(left,right);

    }

    private static int[] merge(int[] first, int[] second) {
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
