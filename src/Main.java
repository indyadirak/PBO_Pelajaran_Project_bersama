import data.data_barang;
import entity.entity_barang2;
public class Main {
    public static void main(String[] args){
        System.out.println("Project PBO 2022");

        //input data kasir
//        data_kasir database_kasir = new data_kasir();
//        database_kasir.create("kurniawan",155,"123");
//        database_kasir.create("aan",156,"123");
//        database_kasir.read(); // viev database kasir
//
//        // cek method update
//        database_kasir.update_pass(111,"111"); //pengujian salah
//        database_kasir.update_pass(155,"111"); //pengujian benar
//        database_kasir.read();
//
//        //cek method delete
//        database_kasir.delete(111); //pengujian salah
//        database_kasir.delete(155); //pengujian benar
//        database_kasir.read();
//
//        //tes login
//        int nip1 = database_kasir.login(156,"111");
//        int nip2 = database_kasir.login(156,"123");

        //data barang
        data_barang DBbarang = new data_barang();
        DBbarang.create(1,"pepsodent",7000,1);
        DBbarang.create(2,"ciptadent",5000,12);
        DBbarang.view();
        System.out.println("==========overload======");
        DBbarang.view(1);
        DBbarang.menu();
    }
}