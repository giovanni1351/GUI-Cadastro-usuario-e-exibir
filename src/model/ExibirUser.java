/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Controller;
import view.JanelaProcuraUsuario;

/**
 *
 * @author unifgmorassi
 */
public class ExibirUser {
    public Usuario procurar(long cpfProcurado){
        for(Usuario i : Controller.userList){
            if(i.getCPF()== cpfProcurado){
                return i;
            }
        }
        return null;
    }
    public void showWindow(JanelaProcuraUsuario j){
        j.setVisible(true);
    }
    public void unshowWindow(JanelaProcuraUsuario j){
        j.setVisible(false);
    }
    
}
