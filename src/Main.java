import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık degerini giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.println("Sıcaklık 5 dereceden küçük Kayak yapın");
        }
        else if (sicaklik >=5 && sicaklik <=25){
            if (sicaklik <=15){
                System.out.println("Sinamaya gidilebilir");
            }
            if (sicaklik >=10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else {
            System.out.println("Sıcaklık 25 dereceden büyük Yüzmeye gidin");
        }
    }
}
