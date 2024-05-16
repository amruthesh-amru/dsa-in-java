public class sortColors {
    public static void main(String[] args) {
        //brute force would be merge sort which takes O(nlogn)

//better takes O(2n) sc O{1]
//
//import java.util.*;
//
//        public class Main {
//            public static void sortArray(ArrayList<Integer> arr, int n) {
//                int cnt0 = 0, cnt1 = 0, cnt2 = 0;
//
//                for (int i = 0; i < n; i++) {
//                    if (arr.get(i) == 0) cnt0++;
//                    else if (arr.get(i) == 1) cnt1++;
//                    else cnt2++;
//                }
//
//                //Replace the places in the original array:
//                for (int i = 0; i < cnt0; i++) arr.set(i, 0); // replacing 0's
//
//                for (int i = cnt0; i < cnt0 + cnt1; i++) arr.set(i, 1); // replacing 1's
//
//                for (int i = cnt0 + cnt1; i < n; i++) arr.set(i, 2); // replacing 2's
//            }
//
//            public static void main(String args[]) {
//                int n = 6;
//                ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
//                sortArray(arr, n);
//                System.out.println("After sorting:");
//                for (int i = 0; i < n; i++) {
//                    System.out.print(arr.get(i) + " ");
//                }
//                System.out.println();
//
//            }
//
//        }

//most optimal using Dutch National flag algorithm. (uses 3 pointers low,mid,high)
//
//            public void sortColors(int[] nums) {
//                int low=0,mid=0,high=nums.length-1;
//                while(mid<=high){
//                    if(nums[mid]==0){
//                        int temp=nums[low];
//                        nums[low] = nums[mid];
//                        nums[mid] = temp;
//                        mid++;
//                        low++;
//                    }
//                    else if(nums[mid]==1){
//                        mid++;
//                    }
//                    else{
//                        int temp=nums[mid];
//                        nums[mid] = nums[high];
//                        nums[high] = temp;
//                        high--;
//                    }
//                }
//
//            }
//        }

    }
}

