import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeIntervals {
    static List<List<Integer>> merge(int[][] arr){
//        if(arr.length<=1){
//            return arr;
//        }
        Arrays.sort(arr, Comparator.comparingInt(i -> i[0]));

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
           int start = arr[i][0];
            int end = arr[i][1];
            if (!result.isEmpty() && end <= result.get(result.size() - 1).get(1)) {
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
            if(arr[j][0]<=end){
                end = Math.max(end,arr[j][1]);
            }else{
                break;
                }
            }
            result.add(Arrays.asList(start,end));
        }
    return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = merge(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
//leetcode solution

//class Solution {
//
//    int[][] mergeIntervals(int[][] arr){
//        int n= arr.length;
//        if (arr == null || arr.length == 0) {
//            return new int[0][];
//        }
//
//        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
//
//        List<List<Integer>> temp = new ArrayList<>();
//
//        for(int i=0;i<n;i++){
//            int start = arr[i][0];
//            int end = arr[i][1];
//            if(!temp.isEmpty()  && end <= temp.get(temp.size()-1).get(1) ){
//                continue;
//            }
//            for(int j=i+1;j<n;j++){
//                if(arr[j][0] <= end){
//                    end = Math.max(end,arr[j][1]);
//                }else{
//                    break;
//                }
//            }
//            List<Integer> mergedInterval = new ArrayList<>();
//            mergedInterval.add(start);
//            mergedInterval.add(end);
//            temp.add(mergedInterval);
//        }
//        int[][] result = new int[temp.size()][2];
//        for (int j = 0; j < temp.size(); j++) {
//            result[j][0] = temp.get(j).get(0);
//            result[j][1] = temp.get(j).get(1);
//        }
//        return result;
//    }
//
//    public int[][] merge(int[][] intervals) {
//        int[][] arr = mergeIntervals(intervals);
//        return arr;
//    }
//}