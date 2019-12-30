public class Pemilik{
  private String nama;
  private String alamat;
  private int jumlahMobil=5;
  private String[] noPlatMobil=new String[5];

  public Pemilik( String nama, String alamat){
    this.nama=nama;
    this.alamat=alamat;
  }
  public void jualMobil(String jmobil){
  this.noPlatMobil[jumlahMobil]=jmobil;
  this.jumlahMobil--;
  }

  public void beliMobil(String bmobil){
  this.noPlatMobil[jumlahMobil]=bmobil;
  this.jumlahMobil++;
  }
  public String getNama(){
    return nama;
  }
  public String getAlamat(){
    return alamat;
  }
  public int getJumlahMobil(){
    return jumlahMobil;
  }
  public String getNoPlatMobil(){
    return this.noPlatMobil[5];
  }


}
