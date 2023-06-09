
import java.util.Scanner;
public class HesapMakinesiOrnegi {

    static int sum(int a , int b ){
        int result = a+b;
        System.out.println(result);
        return result;

    }
    static int cikarma(int a , int b ){
        int result = a-b;
        System.out.println(result);
        return result;
    }

    static int carpma (int a , int b ){
        int result = a*b;
        System.out.println(result);
        return result;
    }
    static int bolme (int a , int b ){
        int result = a/b;
        return result;
    }
    static int usluSayi(int a , int b){
        int sonuc = 1;
        for (int i = 1; i<=b; i++){

            sonuc*=a;

        }
        System.out.println(sonuc);
        return sonuc;
    }
    static int modAlma(int a,int b, int result){
        return result;
    }
    static void dikdortgen(){


    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Secmek istediginiz isleme tiklayiniz :)");
        String menu = "1- Toplama İslemi\n" +
                "2- Cikarma İslemi\n" +
                "3- Carpma İslemi\n" +
                "4- Bolme İslemi\n" +
                "5- Uslu Sayi Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Diktortgen Alan ve Cevre Hesabi\n" +
                "8- Cikis yap \n";
        System.out.println(menu);

        while(true){
            int islem = scan.nextInt();
            System.out.println("Ilk sayiyi giriniz :) ");
            int a = scan.nextInt();
            System.out.println("Ikinci sayiyi giriniz :) ");
            int b = scan.nextInt();

            switch(islem){
                case 1:
                    sum(a,b);
                break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                  break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    usluSayi(a,b);
                    break;
                default:
                    System.out.println("GECERSİZ SAYİ");
            }

        }


    }
}

