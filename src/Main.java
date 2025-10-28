import java.util.Scanner;
public class Main {
    public static void maskCreditCard() {
        String s="123456";
        if (s.length()<12){
            System.out.println("Invliad");
            return;
        }
        for(int i=0;i<s.length();i=i+4){
            if (i<8){
                System.out.print("XXXX-");
            }
            else{
                System.out.print(s.substring(i,i+4));
            }


        }


    }
    public static void main(String[] args) {
       Main.maskCreditCard();

    }
}