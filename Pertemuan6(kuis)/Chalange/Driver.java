public class Driver{
  public static void main(String[] args) {
  Pemilik pmilik=new Pemilik("Bintang", "Karangtengah");
  Mobil mbl[]=new Mobil[5];
  mbl[0]=new Mobil("Lamborgini", "R 1234 T",2015);
  mbl[1]=new Mobil("Kijang", "R 1235 T" ,2001);
  mbl[2]=new Mobil("Bugati", "R 1236 T",2018);
  mbl[3]=new Mobil("Xpander", "R 1237 T",2018);
  mbl[4]=new Mobil("Ferari", "R 1238 T",2019);

  System.out.println("Nama pemilik: "+pmilik.getNama());
  System.out.println("Alamat : "+pmilik.getAlamat());
  System.out.println("Jumlah : "+pmilik.getJumlahMobil());
  System.out.println("Mobil 1: ");
  System.out.println(" Merek: "+mbl[0].getMerek());
  System.out.println(" Plat : "+mbl[0].getnoPlat());
  System.out.println(" Tahun : "+mbl[0].getTahunKeluaran());
  System.out.println("Mobil 2: ");
  System.out.println(" Merek: "+mbl[1].getMerek());
  System.out.println(" Plat : "+mbl[1].getnoPlat());
  System.out.println(" Tahun : "+mbl[1].getTahunKeluaran());
  System.out.println("Mobil 3: ");
  System.out.println(" Merek: "+mbl[2].getMerek());
  System.out.println(" Plat : "+mbl[2].getnoPlat());
  System.out.println(" Tahun : "+mbl[2].getTahunKeluaran());
  System.out.println("Mobil 4: ");
  System.out.println(" Merek: "+mbl[3].getMerek());
  System.out.println(" Plat : "+mbl[3].getnoPlat());
  System.out.println(" Tahun : "+mbl[3].getTahunKeluaran());
  System.out.println("Mobil 5: ");
  System.out.println(" Merek: "+mbl[4].getMerek());
  System.out.println(" Plat : "+mbl[4].getnoPlat());
  System.out.println(" Tahun : "+mbl[4].getTahunKeluaran());
  }
}
