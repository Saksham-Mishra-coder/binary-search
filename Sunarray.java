public class Sunarray {
    public static void subArray(int numbers[]){
        int totalSum = 0;
        for(int i=0 ; i<numbers.length;i++){
            
            for(int j = i; j<numbers.length; j++ ){
                int subArraySum = 0;
                
                for (int k=i; k<=j; k++){
                    System.out.print(numbers[k]+ " ");
                     subArraySum+=numbers[k];
                    }
                    totalSum+=subArraySum;
                System.out.println("sum of this subArray"+subArraySum);
            }
            System.out.println();
        }
        System.out.println("total sum of sunArray is"+ totalSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subArray(numbers);

    }
}
