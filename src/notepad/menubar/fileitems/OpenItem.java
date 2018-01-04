

package notepad.menubar.menu.fileitems;
import java.awt.*;
import java.awt.event.*;
import notepad.*;
import java.io.*;
import notepad.textarea.txtar;

public class OpenItem 
{
    String d="";
    public OpenItem()
    {
        try
        {
            
        
        FileDialog f= new FileDialog(Notepad.retframe(),"Open",0);
        f.setVisible(true);
        int data=0;
        
        FileInputStream fis=new FileInputStream(f.getDirectory()+f.getFile());
        while((data=fis.read())!=-1)
        {
            d=d+(char)data;
        }
        txtar.area.setText(d);
        }
        catch(IOException e1)
        {
            System.out.println(e1);
        }
        
    }
    
}
