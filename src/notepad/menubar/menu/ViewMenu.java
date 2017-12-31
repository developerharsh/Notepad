
package notepad.menubar.menu;
import java.awt.*;
import java.awt.event.*;

public class ViewMenu
{
  public Menu View;
    MenuItem Status_bar;
    
    public ViewMenu()
    {
 
        View=new Menu("View");
        Status_bar=new MenuItem("Status Bar");
        View.add(Status_bar);
             
    }   
    
}
