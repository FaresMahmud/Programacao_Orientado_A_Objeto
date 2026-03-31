package poo.exercicios;

import java.util.Scanner;

public class AgendaContato {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Agenda agenda = new Agenda();

            System.out.print("Nome do contato: ");
            String nome = teclado.nextLine();

            System.out.print("Telefone: ");
            String telefone = teclado.nextLine();

            agenda.adicionarContato(new Contato(nome, telefone));

            System.out.println("Contato salvo");
            System.out.println("Total de contatos: " + agenda.getTotalContatos());
            System.out.println("Primeiro contato: " + agenda.getContato(0).getNome());
        }
    }

    static class Agenda {
        private final Contato[] contatos;
        private int totalContatos;

        public Agenda() {
            this.contatos = new Contato[10];
            this.totalContatos = 0;
        }

        public void adicionarContato(Contato contato) {
            if (contato == null) {
                return;
            }
            if (totalContatos >= contatos.length) {
                System.out.println("Agenda cheia.");
                return;
            }
            contatos[totalContatos] = contato;
            totalContatos++;
        }

        public int getTotalContatos() {
            return totalContatos;
        }

        public Contato getContato(int indice) {
            if (indice < 0 || indice >= totalContatos) {
                return null;
            }
            return contatos[indice];
        }
    }

    static class Contato {
        private final String nome;
        private final String telefone;

        public Contato(String nome, String telefone) {
            this.nome = nome == null || nome.trim().isEmpty() ? "Sem nome" : nome.trim();
            this.telefone = telefone == null ? "" : telefone.trim();
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }
    }
}
