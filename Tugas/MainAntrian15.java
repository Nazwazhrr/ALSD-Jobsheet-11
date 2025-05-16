import java.util.Scanner;
public class MainAntrian15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrian15 antrian = new QueueAntrian15();

        int pilih;
        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Daftar (Masuk Antrian)");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Antrian Kosong?");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Lihat Depan & Belakang");
            System.out.println("7. Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa15(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilAntrian();
                    break;
                case 4:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Masih ada antrian.");
                    break;
                case 5:
                    antrian.clear();
                    break;
                case 6:
                    antrian.tampilDepanBelakang();
                    break;
                case 7:
                    antrian.jumlahAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
