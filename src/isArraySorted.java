public class isArraySorted {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,1};
        int result=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]<=arr[i+1]){
                 result=1;
            }else{
                result=0;
                break;
            }
        }
        System.out.println(result);
    }
}
