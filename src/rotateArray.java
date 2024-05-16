public class rotateArray {
    static int[] callRotateArray() {
        int[] arr = {1,2,3,4,5,6};
        int n=arr.length;
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {

            arr[i] = arr[i+1];

        }arr[n-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] temp = new int[20];
        temp = callRotateArray();
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
