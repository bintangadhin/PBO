public class CobaShinobi{
  public static void main(String[] args){
    ShinobiKonoha[] m = new ShinobiKonoha[3];

    m[0] =new ShinobiKonoha();
    m[0].setNoRegistrasI("012606");
    m[0].setNama("Uchiha Sasuke");
    m[0].setPeringkat("Genin");


    m[1] = new ShinobiKonoha();
    m[1].setNoRegistrasI("012607");
    m[1].setNama("Uzumaki Naruto");
    m[1].setPeringkat("Genin");

    m[2] = new ShinobiKonoha();
    m[2].setNoRegistrasI("012601");
    m[2].setNama("Haruno Sakura");
    m[2].setPeringkat("Chunin");

    System.out.println("Data shinobi ");
    for(ShinobiKonoha x:m){
      System.out.println("No. Registrasi : " +x.getNoRegistrasI());
      System.out.println("Nama : " +x.getNama());
      System.out.println("Peringkat : " +x.getPeringkat());
      System.out.println();
    }
  }
}
