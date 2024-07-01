import java.util.Scanner;
public class Tugas1b {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi karakter baris baru

            switch (choice) {
                case 1:
                    hitungLuas();
                    break;
                case 2:
                    konversiSuhu();
                    break;
                case 3:
                    cetakBilanganAcak();
                    break;
                case 4:
                    keluarAplikasi();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka antara 1 dan 4.");
            }
        } while (choice != 4);

        System.out.println("Terima kasih telah menggunakan aplikasi ini!");
    }

    private static void displayMenu() {
        System.out.println("\nMenu Utama:");
        System.out.println("1. Hitung Luas");
        System.out.println("2. Konversi Suhu");
        System.out.println("3. Cetak Bilangan Acak");
        System.out.println("4. Keluar Aplikasi");
        System.out.print("Masukkan pilihan Anda (1-4): ");
    }

    private static void hitungLuas() {
        System.out.print("Masukkan jenis bangun datar (persegi, segitiga, lingkaran): ");
        String bentuk = scanner.nextLine();

        switch (bentuk.toLowerCase()) {
            case "persegi":
                System.out.print("Masukkan panjang sisi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Luas persegi: " + (sisi * sisi));
                break;
            case "segitiga":
                System.out.print("Masukkan alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = scanner.nextDouble();
                System.out.println("Luas segitiga: " + (0.5 * alas * tinggi));
                break;
            case "lingkaran":
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                System.out.println("Luas lingkaran: " + (Math.PI * jariJari * jariJari));
                break;
            default:
                System.out.println("Bentuk yang dimasukkan tidak valid.");
        }
    }

    private static void konversiSuhu() {
        System.out.print("Masukkan skala suhu awal (Celsius/Fahrenheit): ");
        String skalaAwal = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan nilai suhu: ");
        double suhu = scanner.nextDouble();

        switch (skalaAwal) {
            case "celsius":
                double fahrenheit = (suhu * 9.0 / 5.0) + 32.0;
                System.out.println(suhu + " derajat Celsius sama dengan " + fahrenheit + " derajat Fahrenheit.");
                break;
            case "fahrenheit":
                double celcius = (suhu - 32.0) * 5.0 / 9.0;
                System.out.println(suhu + " derajat Fahrenheit sama dengan " + celcius + " derajat Celsius.");
                break;
            default:
                System.out.println("Skala suhu awal tidak valid.");
        }
    }

    private static void cetakBilanganAcak() {
        System.out.print("Masukkan batas bawah: ");
        int batasBawah = scanner.nextInt();
        System.out.print("Masukkan batas atas: ");
        int batasAtas = scanner.nextInt();

        if (batasBawah > batasAtas) {
            System.out.println("Batas bawah tidak boleh lebih besar dari batas atas.");
            return;
        }
        int bilanganAcak = (int) (Math.random() * (batasAtas - batasBawah + 1)) + batasBawah;
        System.out.println("Bilangan acak antara " + batasBawah + " dan " + batasAtas + ": " + bilanganAcak);

        private static void keluarAplikasi() {
            System.out.println("Menutup Aplikasi...");
		}
	}
}

