
package notepad;
import java.awt.*;
import java.awt.event.*;
import notepad.menubar.menubar;
import notepad.textarea.txtar;


public class Notepad extends Frame implements WindowListener{
    
    menubar ab=new menubar();
    static Frame f=new Frame();
    
    
    public Notepad()
    {
        f.setVisible(true);
        f.setSize(900,600);
        f.setLayout(null);
        f.setTitle("Notepad");
        
        f.setMenuBar(ab.mb);
        new txtar();
        
       f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                dispose();
                System.exit(0);
            }
          });
    }
    public static void main(String args[]) {
        new Notepad();
    }
    public static Frame retframe()
    {
        return f;
    }

    @Override
    public void windowOpened(WindowEvent e) { }

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e){}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
}

