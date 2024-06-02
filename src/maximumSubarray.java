
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
//    public static void main(String[] args) {
//        int maxi=Integer.MIN_VALUE;
//        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//
//                sum+=arr[j];
//
//                maxi = Math.max(maxi,sum);
//            }
//        }
//        System.out.print(maxi);
//    }


    //optimal solution without follow up using kadane algorithm
//    public static void main(String[] args) {
//
//        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
//        int n=arr.length;
//        int sum=0;
//        int maxi = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//            if (sum > maxi) {
//                maxi = sum;
//            }
//            // If sum < 0: discard the sum calculated
//            if (sum < 0) {
//                sum = 0;
//            }
//        }
//        // To consider the sum of the empty subarray
//        // uncomment the following check:
//
//        //if (maxi < 0) maxi = 0;
//
//        System.out.println(maxi);
//}

//optimal solution with followup to print that  subarray which contains maximum sum using kadanes algorithm
//    class Solution {
//        public int maxSubArray(int[] nums) {
//
//            int maxi=Integer.MIN_VALUE;
//            int sum=0;
//            int n=nums.length;
//            int subArrayStart=-1;
//            int subArrayStop=-1;
//            int start=0;
//            for(int i=0;i<n;i++){
//                if(sum == 0) start =i;
//                sum+=nums[i];
//
//                if(maxi<sum){
//                    maxi=sum;
//                    subArrayStart=start;
//                    subArrayStop=i;
//                }
//                if(sum<0){
//                    sum = 0;
//                }
//
//
//            }
//            return maxi;
//        }
//    }


//second type with followup to print those numbers which contains max subarray - YT love babbar

//    class HelloWorld {
//        public static void main(String[] args) {
//            int[] nums = {5,4,-1,7,8};
//            int sum =0;
//            int startIndex=0,endIndex=0;
//            int maxi = Integer.MIN_VALUE;
//            int n=nums.length;
//
//            for(int i=0;i<n;i++){
//                sum+=nums[i];
//                if(sum>maxi){
//                    maxi=sum;
//                    endIndex=i;
//                }
//                if(sum<0){
//                    sum = 0;
//                    startIndex=i+1;
//                }
//
//
//            }
//            System.out.println(maxi);
//            for(int i=startIndex;i<=endIndex;i++){
//                System.out.println(nums[i]);
//            }
//        }
//    }



}
