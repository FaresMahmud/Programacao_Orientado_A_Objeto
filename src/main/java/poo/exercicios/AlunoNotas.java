package poo.exercicios;

import java.util.Scanner;

public class AlunoNotas {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Aluno aluno = new Aluno();

            System.out.print("Nome do aluno: ");
            aluno.setNome(teclado.nextLine());

            System.out.print("Nota 1: ");
            aluno.setNota1(teclado.nextDouble());

            System.out.print("Nota 2: ");
            aluno.setNota2(teclado.nextDouble());

            System.out.println("Média: " + String.format("%.2f", aluno.getMedia()));
            System.out.println("Situação: " + aluno.getSituacao());
        }
    }

    static class Aluno {
        private String nome;
        private double nota1;
        private double nota2;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                this.nome = "Sem nome";
                return;
            }
            this.nome = nome.trim();
        }

        public double getNota1() {
            return nota1;
        }

        public void setNota1(double nota1) {
            this.nota1 = limitarNota(nota1);
        }

        public double getNota2() {
            return nota2;
        }

        public void setNota2(double nota2) {
            this.nota2 = limitarNota(nota2);
        }

        public double getMedia() {
            return (nota1 + nota2) / 2.0;
        }

        public String getSituacao() {
            return getMedia() >= 7.0 ? "Aprovado" : "Reprovado";
        }

        private double limitarNota(double nota) {
            if (nota < 0) {
                return 0;
            }
            if (nota > 10) {
                return 10;
            }
            return nota;
        }
    }
}
