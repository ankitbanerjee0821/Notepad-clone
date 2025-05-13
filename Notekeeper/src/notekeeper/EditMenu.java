
package notekeeper;

public class EditMenu {
    public static void Cut(){
        Frame.textarea.cut();
    }
    public static void Copy(){
        Frame.textarea.copy();
    }
    public static void Paste(){
        Frame.textarea.paste();
    }
    public static void SelectAll(){
       Frame.textarea.selectAll();
    }
}
