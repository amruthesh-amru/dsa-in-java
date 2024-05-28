public class duplicateNumber287 {
    static public void repeatedNumber( int[] A) {
        int slow=0;
        int fast=0;
        do{
            slow = A[slow];
            fast= A[A[fast]];
        }while(slow!=fast);

         slow =0;
        while(slow!=fast){
            slow = A[slow];
            fast = A[fast];
        }
        System.out.println(slow);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        repeatedNumber(arr);
    }
}
