package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //criada pra trabalhar com Herança
    //classe abstrata significa que nao consigo instanciar conteudo

    public protected final double XP_PADRAO = 10d; //cria uma constante padrão. static = pode acessar xp padrao fora da classe, protected = classe e filhos pode acessar

    private String titulo;
    private String descricao;

    //classes q extenderem de conteudos vao ser obrigadas a ter essa logica
    public abstract double calcularXp(); //se tem objeto abstrato, a classe tem q ser abstrata tb

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
