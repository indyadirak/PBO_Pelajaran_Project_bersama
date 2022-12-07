package entity;
import java.util.ArrayList;
public class entity_Transaksi
{

    private int id_transaksi, bayar,kembalian, total;

    public entity_Transaksi(int id_transaksi)
    {
        this.id_transaksi = id_transaksi;
    }
    public void proses()
    {
        ArrayList<entity_detail_transaksi> Detail_Transaksi = new ArrayList<>();
    }


}
