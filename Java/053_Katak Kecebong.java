//Imas Dewi O.N.I 21091397053
package tugas;
class katak{
    int umur;
    String nama;
    public Katak(int umur, String nama){
        this.umur=umur;
        this.nama=nama;
    }
public String caraBergerak(){
    if(umur>2){
        return "melompat";
    }else
    {
        return"berenang";
    }
}
}
class Kecebong extends Katak{
    double panjangEkor;
    public Kecebong(int umur, String nama, double panjangEkor){
        super(umur,nama);
        this.panjangEkor=panjangEkor;
    }
}
package tugas;
public class katak{
    public static void main(String args[]){
        Katak 01=new Katak(5, "Froggy");
        Kecebong 02 = new Kecebong(2,"Junior Frog",10);
        System.out.printIn("Obyek 01");
        System.out.printIn("Umur:"+01.umur);
        System.out.printIn("Nama:"+01.nama);
        System.out.printIn("Cara Bergerak:"+01.caraBergerak());
        System.out.printIn();
        System.out.printIn("Objek 02");
        System.out.printIn("Umur:"+02.umur);
        System.out.printIn("Nama:"+02.nama);
        System.out.printIn("Panjang Ekor:"+02.panjangEkor);
        System.out.printIn("Cara Bergerak:"+02.caraBergerak());
    }
}