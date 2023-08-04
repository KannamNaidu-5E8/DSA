class Solution {
    public void sortColors(int[] a) {
        int low =0,mid=0,high=a.length-1;
        while(mid<=high)
        {
        if(a[mid]==0)
        {
            swap(a,low,mid);
            low++;
            mid++;
        }
        else if(a[mid]==1)
            mid++;
        else if
            (a[mid]==2){
            swap(a,mid,high);
            high--;
        }
        }
    }
    public void swap(int[] nums , int a ,int b )
    {
        int temp=nums[a];
        nums[a]= nums[b];
        nums[b]=temp;
        
    }
}