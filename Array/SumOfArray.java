public class SumOfArray {
   public static void main(String[] args) {
        int [] arr={2,5,8,4,1,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array is:"+sum);
   }
}
