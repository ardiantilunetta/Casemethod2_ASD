public class NodeAntrian18 {
    
    int nomorAntrian;
    Pembeli18 pembeli;

    NodeAntrian18 prev;
    NodeAntrian18 next;

    //Setiap node menyimpan data antrean, alamat node sebelumnya, alamat node berikutnya
    NodeAntrian18(NodeAntrian18 prev, int nomorAntrian, Pembeli18 pembeli, NodeAntrian18 next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.pembeli = pembeli;
        this.next = next;
    }
}
