class PassWord{
    private String PassWord="Karthick";

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
public class Encapsulation{

    public static void main(String[] args) {
        PassWord p=new PassWord();
       String str= p.getPassWord();
        System.out.println(str);
        p.setPassWord("Vishnu");
        System.out.println(p.getPassWord());
    }

}