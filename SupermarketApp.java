import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SupermarketApp {

    // Metode untuk menghasilkan captcha sederhana
    public static String generateCaptcha() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int randomIndex = (int) (Math.random() * chars.length());
            captcha.append(chars.charAt(randomIndex));
        }
        return captcha.toString();
    }

    // Metode untuk mendapatkan tanggal dan waktu saat ini
    public static String getCurrentDateTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(date);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login
        System.out.println("+-----------------------------------------------------+");
        System.out.print("Username : ");
        String username = scanner.nextLine();
        System.out.print("Password : ");
        String password = scanner.nextLine();
        
        String captcha = generateCaptcha();
        System.out.println("Captcha    : " + captcha);
        System.out.print("Masukkan Captcha : ");
        String userCaptcha = scanner.nextLine();

        if (!captcha.equals(userCaptcha)) {
            System.out.println("Login gagal! Silakan ulangi.");
            return;
        }
        System.out.println("Login berhasil!");
        System.out.println("+-----------------------------------------------------+");

        // Tampilkan header supermarket
        String supermarketName = "Supermarket Sejahtera";
        System.out.println("Selamat Datang di " + supermarketName);
        System.out.println("Tanggal dan Waktu : " + getCurrentDateTime());
        System.out.println("+-----------------------------------------------------+");

        // Input data transaksi
        System.out.print("No. Faktur      : ");
        String noFaktur = scanner.nextLine();
        System.out.print("Kode Barang     : ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang     : ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Barang    : ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Jumlah Beli     : ");
        int jumlahBeli = scanner.nextInt();

        // Hitung total
        double total = hargaBarang * jumlahBeli;

        // Tampilkan struk
        System.out.println("+-----------------------------------------------------+");
        System.out.println("No. Faktur      : " + noFaktur);
        System.out.println("Kode Barang     : " + kodeBarang);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.printf("Harga Barang    : %.2f\n", hargaBarang);
        System.out.println("Jumlah Beli     : " + jumlahBeli);
        System.out.printf("TOTAL           : %.2f\n", total);
        System.out.println("+-----------------------------------------------------+");
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Kasir : ");
        String namaKasir = scanner.nextLine();
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Terima kasih telah berbelanja di " + supermarketName + "!");
        System.out.println("+-----------------------------------------------------+");

        scanner.close();
    }
}
