
public class Garagem {
    public static void main(String[] args){
        Carro carro1 = new Carro("VolksWagen", "Nivus", 2023);
        carro1.exibir();

        Carro carro2 = new Carro("BYD", "Mini Dolphin", 2025);
        carro2.exibir();

    }

}

//qual a vantagem de usar construtor em vez de chamar setters um
//por um?

//A vantagem é que o construtor ja define o estado inicial e é executado automaticamente assim que o objeto é criado.