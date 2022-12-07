package data;
import data.data_barang;

import java.util.ArrayList;
import java.util.Scanner;

public class detail_transaksi
{
    Scanner input = new Scanner(System.in);


    private ArrayList list_barang = new ArrayList<>();

    void input_barang_transaksi()
    {

        System.out.print("masukkan id barang : ");
        int id_barang = input.nextInt();
    }
}
