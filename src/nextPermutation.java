public class nextPermutation {
    public static void main(String[] args) {
        int[] arr = {2,5,1,4,3,0,0};
        int[] temp = new int[arr.length];
        int prev=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[i+1]){
                temp[i] = arr[i];
                prev=arr[i];
                    break;
            }else{
                temp[i] = arr[i];
                prev=arr[i];
            }
        }
        for (int i = temp.length; i < arr.length; i++) {

        }
    }
}
