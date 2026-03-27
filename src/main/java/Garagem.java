
public class Garagem {
    public static void main(String[] args){
        Carro carro1 = new Carro("VolksWagen", "Nivus", 2023);
        carro1.exibir();

        Carro carro2 = new Carro();
        carro2.exibir();

    }

}

//o que muda entre os dois?
//O construtor com parâmetros exige que se coloco caracteristicas na criação, pois ele ja nasce "pronto".
//O construtor sem parâmetros nasce vazio, então não há necessidade de se colocar as caracteristicas.