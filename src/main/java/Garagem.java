import java.util.ArrayList;
public class Garagem {
    public static void main(String[] args){

        ArrayList<Carro> listadecarros = new ArrayList<>();
        //arraylist - array dinâmico; <Carro> - apenas objs da classe carro; listadecarros - apenas um nome para identificar
        //a coleção; new Arraylist<>() - criando a lista na memória do pc (new - reserva espaço; <> - avisa ao Java para inferir que o tipo é Carro

        Carro carro1 = new Carro();
        carro1.marca = "BYD";
        carro1.modelo = "Dolphin";
        carro1.ano = 2024;
        listadecarros.add(carro1); // adicionou o carro na lista

        Carro carro2 = new Carro();
        carro2.marca = "VolksWagen";
        carro2.modelo = "Voyage";
        carro2.ano = 2011;
        listadecarros.add(carro2);

        Carro carro3 = new Carro();
        carro3.marca = "Toyota";
        carro3.modelo = "Corolla";
        carro3.ano = 2016;
        listadecarros.add(carro3);

        // percorrendo a lista usando for-each
        System.out.println("*** LISTA DE CARROS ***");
        //percorrer coleções em java (percorrer a lista)
        for (Carro c : listadecarros){ // para cada carro dentro da 'listadecarros' exiba...
            c.exibir();// o carros vão ser mandandos para o c para serem exibidos (1 volta - carro1 e assim por diante)
            System.out.println("***********************");
        }

    }

}
