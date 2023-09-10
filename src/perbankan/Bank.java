package perbankan;

public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah = 0;
    
    public Bank(){
        nasabah = new Nasabah[100];
    };
    
    public void tambahNasabah(String namaAwal, String namaAkhir){
        nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        jumlahNasabah++;
    }
    
    public int getJumlahNasabah(){
        return jumlahNasabah;
    }
    
    public Nasabah getNasabah(int indeks){
        return nasabah[indeks];
    }
    
    public int getIndexNasabah(String namaAwal, String namaAkhir) {
        int index = 0;
        for(Nasabah nasabah :this.nasabah) {
            if(nasabah.getNamaAwal().equals(namaAwal) && nasabah.getNamaAkhir().equals(namaAkhir)) {
                return index;
            }
            index++;
        }
        return 0;
    }
}
