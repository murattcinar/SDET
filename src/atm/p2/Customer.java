package atm.p2;

public class Customer {
    private String name; //kullanici adi
    private String password; //kullanici sifre

    /*
    * Adagida yapilan sisteme Encapsulation denir.
    * Türkce manası kapsülleme, sarmalama genelde kapsülleme denir.
    * Sistemin guvenligi acisindan yapilan OOP icin onemli olan bir kavramdir.
    * Encapsulation nedir, ne icin kullanilir ve kullanilmadigi zaman ne gibi sorunlar olusur arastirmanizi rica ederim.
    * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}
