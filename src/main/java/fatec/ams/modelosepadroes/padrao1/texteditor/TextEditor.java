/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatec.ams.modelosepadroes.padrao1.texteditor;

import fatec.ams.modelosepadroes.padrao1.texteditor.compadrao.ComPadrao;
import fatec.ams.modelosepadroes.padrao1.texteditor.sempadrao.SemPadrao;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Hugo
 * This Mini Project implements Strategy Design through the construction of a
 * "TextEditor" which converts the text entered by the user into UpperCase or
 * LowerCase.
 */
public class TextEditor {

    public static void main(String[] args) {
        
        int option = Integer.parseInt(JOptionPane.showInputDialog(
            "Qual você deseja executar?\n\n[1] - Com Padrão\n[2] - Sem Padrão\n"
        ));
        
        
        switch(option) {
            case 1 -> {
                ComPadrao.executar();
                break;
            }
            case 2 -> {
                SemPadrao.executar();
                break;
            }
            default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
        
    }
}
