package model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;
    private static final int IDADE_MAXIMA = 150;

    // Construtor
    public Pessoa(String nome, LocalDate dataNascimento, String profissao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    // Método para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método para definir o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a data de nascimento da pessoa
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    // Método para definir a data de nascimento da pessoa
    public void setDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    // Método para obter a profissão da pessoa
    public String getProfissao() {
        return profissao;
    }

    // Método para definir a profissão da pessoa
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Método para calcular a idade da pessoa
    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        // Criando um objeto Pessoa
        Pessoa pessoa = new Pessoa("João", LocalDate.of(1990, 5, 15), "Engenheiro");

        // Exibindo informações da pessoa e sua idade
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Profissão: " + pessoa.getProfissao());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}