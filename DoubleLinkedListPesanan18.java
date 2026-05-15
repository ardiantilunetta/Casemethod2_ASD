public class DoubleLinkedListPesanan18 {
    NodePesanan18 head;
    NodePesanan18 tail;

    // Ditambahkan di akhir linked list
    public void tambahPesanan(Pesanan18 pesanan) {

        NodePesanan18 newNode =
                new NodePesanan18(tail, pesanan, null);

        if (head == null) {
            head = tail = newNode;
        } else {

            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;
        }
    }
       
    // Mengurutkan berdasarkan nama pesanan (BUBBLE SORT)
    public void sortPesanan() {

        // Jika data kosong atau hanya 1
        if (head == null || head.next == null) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;

            NodePesanan18 current = head;

            while (current.next != null) {

                // Membandingkan string tanpa memperhatikan huruf besar kecil
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {

                    // Tukar data pesanan
                    Pesanan18 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    public void tampilPesanan() {

        if (head == null) {
            System.out.println("Belum ada pesanan");
            return;
        }

        // Sorting sebelum ditampilkan
        sortPesanan();

        NodePesanan18 current = head;

        System.out.println("\n===== LAPORAN PESANAN =====");

        while (current != null) {

            System.out.println("Kode Pesanan : " + current.pesanan.kodePesanan);

            System.out.println("Nama Pesanan : " + current.pesanan.namaPesanan);

            System.out.println("Harga        : " + current.pesanan.harga);

            System.out.println("---------------------------");

        }
    }
}
