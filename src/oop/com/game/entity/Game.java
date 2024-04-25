package oop.com.game.entity;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        Player player = new Player();

        System.out.println("Macera Oyununa Hoşgeldiniz ! ");
        System.out.println("Lütfen Bir Karakter İsmi Giriniz : ");

        player.setPlayerName(input.nextLine());

        System.out.println("Sayın " + player.getPlayerName()+ " bu karanlık ve sisli adaya hoşgeldiniz !!!" +
                "\nLütfen bir karakter seçiniz...");

        player.selectChar();

        while (true) {
            player.selectLoc();
        }
    }
}
