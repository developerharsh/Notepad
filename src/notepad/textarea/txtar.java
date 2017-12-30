
package notepad.textarea;

import java.awt.*;
import notepad.Notepad;

public class txtar 
{
    public static TextArea area;
    Frame f=Notepad.retframe();
    public txtar()
    {
        area=new TextArea();
        area.setBounds(7,50,886,543);
        f.add(area);
    }
    public static void main(String args[])
    {
        new txtar();
    }
    
}
