/*
<applet code=Bullseye width=600 height=500>
</applet>
*/
import java.awt.*;
import java.applet.*;
//import java.awt.Color;
public class Bullseye extends Applet implements Runnable
{
		public void paint(Graphics gp) 
  	{

		try{
		gp.setColor(new Color(255,204,153));
		gp.fillRect(35,90,400,400); 
		gp.setFont(new Font("Rage",Font.PLAIN,50));
		gp.setColor(new Color(0,0,204));
		gp.drawString("Bullseye",140,140);
		for(int i=0;i<7;i++)
		{
		if(i==0){
		gp.setColor(new Color(148, 0, 211));
		gp.fillOval(100,150,250,250);
		gp.setColor(Color.BLACK);
		gp.drawOval(100,150,250,250);
		Thread.sleep(1000);
		}
		else if(i==1)
		{
		gp.setColor(new Color(75, 0, 130));
		gp.fillOval(115,165,220,220);
		gp.setColor(Color.BLACK);
		gp.drawOval(115,165,220,220);
		Thread.sleep(1000);
		}
		else if(i==2)
		{
		gp.setColor(new Color(0,0,255));
		gp.fillOval(130,180,190,190);
		gp.setColor(Color.BLACK);
		gp.drawOval(130,180,190,190);
		Thread.sleep(1000);
		}
		else if(i==3)
		{
		gp.setColor(new Color(0,255,0));
		gp.fillOval(145,195,160,160);
		gp.setColor(Color.BLACK);
		gp.drawOval(145,195,160,160);
		Thread.sleep(1000);
		}
		else if(i==4)
		{
		gp.setColor(new Color(255,255,0));
		gp.fillOval(160,210,130,130);
		gp.setColor(Color.BLACK);
		gp.drawOval(160,210,130,130);
		Thread.sleep(1000);
		}
		else if(i==5)
		{
		gp.setColor(new Color(255,127,0));
		gp.fillOval(175,225,100,100);
		gp.setColor(Color.BLACK);
		gp.drawOval(175,225,100,100);
		Thread.sleep(1000);
		}
		else if(i==6)
		{
		gp.setColor(new Color(255,0,0));
		gp.fillOval(190,240,70,70);
		gp.setColor(Color.BLACK);
		gp.drawOval(190,240,70,70);
		Thread.sleep(1000);
		}

		/*gp.setColor(Color.RED);
		gp.fillOval(205,255,40,40);*/}
		
	}
catch(InterruptedException e)
{	
}
}
public void run()
{
}
}