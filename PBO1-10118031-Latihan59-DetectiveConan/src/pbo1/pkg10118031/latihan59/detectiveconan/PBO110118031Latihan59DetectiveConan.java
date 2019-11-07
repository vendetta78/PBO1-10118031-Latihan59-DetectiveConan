package pbo1.pkg10118031.latihan59.detectiveconan;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini untuk membuat objek dari anime detective 
 *                     conan.
 */
public class PBO110118031Latihan59DetectiveConan {

    public static void main(String[] args) {
        MainCharacter conan = new MainCharacter("Investigator", "Menyelesaikan Kasus", "Conan Edogawa", "Tokyo", true);
        MainCharacter ran = new MainCharacter("Karate", "Sama seperti Shinichi", "Ran Mouri", "Osaka", false);
        SupportCharacter eisuke = new SupportCharacter("Teman Sekelas Ran Mouri", "Eisuke Hondo", "Osaka", false);
        conan.displayCharacter();
        ran.displayCharacter();
        eisuke.displayCharacter();
    }

}
