import java.util.*;
public class mergeSort {

    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList <Integer> temp = new ArrayList<>();


        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
            left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <=high ; i++) {
            arr[i] = temp.get(i-low);
        }
    }

    public static void sortMerge(int[] arr,int high,int low){
        if(low!=high){
            int mid = (high+low)/2;
            sortMerge(arr,low,mid);
            sortMerge(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr ={2,4,7,8,6};
        sortMerge(arr,arr.length-1,0);
        for (int ele:arr
             ) {
            System.out.print(ele+" ");
        }
    }
}
