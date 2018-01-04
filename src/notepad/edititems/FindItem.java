
package notepad.menubar.menu.edititems;

import java.awt.*;
import java.awt.event.*;
import notepad.*;
import javax.swing.*;
import javax.swing.border.*;

public class FindItem extends Frame 
{
    
    Label l1,l2;
    TextField t1;
    Checkbox c; 
    Button b1,b2;
    JPanel p;
    public FindItem()
    {
        setVisible(true);
        setBounds(50,80,360,190);
        setLayout(null);
        setTitle("Find");
        
        
        
        l1=new Label("Find what :");
        l1.setBounds(13,45,60,10);
        l1.setVisible(true);
        add(l1);
        
        t1=new TextField();
        t1.setBounds(110,40,145,20);
        t1.setVisible(true);
        add(t1);
        
        
        c=new Checkbox(" Match case");
        c.setBounds(15,100,90,20);
        c.setVisible(true);
        add(c);
        
        b1=new Button("Find Next");
        b1.setBounds(270,38,73,23);
        b1.setVisible(true);
        add(b1);
        
        b2=new Button("Cancel");
        b2.setBounds(270,66,73,23);
        b2.setVisible(true);
        add(b2);
          
    } 
    public static void main(String args[])
    {
        new FindItem();
    }
    
}
