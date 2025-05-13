package notekeeper;

import javax.swing.*;
public class Frame{

  public static JFrame frame;
  public static JTextArea textarea;
    public static void main(String[] args) {
        createframe();
        createTextArea();
        createMenu();
        frame.setVisible(true);
    }
  public static void createframe() {
    frame = new JFrame("Note Keeper");
    frame.setSize(700, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }   
  public static void createTextArea(){
      textarea= new JTextArea();
      frame.add(textarea);
      JScrollPane scrollbar= new JScrollPane(textarea);
      scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
      scrollbar.setBorder(BorderFactory.createEmptyBorder());
      frame.add(scrollbar);
  }
    public static void createMenu(){
      JMenuBar menu= new JMenuBar();
      frame.setJMenuBar(menu);
      
      JMenu filemenu= new JMenu("File");
      menu.add(filemenu);
      JMenu editmenu= new JMenu("Edit");
      menu.add(editmenu);
      JMenu formatmenu= new JMenu("Format");
      menu.add(formatmenu);
      
      JMenuItem New= new JMenuItem("New");
      New.addActionListener(e -> FileMenu.newfile());
      filemenu.add(New);
      JMenuItem open= new JMenuItem("Open");
      open.addActionListener(e -> FileMenu.openFile());      
      filemenu.add(open);
      JMenuItem save= new JMenuItem("save");
      save.addActionListener(e -> FileMenu.Save());      
      filemenu.add(save);
      JMenuItem saveas= new JMenuItem("Saveas");
      saveas.addActionListener(e -> FileMenu.saveAs());      
      filemenu.add(saveas);
      
      JMenuItem cutitem = new JMenuItem("Cut");
      cutitem.addActionListener(e -> EditMenu.Cut());
      editmenu.add(cutitem);      
      JMenuItem copyitem = new JMenuItem("Copy");
      copyitem.addActionListener(e -> EditMenu.Copy());      
      editmenu.add(copyitem);
      JMenuItem pasteitem = new JMenuItem("Paste");
      pasteitem.addActionListener(e -> EditMenu.Paste());
      editmenu.add(pasteitem);
      JMenuItem selectallitem = new JMenuItem("Select All");
      selectallitem.addActionListener(e -> EditMenu.SelectAll());
      editmenu.add(selectallitem);
      
      JMenuItem bolditem = new JMenuItem("Bold");
      bolditem.addActionListener(e -> FormatMenu.bold());
      formatmenu.add(bolditem);
      JMenuItem italicitem = new JMenuItem("Italic");
      italicitem.addActionListener(e -> FormatMenu.italic());
      formatmenu.add(italicitem);
      JMenuItem fontcolor = new JMenuItem("Font Color");
      fontcolor.addActionListener(e -> FormatMenu.fontcolor());
      formatmenu.add(fontcolor);
  }
}
