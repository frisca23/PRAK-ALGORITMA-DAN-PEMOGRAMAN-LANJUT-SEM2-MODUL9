import java.util.Scanner;
public class AplikasiTugas {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;

        do {
            displayMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    menghitungLuas();
                    break;
                case 2:
                    mengubahSuhu();
                    break;
                case 3:
                    cetakNomorAcak();
                    break;
                case 4:
                    keluarAplikasi();
                    break;
                default:
                    System.out.println("Terjadi kesalahan, masukkan kembali nomor antara 1-4");
            }
        } while (pilihan != 4);

        System.out.println("Terimakasih telah menggunakan Aplikasi!");
    }

    private static void displayMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Menghitung Luas");
        System.out.println("2. Mengubah Suhu");
        System.out.println("3. Cetak Nomor Acak");
        System.out.println("4. Keluar Aplikasi");
        System.out.print("Masukkan Pilihan (1-4): ");
    }

    private static void menghitungLuas() {
        System.out.print("Masukkan bentuk (persegi, segitiga, lingkaran): ");
        String bentuk = scanner.nextLine().toLowerCase();

        switch (bentuk) {
            case "persegi":
                System.out.print("Masukkan Panjang Sisi: ");
                double panjangSisi = scanner.nextDouble();
                System.out.println("Luas Persegi : " + (panjangSisi * panjangSisi));
                break;
            case "segitiga":
                System.out.print("Masukkan Alas Segitiga : ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan Tinggi Segitiga: ");
                double tinggi = scanner.nextDouble();
                System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi));
                break;
            case "lingkaran":
                System.out.print("Masukkan radius Lingkaran: ");
                double radius = scanner.nextDouble();
                System.out.println("Luas Lingkaran: " + (Math.PI * radius * radius));
                break;
            default:
                System.out.println("Bentuk Tidak Valid.");
        }
    }

    private static void mengubahSuhu() {
        System.out.print("Masukkan skala suhu awal (Celcius/Fahrenheit): ");
        String sekalaAwal = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan Nilai Suhu : ");
        double temperature = scanner.nextDouble();

        switch (sekalaAwal) {
            case "celsius":
                double fahrenheit = (temperature * 9.0 / 5.0) + 32.0;
                System.out.println(temperature + " derajat suhu = " + fahrenheit + " derajat Fahrenheit.");
                break;
            case "fahrenheit":
                double celsius = (temperature - 32.0) * 5.0 / 9.0;
                System.out.println(temperature + " derajat fahrenheit = " + celsius + " derajat Celsius.");
                break;
            default:
                System.out.println("Skala suhu awal tidak valid.");
        }
    }

    private static void cetakNomorAcak() {
        System.out.print("Masukkan batas bawah: ");
        int batasBawah = scanner.nextInt();
        System.out.print("Masukkan batas atas: ");
        int batasAtas = scanner.nextInt();

        if (batasBawah > batasAtas) {
            System.out.println("Batas bawah tidak boleh lebih besar dari batas atas.");
            return;
        }

        int nomorAcak = (int) (Math.random() * (batasAtas - batasBawah + 1)) + batasBawah;
        System.out.println("Nomor Acak Antara " + batasBawah + " dan " + batasAtas + ": " + nomorAcak);
    }

    private static void keluarAplikasi() {
        System.out.println("Keluar dari Aplikasi...");
    }
}
