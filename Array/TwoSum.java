public class TwoSum {
public static void main(String[] args) {
    int [] arr={1,8,15,2,5};
    int target=13;

    for (int i=0;i<arr.length;i++) {
        for (int j=i+1;j<arr.length;j++) {
            if (arr[i]+arr[j]==target) {
                System.out.println("Index of the two numbers are: "+i+" and "+j);
            }
        }
    }
    

}
}
