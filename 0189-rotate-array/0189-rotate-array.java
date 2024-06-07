class Solution {
    static int[] reverse(int[] a,int c,int b){
        int mid= (c+b)/2;
      for(int i=c, j=b; i<=mid && j>= mid; i++,j--){
        int temp = a[i];
        a[i]= a[j];
        a[j]=  temp;
      }
      return a;
    }
    public void rotate(int[] nums, int k) {
          k= k%nums.length;
        int[] x=reverse(nums,0,nums.length-1);
        int[] y=reverse(x,0,k-1);
        int[] z= reverse(y,k,nums.length-1);
        

    }
}