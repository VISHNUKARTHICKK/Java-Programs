public class MethodOverloading {
    void send(int a,int b){
        System.out.println(a+b);
    }
    void send(String a,int b)
    {
        System.out.println(a+" "+b);
    }
    void send(int a,String b){
        System.out.println(a+" "+b);
    }
    void sent(int a){
        System.out.println(a);
    }
  public static void main(String[] args) {
    MethodOverloading obj=new MethodOverloading();
    obj.send(5,10);
    obj.send("Hello",20);
    obj.send(30,"World");
    obj.sent(100);
  }
}
