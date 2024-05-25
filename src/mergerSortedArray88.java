public class mergerSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int i=0,j=0,index=0;
        while(i<m && j<n ){
            if(nums1[i] <= nums2[j] ){
                result[index] = nums1[i];
                i++;
                index++;
            } else{
                result[index] = nums2[j];
                j++;
                index++;
            }
        }
        while (i < m) {
            result[index++] = nums1[i++];
        }


        while (j < n) {
            result[index++] = nums2[j++];
        }

        for(int k=0; k<result.length ; k++){
            nums1[k] = result[k];
            System.out.println(nums1[k]);
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int m=1;
        int n=1;

        merge(nums1,m,nums2,n);
    }
}
