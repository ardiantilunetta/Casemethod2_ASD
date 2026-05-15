public class DoubleLinkedListAntrian18 {
    NodeAntrian18 head;
    NodeAntrian18 tail;

    int nomorOtomatis = 1;

    //Menambahkan node baru di belakang linked list
    public void tambahAntrian(String nama, String noHp) {

        Pembeli18 pembeliBaru = new Pembeli18(nama, noHp);

        NodeAntrian18 newNode = new NodeAntrian18(tail, nomorOtomatis, pembeliBaru, null);

        // Jika linked list kosong
        if (head == null) {
            head = tail = newNode;
        } else {

            // Menghubungkan node terakhir dengan node baru
            tail.next = newNode;
            newNode.prev = tail;

            // Tail pindah ke node baru
            tail = newNode;
        }

        System.out.println("Pembeli berhasil masuk antrean");
        System.out.println("Nomor antrean : " + nomorOtomatis);

        nomorOtomatis++;
    }

    public void cetakAntrian() {

        if (head == null) {
            System.out.println("Antrean kosong");
            return;
        }

        NodeAntrian18 current = head;

        System.out.println("\n===== DAFTAR ANTREAN =====");

        while (current != null) {

            System.out.println("No Antrean : " + current.nomorAntrian);
            System.out.println("Nama       : " + current.pembeli.namaPembeli);
            System.out.println("No HP      : " + current.pembeli.noHp);
            System.out.println("--------------------------");

            current = current.next;
        }
    }

    // Karena konsep antrean = FIFO, Pembeli paling depan dipanggil lebih dulu
    public NodeAntrian18 hapusAntrian() {

        if (head == null) {
            System.out.println("Antrean kosong");
            return null;
        }

        NodeAntrian18 dataKeluar = head;

        // Jika hanya ada 1 node
        if (head == tail) {
            head = tail = null;
        } else {

            // Head pindah ke node berikutnya
            head = head.next;

            // Prev head baru dibuat null
            head.prev = null;
        }

        return dataKeluar;
    }
}
