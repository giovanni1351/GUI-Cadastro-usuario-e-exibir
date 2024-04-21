/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cadastrar;
import model.ExibirUser;
import model.Usuario;
import view.JanelaCadastro;
import view.JanelaProcuraUsuario;

/**
 *
 * @author Giovanni
 */
public class Controller {
    JanelaCadastro cadastro;
    JanelaProcuraUsuario procura;
    public static List<Usuario> userList=new ArrayList<>();

    public Controller() {}

    public Controller(JanelaCadastro cadastro, JanelaProcuraUsuario procura) {
        this.cadastro = cadastro;
        this.procura = procura;
    }

    public Controller(JanelaCadastro cadastro) {
        this.cadastro = cadastro;

    }

    public Controller(JanelaProcuraUsuario procura) {
        this.procura = procura;

    }
    public void cadatraUsuario(){
        try{
            String CPF = cadastro.getTxtCPF().getText();
            String nome = cadastro.getTxtNome().getText();
            String sobrenome = cadastro.getTxtSobrenome().getText();
            String idade = cadastro.getTxtIdade().getText();
            boolean verSexo = cadastro.getRbMasculino().isSelected();
            String sexo = (verSexo)? "Masculino": "Feminino";
            long CPFlong = Long.parseLong(CPF);            
            long idadeLong = Long.parseLong(idade);            
            Cadastrar cadastrar = new Cadastrar();
            Usuario novo =cadastrar.use(nome,sobrenome,CPFlong,idadeLong,sexo);
            userList.add(novo);
        }catch(NumberFormatException e){
            cadastro.getTxtIdade().setText("Digite um numero");
            cadastro.getTxtCPF().setText("Digite um numero");
        }
    }
    public void exibir(){
        try{
            String cpf = procura.getTxtEntraCPF().getText();
            long cpfLong= Long.parseLong(cpf);
            ExibirUser exiba = new ExibirUser();
            Usuario achado = exiba.procurar(cpfLong);
            String txtASerExibido;
            if(achado != null){
                txtASerExibido = achado.printar();

            } else {
                txtASerExibido = "Não encontrado";
            }
            procura.getAtxtExibir().setText(txtASerExibido);
        }
        catch(NumberFormatException e){
            procura.getTxtEntraCPF().setText("Digite um numero");
        }
    }
    public void abrirJanelaProcuraUsuario(){
        ExibirUser User = new ExibirUser();
        if(procura == null){
            procura = new JanelaProcuraUsuario();
        }
        User.showWindow(procura);
    }
    public void fecharJanelaProcuraUsuario(){
        ExibirUser User = new ExibirUser();
        User.unshowWindow(procura);
    }
    
}
