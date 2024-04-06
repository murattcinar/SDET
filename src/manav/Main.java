package manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * Fiş kısmı için bir method oluşturun
        *
        * method ismi fisBas(), fisCikar() şeklinde isimlendirebilirsiniz
        *
        * methodun çıktısı ==> 1 Kilo Elma: 3.67 TL
        *                      2 Kilo Armut: 4.28 TL
        *                      Toplam Tutar: 7.95 TL
        *
        * şeklinde alınan ürününün kilosu, ismi ve tutarı olacak
        *
        * aynı şekilde KDV hesaplayan bir method daha yazarak, toplam tutar ve KDV'li tutarını hesaplayarak
        * Fişte gösteriniz. KDV oranını 0.20 olarak sabit değişken atayın.
        *
        * En son fiş çıktısı
        *
        * 1 Kilo Elma: 3.67 TL
        * 2 Kilo Armut: 4.28 TL
        * Toplam Tutar: KDV dahil 9.54 TL, KDV: %20
        *
        *
        **/

        Scanner scanner = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double patlicanFiyat = 5.00;
        double toplamTutar = 0;
        int secim;

        do {
            System.out.println("Hangi Ürünleri Eklemek İstersiniz: \n" +
                    "1-Armut " +
                    "2-Elma " +
                    "3-Domates " +
                    "4-Patlıcan " +
                    "0-Fişi Çıkart "
            );
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Armut Kaç Kilo: ");
                    double kgArmut = scanner.nextDouble();
                    System.out.println("Toplam " + kgArmut + " KG Armut Eklendi");
                    toplamTutar += armutFiyat * kgArmut;
                    break;
                case 2:
                    System.out.println("Elma Kaç Kilo: ");
                    double kgElma = scanner.nextDouble();
                    System.out.println("Toplam " + kgElma + " KG Elma Eklendi");
                    toplamTutar += kgElma * elmaFiyat;
                    break;
                case 3:
                    System.out.println("Domates Kaç Kilo: ");
                    double kgDomates = scanner.nextDouble();
                    System.out.println("Toplam " + kgDomates + " KG Domates Eklendi");
                    toplamTutar += domatesFiyat * kgDomates;
                    break;
                case 4:
                    System.out.println("Patlıcan Kaç Kilo: ");
                    double kgPatlican = scanner.nextDouble();
                    System.out.println("Toplam " + kgPatlican + " KG Patlıcan Eklendi");
                    toplamTutar += patlicanFiyat * kgPatlican;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Geçersiz Seçim, Lütfen tekrar deneyiniz...");
            }
        } while (secim != 0);

        /*
        * bu formatın amacı tutarın virgülden sonra 2 basamağını almak için
        * yani normal tutar = 35.71000000000001 TL iken biz aşağıdaki formatlamayı yaptığımız için
        * 35,71 TL şeklinde çıktı alacağız
        * virgülden sonra sadece 2 basamağı gösterecek
        * */

        System.out.println("Toplam Tutar: " + String.format("%.2f",toplamTutar)); // 35,71

        System.out.println("Toplam Tutar: " + toplamTutar + " TL"); // 35.71000000000001
    }
}