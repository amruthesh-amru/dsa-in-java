public class secLargeAndSecSmall {

    public static int findsLargest(int[] arr,int n){
        int largest = arr[0];
        int sLargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                sLargest = largest;
                largest = arr[i];
            }else if (arr[i] < largest && arr[i] > sLargest){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static int findsSmallest(int[] arr,int n){
        int Smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<Smallest){
                sSmallest = Smallest;
                Smallest = arr[i];
            }else if (arr[i] > Smallest && arr[i] < sSmallest){
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        int n =arr.length;
        int sLargest = findsLargest(arr,n);
        int sSmallest = findsSmallest(arr,n);
        System.out.println("sLargest = "+sLargest+" sSmallest =  "+sSmallest);
    }
}
