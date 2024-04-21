/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author unifgmorassi
 */
public class Usuario {
    private String nome,sobrenome,sexo;
    private long CPF,idade;
    
    public Usuario(String nome,String sobrenome,long CPF,long idade,String sexo){
        this.nome =nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getIdade() {
        return idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }
    public String printar() {
        String retorno = "Nome:" +nome+"\n" +
                "Sobrenome:" +sobrenome+"\n" +
                "Idade:" +idade+"\n" +
                "CPF:" +CPF+"\n" +
                "Sexo:" +sexo+"\n";
        return retorno;
    }
     
}
