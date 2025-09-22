public class AverageOfArray {
    public static void main(String[] args) {
        int [] arr={2,5,8,4,1,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }   
        int avg=sum/arr.length;
        System.out.println("Average of Array is:"+avg);
    }
}
