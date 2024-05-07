package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.cpf = "33322211";
        pessoa.nome = "Vinicius";
        pessoa.idade = 33;

        System.out.println(pessoa.imprimirDadosDaPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "11226677";
        pessoa2.nome = "Maria";
        pessoa2.idade = 19;

        System.out.println(pessoa2.imprimirDadosDaPessoa(2));
    }
}
