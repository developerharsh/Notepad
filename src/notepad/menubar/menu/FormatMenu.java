
package notepad.menubar.menu;

import java.awt.*;
import java.awt.event.*;

public class FormatMenu 
{
   
    public Menu Format;
    MenuItem Word_Wrap,Font;
    
    public FormatMenu()
    {
 
        Format=new Menu("Format");
        Word_Wrap=new MenuItem("Word Wrap");
        Font=new MenuItem("Font...");
        Format.add(Word_Wrap);
        Format.add(Font);   
             
    }
}
