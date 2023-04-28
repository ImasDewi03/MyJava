//Imas Dewi O.N.I 21091397053
package tugas;
class org{
    protected String nama;
    protected int umur;
    
    public Orang(Sting nama){
        this.nama=nama;
    }
    public Orang(String nama, int umur){
        this.nama=nama;
        this.umur=umur;
    }
}

class Dosen extends Orang{
    private int nip;
    public Dosen(String nama){
        super(nama);
    }
    public Dosen(String nama, int nip){
        super(nama);
        this.nip=nip;
    }
    public Dosen(String nama, int nip, int umur){
        super(nama,umur);
        this.nip=nip;
    }
    
    public void info(){
        System.out.printIn("Nama: "+nama);
        System.out.printIn("NIP: "+nip);
        System.out.printIn("Umur: "+umur);
    }
}