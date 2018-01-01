
package notepad.menubar.menu;
import notepad.menubar.menu.fileitems.SaveAsItem;
import notepad.menubar.menu.fileitems.SaveItem;
import notepad.menubar.menu.fileitems.ExitItem;
import notepad.menubar.menu.fileitems.OpenItem;
import notepad.menubar.menu.fileitems.NewItem;
import java.awt.*;
import java.awt.event.*;

public class FileMenu 
{
   
    public Menu File;
    MenuItem New,Open,Save,SaveAs,Print,Exit;
    
    public FileMenu()
    {
 
        File=new Menu("File");
        New=new MenuItem("New");
        Open=new MenuItem("Open",new MenuShortcut(KeyEvent.VK_O));
        Save=new MenuItem("Save",new MenuShortcut(KeyEvent.VK_S));
        SaveAs=new MenuItem("SaveAs");
        Print=new MenuItem("Print",new MenuShortcut(KeyEvent.VK_P));
        Exit=new MenuItem("Exit");
        
        File.add(New);
        File.add(Open);
        File.add(Save);
        File.add(SaveAs);
        File.addSeparator();
        File.add(Print);
        File.addSeparator();
        File.add(Exit);
        
        New.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    new NewItem();
                }
        }
);
         Open.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    new OpenItem();
                }
        }
);
         Save.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    new SaveItem();
                }
        }
);
         SaveAs.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    new SaveAsItem();
                }
        }
);
         Exit.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    new ExitItem();
                }
        }
);
      
        
        
    }
}

