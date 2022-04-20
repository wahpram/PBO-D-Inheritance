import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarasi Variabel
        int hp = 100;
        int ap = 10;
        int ms = 50;
        int as = 5;
        int pilihan, pilih;

        //Pembuatan Scanner
        Scanner karakter = new Scanner(System.in);

        //Pembuatan objek pada setiap kelas
        Karakter charac = new Karakter();
        Hero heroo = new Hero();
        Enemy enemyy = new Enemy();
        Archer arcerr = new Archer();
        Enderman ender = new Enderman();
        Golem golemm = new Golem();
        Pillager pillagerr = new Pillager();

        System.out.println("---------------------------------");
        System.out.println("--- Pilih Jenis Karakter Anda ---");
        System.out.println("---------------------------------");
        System.out.println("1. Hero");
        System.out.println("2. Enemy");
        System.out.print("=> ");
        //Scanner
        pilihan = karakter.nextInt();

        //Percabangan
        if (pilihan == 1){
            System.out.println("---------------------------");
            System.out.println("--- Pilih Karakter Anda ---");
            System.out.println("---------------------------");
            System.out.println("1. Archer");
            System.out.println("2. Golem");
            System.out.print("=> ");

            //Scanner
            pilih = karakter.nextInt();

            //Menampilkan objek
            charac.base();
            charac.hitpoint(hp);
            charac.attackpoint(ap);
            heroo.sifat();

            //Percabangan
            if (pilih == 1){
                //Menampilkan objek
                arcerr.applus(ap);
                arcerr.specialattack();
            }
            else if (pilih == 2){
                //Menampilkan objek
                golemm.hpplus(hp);
                golemm.specialattack();
            }
        }
        else if (pilihan == 2){
            System.out.println("---------------------------");
            System.out.println("--- Pilih Karakter Anda ---");
            System.out.println("---------------------------");
            System.out.println("1. Pillager");
            System.out.println("2. Enderman");
            System.out.print("=> ");

            //Scanner
            pilih = karakter.nextInt();

            //Menampilkan objek
            charac.base();
            charac.hitpoint(hp);
            charac.attackpoint(ap);
            enemyy.sifat();

            //Percabangan
            if (pilih == 1){
                //Menampilkan objek
                pillagerr.asplus(as);
                pillagerr.specialattack();
            }
            else if (pilih ==2){
                //Menampilkan objek
                ender.msplus(ms);
                ender.specialattack();
            }
        }
    }
}
