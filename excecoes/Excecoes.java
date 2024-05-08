package excecoes;

public class Excecoes {
    // Checked Exceptions

    // Unchecked exceptions

    public static void main(String[] args) throws Exception {
        // try / catch

        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Deu Ruim");
            e.printStackTrace();
        }
    }

    // Static => chama o método sem precisar instanciar a classe
    public static void validarNumero() throws Exception {
        int numero = 10;

        if(numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
