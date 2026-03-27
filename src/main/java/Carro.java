public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(){
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){ //void pq ele não vai retornar nada
        this.marca = m;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String md){
        this.modelo = md;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int a){
        // validação
        if (a < 1886 || a > 2026){
            System.out.println("404 ! Ano inválido");
        } else{
            this.ano = a;
        }
    }

    public void exibir(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + (this.getAno() == 0 ? "Não informado" : this.getAno()));
    }

}
