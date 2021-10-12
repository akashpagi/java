
package swing;
import javax.swing.*;
import java.awt.event.*;
public class MenuExample extends JFrame implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,format,view,help;
    JMenuItem cut,copy,paste,selectaLL,New,NewWindow,open,save,Exit,saveAs;
    JTextArea ta;

    MenuExample(){

        f=new JFrame("Notepad_Application");
        f.setBounds(100,100,800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setIconImage(getClass().getResourse("D:\SY_CS\Java\AWT\NaotpadIcon.png"));
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        selectaLL =new JMenuItem("selectaLL");


        New=new JMenuItem("New");
        NewWindow=new JMenuItem("New Window");
        open=new JMenuItem("open");
        save=new JMenuItem("save");
        saveAs=new JMenuItem("saveAs");
        Exit=new JMenuItem("Exit");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectaLL.addActionListener(this);


        New.addActionListener(this);
        NewWindow.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        saveAs.addActionListener(this);
        Exit.addActionListener(this);

        mb=new JMenuBar();

        file=new JMenu("File");
        edit=new JMenu("Edit");
        format=new JMenu("Format");
        view=new JMenu("View");
        help=new JMenu("Help");

        //adding item in menubar in edit
        edit.add(cut);edit.add(copy);edit.add(paste);
        edit.add(selectaLL);

        file.add(New);file.add(NewWindow);file.add(open);
        file.add(save);file.add(saveAs);file.add(Exit);


        mb.add(file);mb.add(edit);mb.add(help);mb.add(format);mb.add(view);

        ta=new JTextArea();
        ta.setBounds(0,0,1400,900);
        f.add(mb);f.add(ta);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cut)
            ta.cut();
        if(e.getSource()==paste)
            ta.paste();
        if(e.getSource()==copy)
            ta.copy();
        if(e.getSource()==selectaLL)
            ta.selectAll();

    }

    public static void main(String[] args) {
        new MenuExample();
    }
}