class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<n;i++){
            if(a.contains(nums[i])){
                return true;
            }
            a.add(nums[i]);
        }
        return false;
    }
}