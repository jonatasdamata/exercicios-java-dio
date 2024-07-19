public class Operadores {

    public static void main(String[] args){

      //Ternários (?:)
      int a, b;

      a = 5;
      b = 6;

      String resultado = a == b ? "verdadeiro" : "falso";

      System.out.println(resultado);


      // Relacionais 
      int numero1 = 1;
      int numero2 = 2;

      boolean simNao = numero1 == numero2;

      System.out.println("Número1 é igual a Número2? " + simNao);


      // Lógicos && || 
      boolean condicao1 = true;
      boolean condicao2 = false;

      if(condicao1 && condicao2) {
        System.out.println("As duas condições saõ verdadeiras");
      }

      if(condicao1 || condicao2) {
        System.out.println("Uma das condições é verdadeira");

      }

      
    }
}
