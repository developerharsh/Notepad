
package notepad.menubar.menu.edititems;

import java.awt.*;
import java.awt.event.*;
import notepad.*;


public class GoToItem  extends Frame
{
    Label l1;
    TextField t1;
    Button b1,b2;
    
    public GoToItem()
    {
        setVisible(true);
        setBounds(40,80,262,141);
        setLayout(null);
        setTitle("Go To Line");
        
        l1=new Label("Line number :");
        l1.setBounds(15,45,100,10);
        l1.setVisible(true);
        add(l1);
        
        t1=new TextField();
        t1.setBounds(15,63,230,23);
        t1.setVisible(true);
        add(t1);
        
        b1=new Button("Go To");
        b1.setBounds(90,95,73,23);
        b1.setVisible(true);
        add(b1);
        
        b2=new Button("Cancel");
        b2.setBounds(171,95,73,23);
        b2.setVisible(true);
        add(b2);
        
    }
    public static void main(String args[])
    {
        new GoToItem();
    }
    
    
}
