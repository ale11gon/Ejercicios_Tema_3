/*Segunda parte*/
class coche{
  int puertas;
  
  public void incrementaPuerta(){
    puertas++;
    }
}

public class Main {
  /*Primera parte*/
     static int suma3(int a,int b,int c) {
      int x = a+b+c;
      return x;
   }
    public static void main(String[] args) {
  /*Primera parte*/
       System.out.println(suma3(10,20,40));
  /*Segunda parte*/    
        coche miCoche = new coche();
        miCoche.incrementaPuerta();
       System.out.println(miCoche.puertas);
    }
}