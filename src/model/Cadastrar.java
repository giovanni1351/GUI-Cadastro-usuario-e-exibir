/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author unifgmorassi
*/
public class Cadastrar {
    public Usuario use(String nome,String sobrenome,long CPF,long idade,String sexo){
        Usuario user = new Usuario(nome,sobrenome,CPF,idade,sexo);
        return user;
    }
}
