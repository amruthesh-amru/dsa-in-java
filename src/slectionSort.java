public class slectionSort {

    public  static void bubbleSort(int[] arr,int n){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int ele:arr
             ) {
            System.out.print(+ele+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {9 ,3 ,6 ,2 ,0} ;
        int n= arr.length;

        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp ;
            temp= arr[i];
            arr[i] = arr[min];
            arr[min]= temp;
        }

        bubbleSort(arr,n);
    }
}
