public class RepeatAndMissing {
//    since the array contains the elements from 1 -> N
//    we can keep track of it  using the array
//    TC -> O{n^2}  SC -> O(1)
//import java.util.*;
//
//    public class tUf {
//
//        public static int[] findMissingRepeatingNumbers(int[] a) {
//            int n = a.length; // size of the array
//            int repeating = -1, missing = -1;
//
//            //Find the repeating and missing number:
//            for (int i = 1; i <= n; i++) {
//                //Count the occurrences:
//                int cnt = 0;
//                for (int j = 0; j < n; j++) {
//                    if (a[j] == i) cnt++;
//                }
//
//                if (cnt == 2) repeating = i;
//                else if (cnt == 0) missing = i;
//
//                if (repeating != -1 && missing != -1)
//                    break;
//            }
//            int[] ans = {repeating, missing};
//            return ans;
//        }
//    }
//
//for better approach we can use hash array without using the map
//    we first inintialze all the elements to 0 , then we iterate through the original array if we found the duplicate element the hash of that element is set to 2, for missing element the hash is will be still at zero
//
//    int[] hash = new int[A.length+1];
//    int repeat = -1;
//    int missing = -1;
//    int n = A.length;
//        for(int i=0;i<n;i++){
//        hash[A[i]]++;
//    }
//        for(int i=1;i<=n;i++){
//        if(hash[i]==0){
//            missing = i;
//        }else if(hash[i]==2){
//            repeat = i;
//        }
//        if(repeat!=-1 && missing!=-1){
//            break;
//        }
//    }
//    int[] result =new int[2];
//    result[0] =  repeat;
//    result[1] =missing  ;
//        return result;
// }
public static void main(String[] args) {
    int[] arr = {3, 1, 2, 5, 4, 6, 7, 5};
    int n=arr.length;
    int sum =0;
    int sumSquare = 0;
    //sum -> x-y
    //sumSquare -> x^2 - y^2
    for (int i = 0; i < n; i++) {
        sum+=arr[i];
        sumSquare+=arr[i]*arr[i];
    }
    int resultSum = sum - n*(n+1)/2;
    int resultSumSquare = sumSquare - (n * (n + 1) * (2 * n + 1)) / 6;

    int equationOne = resultSumSquare/resultSum;
    int repeated = (resultSum + equationOne) / 2;
    int missing = equationOne - repeated;
    System.out.println(repeated + " "+ missing);
}
}
