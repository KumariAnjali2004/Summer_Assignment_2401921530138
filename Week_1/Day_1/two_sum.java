class Solution {
    public int[] twoSum(int[] arr, int x) {
      for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==x){
                return new int[]{i,j};
            }          
             }
    }return new int[]{};
}
}
