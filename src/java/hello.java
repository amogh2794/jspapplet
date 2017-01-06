/*
<applet code=hello width=700 height=700>
</applet>
*/
import java.awt.*;
import java.applet.*;
public class hello extends Applet{
public void paint(Graphics gp) 
  {
	gp.drawString("HelloWorld",200,200);
  }
 }