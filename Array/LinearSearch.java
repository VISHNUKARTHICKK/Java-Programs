public class LinearSearch {
  public static void main(String[] args) {
    int [] arr={2,5,8,4,1,6};
    int no=8;
    boolean flag=false;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i]==no) {
            System.out.println("Element is present in the index of: "+i);
            flag=true;
            break;
        }
      }
      if (flag==false) {
        System.out.println("Element is not present in the array"); 
        
      } 
     }
}
