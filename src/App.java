import animais.cachorro;

public class App {
    public static void main(String[] args){
      /*
        int nota = 40;
       String resultado = nota >= 70 ? "aprovado" : "reprovado";
        System.out.println("o aluno foi " + resultado);
         */

         //variavel de referencia

         cachorro cachorro1 = new cachorro();

         cachorro1.altura = 25;
         System.out.println(cachorro1.altura );
    }
}
