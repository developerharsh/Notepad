
package notepad.menubar.menu;

import java.awt.*;
import java.awt.event.*;

public class HelpMenu 
{
     public Menu Help;
     MenuItem View_Help,About;
    
    public HelpMenu()
    {
 
        Help=new Menu("Help");
        View_Help=new MenuItem("View Help");
        About=new MenuItem("About Notepad");
        Help.add(View_Help);
        Help.addSeparator();
        Help.add(About);   
             
    }   
}
