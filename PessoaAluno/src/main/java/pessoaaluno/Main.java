package pessoaaluno;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(
                "Ana Souza",
                16,
                "123.456.789-00",
                "ana@escola.com",
                "11999999999",
                "Rua das Flores, 100",
                "2024001",
                "2A",
                8.7
        );

        Professor professor = new Professor(
                "Carlos Lima",
                38,
                "987.654.321-00",
                "carlos@escola.com",
                "11888888888",
                "Avenida Central, 250",
                "Matematica",
                4500.0,
                12
        );

        System.out.println(aluno.apresentar());
        aluno.estudar();
        aluno.fazerAniversario();
        aluno.atualizarNotaFinal(9.1);
        System.out.println(aluno.exibirBoletim());

        System.out.println();

        System.out.println(professor.apresentar());
        professor.ensinar();
        professor.receberAumento(750.0);
        professor.adicionarTempoDeCasa(1);
        System.out.println(professor.exibirDadosProfissionais());
    }
}
