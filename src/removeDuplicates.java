public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                continue;
            }else{
                count++;
            }
        }
            count++;
        System.out.println(count);
    }
}
