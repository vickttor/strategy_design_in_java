/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.modelosepadroes.padrao1.texteditor.compadrao;

/**
 *
 * @author Victor Hugo
 */
public class TextEditor {

    private TextFormatter formatter;

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }
    
    public String formatText(String text) {
        return formatter.format(text);
    }  
    
}
