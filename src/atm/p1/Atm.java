package atm.p1;

import calculator.Main;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * Asagida sisteme giris yaparken, dogrulama yapacagimiz kullanici field'leri tanimladik
        * */
        String username;
        String password;

        /*
        * Bu kisimda sistemde bulunan, bakiye = balance, giris hakki = input, ve islem = process field'lerini tanimladik
        * */
        double balance = 1000.0;
        byte input = 3;
        byte process;


        while (true) { /* while (true) bizim icin sonsuz dongu olusturu ve biz istemeden dongu bozulmaz
                        * bunu yapmamizin sebebi cikis yapma ozelliginin sistemde olmasi
                        */

            System.out.print("Kullanıcı Adınızı Giriniz : ");
            username = scanner.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = scanner.nextLine();
            /* Kolay bir dogrulama islemi yaptik kullanici adinin ve sifreyi kendimiz olusturduk
            *  Giris yaparken terminalde Wisa ve Password1 yazdiktan sonra bosluk birakirsaniz, "Wisa " "Password1 " gibi
            *  kullanici adi ve sifreyi yanlis girmis olursunuz cünkü bosluk karakterdir ve sistem onu karakter olarak algılar */

            if (username.equals("Wisa") && password.equals("Password1")) {


                System.out.println("......BANKAMIZA HOŞGELDİNİZ......"
                        + "\n......Yapmak İstediğiniz İşlemi Seçiniz......");
                do {
                    System.out.println(
                            "Para Yatırmak İçin: 1" +
                                    "\nPara Çekmek İçin: 2" +
                                    "\nBakiye Sorgulamak İçin: 3" +
                                    "\nÇıkış Yapmak İçin: 4'ü Tuşlayınız"
                    ); // Kullaniciya yapilacak islemler icin bilgi verildi

                    process = scanner.nextByte();//Yapilacak islem icin kullanicidan deger alindi
                    switch (process) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı yazınız : ");
                            double amount = scanner.nextDouble();
                            balance += amount;
                            System.out.println("İşleminiz gerçekleştirildi. Güncel Bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı yazınız.");
                            double minAmount = scanner.nextDouble();
                            if (minAmount > balance)
                                System.out.println("Bakiyeniz yetersiz. Bakiyeniz : " + balance);
                            else {
                                balance -= minAmount;
                                System.out.println("İşleminiz gerçekleştirildi. Kalan bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + balance);
                            break;
                    }
                } while (process != 4);//Kullanici cikis yapmak icin 4'e basmadigi sürece while dongusu calismaya devam edecek
                System.out.println("Çıkış yapıldı.");
            } else {
                input--; //kullanici adini ve sifresini 3 defa yanlis girerse hesabı bloke ediliyor
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz:");
                if (input == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                    System.exit(0);
                }
            }
        }
    }
}
