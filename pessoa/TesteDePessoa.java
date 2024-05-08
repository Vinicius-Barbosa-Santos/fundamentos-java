package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("12457890");
        professor.setNome("Vinícius");
        professor.setIdade(26);
        professor.setSalario(40000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("12457890");
        aluno.setIdade(19);
        aluno.setNome("Fernanda");
        aluno.setMatricula("99989098818");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
