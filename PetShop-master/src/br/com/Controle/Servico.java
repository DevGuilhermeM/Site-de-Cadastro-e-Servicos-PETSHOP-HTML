package br.com.Controle;

public class Servico {
  private int codigoPet;
  private String nomePet;
  private String servico;
  private double valorServico;
  private int quantidade;

  public Servico(int codigo, String nome, String servico, double preco, int quantidade){
    this.codigoPet  = codigo;
    this.nomePet    = nome;
    this.servico    = servico;
    this.quantidade = quantidade;
    this.gerarFatura(preco);
  }
  
  private void gerarFatura(double preco){
    this.valorServico = preco * this.quantidade;
  }

  public int getCodigoPet() {
    return codigoPet;
  }

  public String getNomePet() {
    return nomePet;
  }

  public String getServico() {
    return servico;
  }

  public double getValorServico() {
    return valorServico;
  }

  public int getQuantidade() {
    return quantidade;
  }

  
  
}
