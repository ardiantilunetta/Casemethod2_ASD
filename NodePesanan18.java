public class NodePesanan18 {
    Pesanan18 pesanan;

    NodePesanan18 prev;
    NodePesanan18 next;

    NodePesanan18(NodePesanan18 prev, Pesanan18 pesanan, NodePesanan18 next) {
        this.prev = prev;
        this.pesanan = pesanan;
        this.next = next;
    }
}
