public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,0,85,2};
        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for (int ele:arr
             ) {
            System.out.print(ele + " ");
        }

    }
}
