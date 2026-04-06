package pessoaAluno;

public class Main {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[5];

        pessoas[0] = new Aluno("Fares", 23, "2026001");
        pessoas[1] = new Aluno("Ana", 21, "2026002");
        pessoas[2] = new Professor("Maria", 40, "Java");
        pessoas[3] = new Professor("Carlos", 50, "Banco de Dados");
        pessoas[4] = new Aluno("Lucas", 19, "2026003");

        for (Pessoa p : pessoas) {
            System.out.println(p.mostrarDados());
        }
    }
}
