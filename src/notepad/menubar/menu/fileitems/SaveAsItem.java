
package notepad.menubar.menu.fileitems;
import java.awt.*;
import java.awt.event.*;
import notepad.*;


public class SaveAsItem 
{
    public SaveAsItem()
    {
        FileDialog f;
        f = new FileDialog(Notepad.retframe(),"Save",1);
        f.setVisible(true);
        
    }
    
}
