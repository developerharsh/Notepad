
package notepad.menubar.menu.fileitems;
import java.awt.*;
import java.io.*;
import notepad.Notepad;
import notepad.textarea.txtar;

public class SaveItem 
{
    
        
     public SaveItem()
    {
        try
        {
        FileDialog f= new FileDialog(Notepad.retframe(),"Save",1);
        f.setVisible(true);
        
        FileWriter fw=new FileWriter(f.getDirectory()+f.getFile());
        fw.write(txtar.area.getText());
        fw.close();
       
        }
        catch(IOException e1)
        {
            System.out.println(e1);
        }
        
    }

    
}
