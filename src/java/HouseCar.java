/*
<applet code=HouseCar width=700 height=650>
</applet>
*/
import java.awt.*;
import java.applet.*;
public class HouseCar extends Applet implements Runnable
{
	Thread t; 
	int x1=0,x2=0,x3=0,x4=70;
	public void start() 
{ 
if(t==null) 

{ 
t=new Thread(this,"New Thread");//New side Thread created on start of applet. 
t.start(); 

}  } 
public void stop() 
{ 
if(t!=null) 
{ 
t=null;//On stop of applet the created thread is destroyed. 
} 
} 
public void run() 
{ 
Thread t1=Thread.currentThread(); 
while(t==t1) 
{ 
repaint(); 
try 
{ 
Thread.sleep(100); 
} 
catch(Exception e) 
{ } 
} 
} 
public void paint(Graphics gp) 
  {
	  

	x1=(x1+16)%700;
	x2=(x2+16)%700;
	x3=(x3+16)%700;
	x4=(x4+16)%700;
	int x[]={200,100,300};
	int y[]={150,240,240};
	setBackground(new Color(128,255,255));
	gp.setColor(new Color(128,64,0));
	gp.fillPolygon(x,y,3);
	gp.setColor(new Color(255,128,64));
	gp.fillRect(100,240,200,200);
	gp.setColor(new Color(0,128,255));
	gp.fillOval(185,180,30,30);
	gp.fillRect(130,260,40,40);
	gp.fillRect(230,260,40,40);
	gp.setColor(new Color(0,0,0));
	gp.drawLine(130,280,170,280);
	gp.drawLine(150,260,150,300);
	gp.drawLine(230,280,270,280);
	gp.drawLine(250,260,250,300);
	//gp.drawLine(200,150,400,150);
	//gp.drawLine(400,150,350,200);
	//gp.drawLine(400,150,450,200);
	gp.setColor(new Color(255,255,0));
	gp.fillRect(170,380,50,60);
	//gp.fillArc(350,175,100,50,0,-180);
	gp.setColor(new Color(0,0,0));
	gp.drawLine(170,380,190,390);
	gp.drawLine(190,390,190,440);
	gp.fillOval(180,415,5,5);
	gp.setColor(new Color(128,128,128));
	gp.fillRect(0,500,700,150);
	gp.setColor(new Color(255,0,0));
	gp.fillRoundRect(x1,560,80,20,2,2); 
	gp.setColor(new Color(0,128,255));
	gp.fillRect(x2,550,60,10);
	gp.setColor(new Color(0,0,0));
	gp.fillOval(x3,575,10,10);
	gp.fillOval(x4,575,10,10);
	gp.setColor(new Color(0,255,0));
	gp.fillOval(500,300,60,60);
	gp.fillArc(500,275,60,60,0,180);
	gp.fillArc(480,280,60,60,80,180);
	gp.fillArc(480,300,60,60,180,90);
	gp.fillArc(520,290,60,60,90,-180);
	gp.fillArc(520,310,60,60,0,-90);
	gp.fillRect(0,441,700,60);
	gp.setColor(new Color(64,0,0));
	gp.fillRect(520,350,20,100);
	gp.setColor(Color.white);
for(int i=0;i<100;i++) 
{ 
if(i!=50) 
gp.drawLine(i*50,585,i*50+10,585); 
} 
  }
}