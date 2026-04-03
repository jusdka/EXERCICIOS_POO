
public class Garagem {
   public static void main(String[] args){
       Carro c1 = new Carro("Fiat", "Uno", 2020);
       Carro c2 = c1;
       c2.setModelo("Palio");
       System.out.println(c1.getModelo());
       System.out.println(c2.getModelo());
   }
}
// o modelo de c1 e c2 é Palio.

// O c2 mudou o c1 pois como ali não tem um objeto e sim seu endereço de memória, o Carro c2 não foi criado, mas sim o c2
//copiou o endereço de c1 e agora eles o compartilham.
//Como agora os dois apontam para o mesmo objeto, o c2 consegue mudar o c1.

// no exercicio 11 usando int o valor era guardado na STACK, assim fazendo uma cópia do valor, alterar um não afeta o outro,
//pois são idependentes após a cópia.
//no exercicio 12 que usa o tipo de referência, o objeto é armazenado no Heap e a Stack guarda só o endereço,
//então quando se faz a cópia, ambos vão olhar para o mesmo lugar no Heap, e por conta disso, eles são dependentes.
