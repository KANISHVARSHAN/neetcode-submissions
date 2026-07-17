class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int[128];
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<m;i++){
            arr[t.charAt(i)]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
