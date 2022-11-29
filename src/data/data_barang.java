package data;
import entity.entity_barang;

import java.util.ArrayList;

public class data_barang extends entity_barang{
    private ArrayList<entity_barang> dataBarang = new ArrayList<>();

    public data_barang(int kodeBarang, String nama, int harga, int stok) {
        super(kodeBarang, nama, harga, stok);
//        this.dataBarang.add()
    }
}
