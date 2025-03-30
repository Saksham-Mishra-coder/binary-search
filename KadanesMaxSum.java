public class KadanesMaxSum {
    public static void maxSum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i =0;i<nums.length;i++){
            if (nums[i]<0){
                maxSum = Math.max(maxSum, nums[i]);
            }
            currSum+=nums[i];
            System.out.println(currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("max sum is "+ maxSum);
    }
    public static void main(String[] args) {
        int nums[]= {-2,-3,-4,-1,-2,-1,-5,-3};
        maxSum(nums);
    }
    
}
