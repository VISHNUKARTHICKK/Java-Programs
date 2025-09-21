public class Find1Min {
public static void main(String[] args) {
    int []arr={2,5,8,4,1,6};
    int min=arr[0];
    for (int i=0;i<arr.length;i++) {
        if (min>arr[i]) {
            min=arr[i];
        }
    }
    System.err.println("Smallest Number:"+min);
}
}
