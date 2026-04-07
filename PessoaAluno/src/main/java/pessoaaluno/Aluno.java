package pessoaaluno;

public class Aluno extends Pessoa {
    private String matricula;
    private String turma;
    private double notaFinal;

    public Aluno(
            String nome,
            int idade,
            String cpf,
            String email,
            String telefone,
            String endereco,
            String matricula,
            String turma,
            double notaFinal
    ) {
        super(nome, idade, cpf, email, telefone, endereco);
        this.matricula = matricula;
        this.turma = turma;
        this.notaFinal = notaFinal;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void estudar() {
        System.out.println(getNome() + " esta estudando os conteudos da turma " + turma + ".");
    }

    public void atualizarNotaFinal(double novaNota) {
        this.notaFinal = novaNota;
    }

    public String exibirBoletim() {
        String situacao = notaFinal >= 7.0 ? "Aprovado" : "Em recuperacao";
        return "Aluno: " + getNome() + ", matricula: " + matricula + ", nota final: " + notaFinal + ", situacao: " + situacao;
    }

    @Override
    public String apresentar() {
        return "Aluno " + getNome() + " da turma " + turma + ", matricula " + matricula + ".";
    }
}
