package oop.com.game.entity;

import oop.com.game.entity.location.Location;
import oop.com.game.entity.location.NormalLoc;
import oop.com.game.entity.location.SafeHouse;
import oop.com.game.entity.location.ToolStore;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        Player player = new Player();

        System.out.println("Macera Oyununa Hoşgeldiniz ! ");
        System.out.println("Lütfen Bir Karakter İsmi Giriniz : ");

        player.setPlayerName(input.nextLine());

        System.out.println("Sayın " + player.getPlayerName() + " bu karanlık ve sisli adaya hoşgeldiniz !!!" +
                "\nLütfen bir karakter seçiniz...");

        player.selectChar();

        Location location = null;
        while (true) {
            System.out.println("Bölgeler");
            System.out.print("1 - Güvenli Ev --> Burası sizin için güvenli bir ev, düşman yoktur !" +
                    "\n2 - Mağaza --> Silay veya Zırh satın alabilirsiniz !" +
                    "\nLütfen gitmek istediğiniz bölgeyi seçiniz:");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2 :
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (!location.onLocation()) {
                System.out.println("Game Over !");
                break;
            }
        }
    }
}

