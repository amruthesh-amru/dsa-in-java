
public class maximumSubarray
{

    //brute force TC -> O(n^3) SC -> O(1)
//    public static void main(String[] args) {
//        int maxi=Integer.MIN_VALUE;
//        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                int sum=0;
//                for(int k=i;k<=j;k++){
//                    sum+=arr[k];
//                }
//                maxi = Math.max(maxi,sum);
//            }
//        }
//        System.out.print(maxi);
//    }
    //better approach TC -> O(n2) SC -> O(1)
    public static void main(String[] args) {
        int maxi=Integer.MIN_VALUE;
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){

                sum+=arr[j];

                maxi = Math.max(maxi,sum);
            }
        }
        System.out.print(maxi);
    }
}
