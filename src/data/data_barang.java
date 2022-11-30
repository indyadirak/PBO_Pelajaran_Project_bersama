package data;
import entity.entity_barang2;
import java.util.ArrayList;
import java.util.Scanner;

public class data_barang {
    Scanner input = new Scanner(System.in);
    private ArrayList <entity_barang2> data_barang;
    int input_menu, input_menu_perubahan;

    public data_barang()
    {
        this.data_barang = new ArrayList<>();
        //pertanyaan 1.
    }

    public void create(int kode, String nama, int harga, int stok)
    {
        this.data_barang.add(new entity_barang2(kode,nama,harga,stok));
    }

    public void view()
    {
        for (int i=0;i<this.data_barang.size();i++)
        {
            this.data_barang.get(i).cetak();
        }
    }

    public void menu()
    {
        System.out.println("menu :");
        System.out.println("1. mengubah data");
        System.out.println("2. tampilkan data");
        System.out.println("3. hapus data");
        System.out.println("4. exit");
        System.out.println(" ");
        System.out.print("masukkan pilihan : ");
        input_menu = input.nextInt();
        proses_menu();
    }
    public void proses_menu()
    {
        switch (input_menu)
        {
            case 1:
            {
                menu_pengubah_data();
                menu();
                break;
            }
            case 2:
            {
                proses_output();
                menu();
                break;
            }
            case 3:
            {
                proses_hapus_data();
                menu();
                break;
            }
            case 4:
            {
                return;
            }
        }
    }

    public void menu_pengubah_data()
    {
        System.out.println("menu pengubah data");
        System.out.println("1. kode barang");
        System.out.println("2. nama barang");
        System.out.println("3. harga barang");
        System.out.println("4. stok barang");
        System.out.println("5. kembali ke menu sebelumnya");
        System.out.println(" ");
        System.out.printf("masukkan pilihan : ");
        input_menu_perubahan = input.nextInt();
        proses_pengubahan_data();

    }

    public void proses_pengubahan_data()
    {
        switch (input_menu_perubahan)
        {
            case 1:
            {
                proses_perubahan_data_pilihan_1();
                menu_pengubah_data();
                break;
            }
            case 2:
            {
                proses_perubahan_data_pilihan_2();
                menu_pengubah_data();
                break;
            }
            case 3:
            {
                proses_perubahan_data_pilihan_3();
                menu_pengubah_data();
                break;
            }
            case 4:
            {
                proses_perubahan_data_pilihan_4();
                menu_pengubah_data();
                break;
            }
            case 5:
            {
                menu();
                break;
            }
        }
    }

    public void proses_perubahan_data_pilihan_1()
    {
        boolean cek_keadaan = false;
        System.out.print("masukkan id barang : ");
        int input_id = input.nextInt();

        for (int perulangan = 0 ; perulangan < data_barang.toArray().length; perulangan++)
        {
            if (data_barang.get(perulangan).getKodeBarang() == input_id)
            {
                System.out.print("id barang                : " + data_barang.get(perulangan).getKodeBarang());
                System.out.printf("masukkan id barang baru : ");
                input_id = input.nextInt();
                data_barang.get(perulangan).setKodeBarang(input_id);
                cek_keadaan = true;
            }
        }

        if (cek_keadaan == false)
        {
            System.out.println("mohon maaf, data tidak ada / salah");
        }

    }

    public void proses_perubahan_data_pilihan_2()
    {
        boolean cek_keadaan = false;
        System.out.print("masukkan id barang : ");
        int input_id = input.nextInt();

        for (int perulangan = 0 ; perulangan < data_barang.toArray().length; perulangan++)
        {
            if (data_barang.get(perulangan).getKodeBarang() == input_id)
            {
                System.out.print("nama barang                : " + data_barang.get(perulangan).getNama());
                System.out.printf("masukkan nama barang baru : ");
                String input_nama = input.next();
                data_barang.get(perulangan).setNama(input_nama);
                cek_keadaan = true;
            }
        }

        if (cek_keadaan == false)
        {
            System.out.println("mohon maaf, data tidak ada / salah");
        }
    }

    public void proses_perubahan_data_pilihan_3()
    {
        boolean cek_keadaan = false;
        System.out.print("masukkan id barang : ");
        int input_id = input.nextInt();

        for (int perulangan = 0 ; perulangan < data_barang.toArray().length; perulangan++)
        {
            if (data_barang.get(perulangan).getKodeBarang() == input_id)
            {
                System.out.print("harga barang                : " + data_barang.get(perulangan).getNama());
                System.out.printf("masukkan harga barang baru : ");
                int input_harga = input.nextInt();
                data_barang.get(perulangan).setHarga(input_harga);
                cek_keadaan = true;
            }
        }

        if (cek_keadaan == false)
        {
            System.out.println("mohon maaf, data tidak ada / salah");
        }
    }

    public void proses_perubahan_data_pilihan_4()
    {
        boolean cek_keadaan = false;
        System.out.print("masukkan id barang : ");
        int input_id = input.nextInt();

        for (int perulangan = 0 ; perulangan < data_barang.toArray().length; perulangan++)
        {
            if (data_barang.get(perulangan).getKodeBarang() == input_id)
            {
                System.out.print("stok barang                : " + data_barang.get(perulangan).getNama());
                System.out.printf("masukkan stok barang baru : ");
                int input_stok = input.nextInt();
                data_barang.get(perulangan).setStok(input_stok);
                cek_keadaan = true;
            }
        }

        if (cek_keadaan == false)
        {
            System.out.println("mohon maaf, data tidak ada / salah");
        }
    }

    public  void proses_output()
    {
        for (int perulangan = 0; perulangan < data_barang.toArray().length; perulangan++)
        {
            System.out.println("");
            System.out.println("===============================");
            System.out.println("nama barang     : "+data_barang.get(perulangan).getNama());
            System.out.println("kode barang     : "+data_barang.get(perulangan).getKodeBarang());
            System.out.println("harga barang    : "+data_barang.get(perulangan).getHarga());
            System.out.println("stok barang     : "+data_barang.get(perulangan).getStok());
            System.out.println("===============================");
        }
    }

    public void proses_hapus_data()
    {
        System.out.print("masukkan id barang : ");
        int id_barang = input.nextInt();
        data_barang.remove(id_barang-1);
    }
    public void view(int index)
    {
        this.data_barang.get(index).cetak();
    }
}
