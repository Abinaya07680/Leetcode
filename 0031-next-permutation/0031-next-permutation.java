class Solution {
    public void swap(int[]arr,int l,int r){
    int tem=arr[l];
    arr[l]=arr[r];
    arr[r]=tem;
    }
    public void reverse(int []arr,int s,int e){
        while(s<=e){ 
    int temp=arr[s];
    arr[s]=arr[e];
    arr[e]=temp;
    s++;e--;
    }}

    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){ 
        int j=nums.length-1;
        while(nums[j]<=nums[i]){
          j--;
        }
        swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    }
