package notepad.menubar;

import java.awt.*;
import java.awt.event.*;
import notepad.menubar.menu.*;

public class menubar 
{
    public MenuBar mb;
    FileMenu FM=new FileMenu();
    EditMenu EM=new EditMenu();
    FormatMenu FoM=new FormatMenu();
    ViewMenu VM=new ViewMenu();
    HelpMenu HM=new HelpMenu();
    
    public menubar()
    {
        
        mb=new MenuBar();
        mb.add(FM.File);
        mb.add(EM.Edit);
        mb.add(FoM.Format);
        mb.add(VM.View);
        mb.add(HM.Help);
       
        
        
    }
    
}