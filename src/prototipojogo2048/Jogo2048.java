/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipojogo2048;

import interfaces.MenuInicial;
import interfaces.TelaPrincipalDoJogo;
import java.util.Arrays;

/**
 *
 * @author marco
 */
public class Jogo2048 {
    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro(4,4);
        TelaPrincipalDoJogo telaPrincipal = new TelaPrincipalDoJogo(tab);
        
        while (true) {
            //telaPrincipal.alterarTextoMatriz(tab.getMatrizTabuleiro());
            tab.setElementos();
            telaPrincipal.setComponentes(tab.getMatrizElemento());
            //tab.gerarNovo2();
            telaPrincipal.setVisible(true);
            //tab.novaJogada();
            
        }
//          MenuInicial painel = new MenuInicial();
//          
//          do{
//              painel.setVisible(true);
//          }while(painel.isVisible());
    }
}

