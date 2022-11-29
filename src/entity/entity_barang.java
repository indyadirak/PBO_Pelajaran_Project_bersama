package entity;
public class entity_barang {
    private int kodeBarang;
    private String nama;
    private int harga;
    private int stok;

    public entity_barang(int kodeBarang, String nama, int harga, int stok) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void cetak(){
        System.out.println("kode barang :"+this.kodeBarang);
        System.out.println("nama barang :"+this.nama);
        System.out.println("harga barang:"+this.harga);
        System.out.println("stok barang :"+this.stok);
    }
}



