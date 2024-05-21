/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.modelosepadroes.padrao1.texteditor.compadrao;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Hugo
 */
public class ComPadrao {
    static public void executar() {
        TextEditor editor = new TextEditor(); // Generic Class which receives the implemented classes
        String text = JOptionPane.showInputDialog("Insira o texto para ser formatado");
        
        int option = Integer.parseInt(JOptionPane.showInputDialog(
            "Como deseja formatar?\n\n[1] - Para UpperCase\n[2] - Para LowerCase\n")
        );
        
        switch(option) {
            case 1 -> {
                editor.setFormatter(new UppercaseFormatter()); // Strategy Design
                String formattedText = editor.formatText(text);
                JOptionPane.showMessageDialog(null, "Texto em Uppercase: " + formattedText);
                
                break;
            }
            case 2 -> {
                
                editor.setFormatter(new LowercaseFormatter()); // Strategy Design
                String formattedText = editor.formatText(text);
                JOptionPane.showMessageDialog(null, "Texto em Lowercase: " + formattedText);
                
                break;
            }
            default -> JOptionPane.showMessageDialog(null, "Opção Inválida");    
        }      
    }
}
