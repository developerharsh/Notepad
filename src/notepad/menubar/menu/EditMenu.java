
package notepad.menubar.menu;

import java.awt.*;
import java.awt.event.*;
import notepad.menubar.menu.edititems.*;
public class EditMenu 
{
   
    public Menu Edit;
    MenuItem Undo,Cut,Copy,Paste,Delete,Find,Find_Next,Replace,Go_To,Select_All,Time_Date;
    
    public EditMenu()
    {
 
        Edit=new Menu("Edit");
        Undo=new MenuItem("Undo",new MenuShortcut(KeyEvent.VK_Z));
        Cut=new MenuItem("Cut",new MenuShortcut(KeyEvent.VK_X));
        Copy=new MenuItem("Copy",new MenuShortcut(KeyEvent.VK_C));
        Paste=new MenuItem("Paste",new MenuShortcut(KeyEvent.VK_V));
        Delete=new MenuItem("Delete",new MenuShortcut(KeyEvent.VK_DELETE));
        Find=new MenuItem("Find",new MenuShortcut(KeyEvent.VK_F));
        Find_Next=new MenuItem("Find Next",new MenuShortcut(KeyEvent.VK_F3));
        Replace=new MenuItem("Replace",new MenuShortcut(KeyEvent.VK_H));
        Go_To=new MenuItem("Go To",new MenuShortcut(KeyEvent.VK_G));
        Select_All=new MenuItem("Select All",new MenuShortcut(KeyEvent.VK_A));
        Time_Date=new MenuItem("Time/Date",new MenuShortcut(KeyEvent.VK_F5));
        
        Edit.add(Undo);
        Edit.addSeparator();
        Edit.add(Cut);   
        Edit.add(Copy);
        Edit.add(Paste);
        Edit.add(Delete);
        Edit.addSeparator();
        Edit.add(Find);
        Edit.add(Find_Next);
        Edit.add(Replace);
        Edit.add(Go_To);
        Edit.addSeparator();
        Edit.add(Select_All);
        Edit.add(Time_Date);
        
        Replace.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    new ReplaceItem();
                }
         }
        );
        Go_To.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    new GoToItem();
                }
        }
        );
        Find.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    new FindItem();
                }
        }
        );
       
    }
    
}

