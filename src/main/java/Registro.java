
public class Registro {
   public static void main(String[] args){
      Cliente c1 = new Cliente("Ana", "ana123@gmail.com", "999222555");
      Cliente c2 = new Cliente("Victor", "vitinhograu@gmail.com");
      Cliente c3 = new Cliente("Luffy");

      c1.exibir();
      c2.exibir();
      c3.exibir();

      System.out.println("----------------------------------------------");
      System.out.println("Total de clientes: " + Cliente.totalCliente);
   }
}

