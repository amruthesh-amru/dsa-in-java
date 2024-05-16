class Solution {
    public boolean isPlai(String str,int i){
        int n=str.length();
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }
        return isPlai(str,i+1);
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isPlai("racecax",0));
    }
        }