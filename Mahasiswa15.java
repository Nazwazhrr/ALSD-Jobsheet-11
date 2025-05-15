public class Mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    public Mahasiswa15(String nim, String nama, String kelas, double ipk) { 
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    
   void tampilInformasi() {
    System.out.printf("%-10s %-15s %-5s %-4.2f\n", nama, nim, kelas, ipk);
    }
}