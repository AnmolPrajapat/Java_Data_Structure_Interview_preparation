import java.util.Arrays;

public class MergingArrays {
    public static void main(String[] args){
        int[] first = {3,8,1,};
        int[] second = {8,0,1,-5,};
        int[] newArr = new int[first.length + second.length];
         merge(newArr,first,second);
        System.out.print(Arrays.toString(newArr));
    }
    static void merge(int[] arr,int[] fr, int[] sc){
        int i=0;
        int j=0;
        int k=0;
        while(i< fr.length && j< sc.length){
            if(fr[i]<sc[j]){
                arr[k] = fr[i];
                i++;
            }
            else{
                arr[k]= sc[j];
                j++;
            }
            k++;
        }
        if(i== fr.length){
            while(j<sc.length){
                arr[k]= sc[j];
                j++;
                k++;
            }
        }
        if(j== sc.length){
            while(i< fr.length){
                arr[k] = fr[i];
                i++;
                k++;
            }
        }
    }
}
