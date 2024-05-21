/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.modelosepadroes.padrao1.texteditor.compadrao;

/**
 *
 * @author Victor Hugo
 */
public class LowercaseFormatter implements TextFormatter {
    
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
    
}
