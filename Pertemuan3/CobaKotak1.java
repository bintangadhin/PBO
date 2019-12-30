class CobaKotak1
{
  public static void main(String[] args) {
    double volume,volume1;
    Kotak k = new Kotak();
    Kotak k1 = new Kotak();
    //memasukan nilai kedalam objek k
    k.panjang = 7;
    k.lebar   = 5;
    k.tinggi  = 6;
    //memasukan nilai kedalam objek k1
    k1.panjang = 7;
    k1.lebar   = 5;
    k1.tinggi  =56;
    //menghilung volume

    volume = k.panjang*k.lebar*k.tinggi;
    volume1 = k1.panjang*k1.lebar*k1.tinggi;
    //mencetak volume
    System.out.println("Volume kubus 1 = "+volume);
    System.out.println("Volume kubus 2 = "+volume1);

  }
}
