package pessoa;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(int indice) {
        return "O nome da pessoa é " + nome + " e a idade é " + idade + " e o documento é " + cpf + " e o índice é " + indice;
    }
}
