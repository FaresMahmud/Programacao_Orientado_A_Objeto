package pessoaaluno;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    private int anosDeCasa;

    public Professor(
            String nome,
            int idade,
            String cpf,
            String email,
            String telefone,
            String endereco,
            String disciplina,
            double salario,
            int anosDeCasa
    ) {
        super(nome, idade, cpf, email, telefone, endereco);
        this.disciplina = disciplina;
        this.salario = salario;
        this.anosDeCasa = anosDeCasa;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnosDeCasa() {
        return anosDeCasa;
    }

    public void setAnosDeCasa(int anosDeCasa) {
        this.anosDeCasa = anosDeCasa;
    }

    public void ensinar() {
        System.out.println(getNome() + " esta ministrando a disciplina de " + disciplina + ".");
    }

    public void receberAumento(double valor) {
        salario += valor;
    }

    public void adicionarTempoDeCasa(int anos) {
        anosDeCasa += anos;
    }

    public String exibirDadosProfissionais() {
        return "Professor: " + getNome() + ", disciplina: " + disciplina + ", salario: R$ " + salario + ", anos de casa: " + anosDeCasa;
    }

    @Override
    public String apresentar() {
        return "Professor " + getNome() + ", responsavel pela disciplina de " + disciplina + ".";
    }
}
