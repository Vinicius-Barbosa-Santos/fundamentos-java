public class HelloWorld {
    public static void main(String[] args) {
        /*
         * Números (int, double, float, long)
         * Textos (String)
         * Boolean (boolean)
         */

         int dadoDoTipoInt = 12;
         double dadoDoTipoDouble = 3.14;
         float dadoDoTipoFloat = 3.14f;
         long dadoDoTipoLong = 872787287879819818L;
         String dadoDoTipoString = "Colocar o meu texto";
         boolean dadoDoTipoBoolean = false;

        //  if - else

        if(dadoDoTipoInt == 11) {
            System.out.println("Entrou no if");
        } else if(dadoDoTipoInt == 12) {
            System.out.println("Entrou no if do 12");
        } else {
            System.out.println("Entrou no Else");
        }

        // While (Enquanto algo for verdadeiro, faça alguma coisa)3
        int valorInicial = 0;

        System.out.println("Iniciando o While");
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor do que 3");
            valorInicial++;
        }

        System.out.println("Iniciando o for");
        // For
        for(int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " + i);
        }
    }
}
