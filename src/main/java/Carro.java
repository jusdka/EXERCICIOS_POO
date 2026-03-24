public class Carro {
    String marca;
    String modelo;
    int ano;

    public int idadeDoCarro(){
        return 2026 - ano;
    }

    public void exibir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("A idade do carro é: " + idadeDoCarro());

    }

}
