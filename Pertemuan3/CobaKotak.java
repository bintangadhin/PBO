class CobaKotak
{
  public static void main(String[] args) {
    double volume;
    Kotak k = new Kotak();
    //memasukan nilai kedalam objek
    k.panjang = 7;
    k.lebar   = 5;
    k.tinggi  = 6;
    //menghilung volume

    volume = k.panjang*k.lebar*k.tinggi;
    //mencetak volume
    System.out.println("Volume kubus = "+volume);
  }
}
