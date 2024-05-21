/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.modelosepadroes.padrao1.texteditor.sempadrao;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Hugo
 */
public class SemPadrao {
    static public void executar() {
        String text = JOptionPane.showInputDialog("Insira o texto para ser formatado");
        
        int option = Integer.parseInt(JOptionPane.showInputDialog(
            "Como deseja formatar?\n\n[1] - Para UpperCase\n[2] - Para LowerCase\n")
        );
        
        switch(option) {
            case 1 -> {
                JOptionPane.showMessageDialog(null, "Texto em Uppercase: " +  text.toUpperCase());
                break;
            }
            case 2 -> {
                JOptionPane.showMessageDialog(null, "Texto em Lowercase: " + text.toLowerCase());
                break;
            }
            default -> JOptionPane.showMessageDialog(null, "Opção Inválida");    
        }       
    }
}
