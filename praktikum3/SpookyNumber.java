import java.util.Scanner;

public class SpookyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan nama Anda:");
        String nama = scanner.nextLine();
        
        System.out.println("Masukkan NIM Anda:");
        String nim = scanner.nextLine();
        
        System.out.println("Halo, " + nama + " dengan NIM " + nim + ".");
        
        System.out.println("Masukkan nomor lantai yang ingin dituju (1-18):");
        int lantai = scanner.nextInt();
        
        if (lantai == 13) {
            System.out.println("Lantai 13 tidak tersedia di lift. Mengarahkan ke lantai 14.");
        } else if (lantai > 0 && lantai <= 18) {
            System.out.println("Mengarahkan ke lantai " + lantai);
        } else {
            System.out.println("Lantai yang Anda masukkan tidak valid. Harap masukkan nomor lantai antara 1 dan 18.");
        }
        
        scanner.close();
    }
}
