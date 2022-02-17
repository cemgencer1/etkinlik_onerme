import java.util.Scanner;

public class etkinlik_onerme {
    public static void main(String[]args){
        double sicaklik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz :");
        sicaklik = inp.nextDouble();

        if (sicaklik<5){
            System.out.println("Kayak Yapınız.");
        }else if (sicaklik<10){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }else if ((sicaklik>=10) && (sicaklik<15)){
            System.out.println("Sinamayada Gidebilirsiniz Pikniğede.");
        }else if (sicaklik<25){
            System.out.println("Pikniğe Gidebilirsiniz.");
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}
