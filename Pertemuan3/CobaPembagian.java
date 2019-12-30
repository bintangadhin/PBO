class CobaPembagian{
  public static void main(String[] args) {
    Pembagian P = new Pembagian();
    int x   =P.bagi(10,4);
    double y=P.bagi(10.0,4.0);
    //
    System.out.println("Hasil bagi tipe int   : "+x);
    System.out.println("Hasil bagi tipe double: "+y);
  }
}
