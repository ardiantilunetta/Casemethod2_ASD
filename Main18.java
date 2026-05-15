import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DoubleLinkedListAntrian18 antrian = new DoubleLinkedListAntrian18();

        DoubleLinkedListPesanan18 daftarPesanan = new DoubleLinkedListPesanan18();

        int pilih;

        do {

            System.out.println("\n==============================");
            System.out.println(" SISTEM ANTREAN ROYAL DELISH ");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrean");
            System.out.println("2. Cetak Antrean");
            System.out.println("3. Hapus Antrean + Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String noHp = sc.nextLine();

                    antrian.tambahAntrian(nama, noHp);

                    break;

                case 2:

                    antrian.cetakAntrian();

                    break;

                case 3:

                    // Data pembeli yang keluar disimpan pada variabel pembeliDilayani
                    NodeAntrian18 pembeliDilayani = antrian.hapusAntrian();

                    if (pembeliDilayani != null) {

                        System.out.println("\nPembeli Dipanggil");
                        System.out.println("No Antrean : " + pembeliDilayani.nomorAntrian);

                        System.out.println("Nama : " + pembeliDilayani.pembeli.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        // Membuat object pesanan baru, kemudian disimpan ke linked list pesanan
                        Pesanan18 pesananBaru = new Pesanan18(kode, namaPesanan, harga);

                        daftarPesanan.tambahPesanan(pesananBaru);

                        System.out.println("Pesanan berhasil disimpan");
                    }

                    break;

                case 4:

                    daftarPesanan.tampilPesanan();

                    break;

                case 5:

                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 5);
    }
}
