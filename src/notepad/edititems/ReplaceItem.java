
package notepad.menubar.menu.edititems;

import java.awt.*;
import java.awt.event.*;
import notepad.*;


public class ReplaceItem extends Frame{
    
    Label l1,l2;
    TextField t1,t2;
    Checkbox c; 
    Button b1,b2,b3,b4;
    public ReplaceItem()
    {
        setVisible(true);
        setBounds(50,80,360,190);
        setLayout(null);
        setTitle("Replace");
        
        l1=new Label("Find what :");
        l1.setBounds(13,45,60,10);
        l1.setVisible(true);
        add(l1);
        
        l2=new Label("Replace with :");
        l2.setBounds(13,70,80,15);
        l2.setVisible(true);
        add(l2);
        
        t1=new TextField();
        t1.setBounds(110,40,145,20);
        t1.setVisible(true);
        add(t1);
        
        t2=new TextField();
        t2.setBounds(110,67,145,20);
        t2.setVisible(true);
        add(t2);
        
        c=new Checkbox(" Match case");
        c.setBounds(15,130,90,20);
        c.setVisible(true);
        add(c);
        
        b1=new Button("Find Next");
        b1.setBounds(270,38,73,23);
        b1.setVisible(true);
        add(b1);
        
        b2=new Button("Replace");
        b2.setBounds(270,66,73,23);
        b2.setVisible(true);
        add(b2);
        
        b3=new Button("Replace All");
        b3.setBounds(270,94,73,23);
        b3.setVisible(true);
        add(b3);
        
        b4=new Button("Cancel");
        b4.setBounds(270,122,73,23);
        b4.setVisible(true);
        add(b4);
        
      
    }
  
}
