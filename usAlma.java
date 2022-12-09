import java.util.Scanner;
public class usAlma {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz:");
        int sayi= input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz:");
        int us= input.nextInt();
        
        int total=1;
        for(int i=1;i<=us;i++) {
            total *= sayi;
        }
        System.out.println("SONUÇ:"+total);
    }
}
