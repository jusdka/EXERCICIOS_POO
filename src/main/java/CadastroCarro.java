import java.util.Scanner;
import java.util.ArrayList;
public class CadastroCarro {
   public static void main(String[] args){
      Scanner leitor = new Scanner(System.in);
      ArrayList<Carro> listaCarros = new ArrayList<>();
      int opcao = 0;

      do {
         System.out.println("\n--- CADASTRO DE CARRO ---");
         System.out.println("1) Cadastrar Carro");
         System.out.println("2) Listar todos");
         System.out.println("3) Total cadastrado");
         System.out.println("4) Sair");
         System.out.print("Escolha uma opção: ");

         opcao = leitor.nextInt();
         leitor.nextLine(); // Limpar o buffer

         switch (opcao) {
            case 1:
               System.out.print("Digite a marca: ");
               String marca = leitor.nextLine();
               System.out.print("Digite o modelo: ");
               String modelo = leitor.nextLine();
               System.out.print("Digite o ano: ");
               int ano = leitor.nextInt();

               Carro novoCarro = new Carro(marca, modelo, ano);
               listaCarros.add(novoCarro);
               System.out.println("Carro cadastrado com sucesso!");
               break;

            case 2:
               System.out.println("\n--- LISTA DE VEÍCULOS ---");
               if (listaCarros.isEmpty()) {
                  System.out.println("Nenhum carro cadastrado.");
               } else {
                  for (Carro c : listaCarros) {
                     System.out.println(c);
                  }
               }
               break;

            case 3:
               // Acesso via classe (static)
               System.out.println("Total de carros no sistema: " + Carro.getTotalCarros());
               break;

            case 4:
               System.out.println("Encerrando programa...");
               break;

            default:
               System.out.println("Opção inválida!");
         }
      } while (opcao != 4);

      leitor.close();
   }
}

