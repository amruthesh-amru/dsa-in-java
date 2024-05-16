
public class largestEle {
    public static void main(String[] args) {
        int[] arr = {5 ,9 ,3 ,4 ,8, 4, 3, 10 };
        int max=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
