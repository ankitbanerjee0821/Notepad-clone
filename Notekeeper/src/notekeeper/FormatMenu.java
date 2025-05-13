
package notekeeper;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;
public class FormatMenu {
    public static void bold(){
    Font currentFont = Frame.textarea.getFont();
    Font boldfont = currentFont.deriveFont(Font.BOLD);
    Frame.textarea.setFont(boldfont);
    }
    
    public static void italic(){
    Font currentFont = Frame.textarea.getFont();
    Font italicfont = currentFont.deriveFont(Font.ITALIC);
    Frame.textarea.setFont(italicfont);
    }
    public static void fontcolor(){
        Color selectedColor = JColorChooser.showDialog(null, "Select Font Color", Color.BLACK);
        Frame.textarea.setForeground(selectedColor);
    }
}
