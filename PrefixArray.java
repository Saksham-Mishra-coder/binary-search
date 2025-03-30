public class PrefixArray {
   public static int maxPrefixSum(int nums[]){
    int minSum = Integer.MAX_VALUE;
    int prefix[]= new int[nums.length];
    prefix[0]=nums[0];
    for (int i= 1; i<nums.length;i++){
        prefix[i]= prefix[i-1]+nums[i];
    }
    for(int i=0; i<nums.length; i++){
        for(int j=i; j<nums.length; j++){
            int currSum =0;
            currSum= i ==0?prefix[j]:prefix[j]-prefix[i-1];
            if(minSum>currSum){
                minSum=currSum; 
            }
            System.out.println(currSum);
        }
        
    }
    System.out.println("max sum is "+ minSum);
    return 0;
   } 
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        maxPrefixSum(nums);
    }
}
