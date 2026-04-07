# Sistema Simples de Heranca em Java

Este projeto foi organizado em estrutura Java padrao para praticar conceitos de Programacao Orientada a Objetos com as classes `Pessoa`, `Aluno` e `Professor`.

## Conceitos aplicados

- Heranca com `extends`
- Sobrescrita de metodos com `@Override`
- Encapsulamento com atributos privados e getters/setters
- Reaproveitamento de codigo com `super`

## Estrutura

```text
PessoaAluno/
  pom.xml
  src/
    main/
      java/
        pessoaaluno/
          Main.java
          Pessoa.java
          Aluno.java
          Professor.java
```

## Como executar

No terminal, a partir da pasta `PessoaAluno`:

```bash
javac -d out src/main/java/pessoaaluno/*.java
java -cp out pessoaaluno.Main
```

## Objetivo

Fixar os conceitos fundamentais de heranca, especializacao de classes e comportamento especifico em subclasses.
