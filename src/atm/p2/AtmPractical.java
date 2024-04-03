package atm.p2;

import java.util.Scanner;

public class AtmPractical {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer(); //Customer sinifindan nesne olusturduk. Aynı Scanner sinifinda yaptıgimiz gibi.

        double balance = 1000.0;
        byte input = 3;
        byte process;


        while (true) {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            customer.setName(scanner.nextLine()); //kullanici adini Customer sinifindan cagirdik
            System.out.print("Şifrenizi Giriniz : ");
            customer.setPassword(scanner.nextLine());//kullanici sifresini Customer sinifindan cagirdik
            if (customer.getName().equals("Wisa") && customer.getPassword().equals("Password1")) {

                System.out.println("......BANKAMIZA HOŞGELDİNİZ......"
                        + "\n......Yapmak İstediğiniz İşlemi Seçiniz......");
                do {
                    System.out.println(
                            "Para Yatırma: 1" +
                                    "\nPara Çekme: 2" +
                                    "\nBakiye Sorgula: 3" +
                                    "\nÇıkış Yap: 4"
                    );
                    process = scanner.nextByte();
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
                } while (process != 4);
                System.out.println("Çıkış yapıldı.");
            } else {
                input--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz:");
                if (input == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                    System.exit(0);
                }
            }
        }
    }
}