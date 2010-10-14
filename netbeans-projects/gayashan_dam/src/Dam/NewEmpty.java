
package Dam;

import javax.swing.*;
import java.awt.*;
import java.util.Date;




public class SimpleAnalogClock extends JPanel
{
	int centerPointX;
	int centerPointY;

	int xs;
    int ys;

	Font hnditFont;

	Date currentDate;

	public SimpleAnalogClock()
	{
		setBackground(new Color(Color.Silver));

		JFrame frame=new JFrame("Simple Analog Clock");

		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		while(true)
		{
			repaint();
			try
			{
				Thread.sleep(900);
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		}
	}

	public void paint(Graphics g)
	{
		centerPointX=getSize().width/2;
		centerPointY=getSize().height/2;

		currentDate=new Date();


		int s=currentDate.getSeconds();

		int s_minus_five=s-5;
		int s_add_five=s+5;

		xs = (int) (Math.cos(s * Math.PI / 30 - Math.PI / 2) * 170 + centerPointX);
    	ys = (int) (Math.sin(s * Math.PI / 30 - Math.PI / 2) * 170 + centerPointY);

		int xsm=(int) (Math.cos(s_minus_five * Math.PI / 30 - Math.PI / 2) * 5 + centerPointX);
		int ysm=(int) (Math.sin(s_minus_five * Math.PI / 30 - Math.PI / 2) * 5 + centerPointY);

		int xsa=(int) (Math.cos(s_add_five * Math.PI / 30 - Math.PI / 2) * 5 + centerPointX);
		int ysa=(int) (Math.sin(s_add_five * Math.PI / 30 - Math.PI / 2) * 5 + centerPointY);

		int m=currentDate.getMinutes();

		int m_minus_ten=m-10;
		int m_add_ten=m+10;

		int xm = (int) (Math.cos(m * Math.PI / 30 - Math.PI / 2) * 170 + centerPointX);
    	int ym = (int) (Math.sin(m * Math.PI / 30 - Math.PI / 2) * 170 + centerPointY);

		int xmm=(int) (Math.cos(m_minus_ten * Math.PI / 30 - Math.PI / 2) * 10 + centerPointX);
		int ymm=(int) (Math.sin(m_minus_ten * Math.PI / 30 - Math.PI / 2) * 10 + centerPointY);

		int xma=(int) (Math.cos(m_add_ten * Math.PI / 30 - Math.PI / 2) * 10 + centerPointX);
		int yma=(int) (Math.sin(m_add_ten * Math.PI / 30 - Math.PI / 2) * 10 + centerPointY);

		int h=currentDate.getHours();

		int h_minus_ten=h-10;
		int h_add_ten=h+10;

		int xh = (int) (Math.cos(h * Math.PI / 6 - Math.PI / 2) * 100 + centerPointX);
    	int yh = (int) (Math.sin(h * Math.PI / 6 - Math.PI / 2) * 100 + centerPointY);

		int xhm=(int) (Math.cos(h_minus_ten * Math.PI / 6 - Math.PI / 2) * 10 + centerPointX);
		int yhm=(int) (Math.sin(h_minus_ten * Math.PI / 6 - Math.PI / 2) * 10 + centerPointY);

		int xha=(int) (Math.cos(h_add_ten * Math.PI / 6 - Math.PI / 2) * 10 + centerPointX);
		int yha=(int) (Math.sin(h_add_ten * Math.PI / 6 - Math.PI / 2) * 10 + centerPointY);

		int ovalWidth=400;
		int ovalHeight=400;

		Graphics2D g2d=(Graphics2D)g;

		super.paint(g2d);


		Color penColor=new Color(Color.Red);
		Color penColor2=new Color(Color.Silver);


		g2d.setColor(penColor);
		g2d.fillOval(((getSize().width)/2)-(ovalWidth/2),((getSize().height)/2)-(ovalHeight/2),ovalWidth,ovalHeight);


		g2d.setColor(penColor2);
		quartzFont=new Font("Verdana",Font.BOLD,20);
		g2d.setFont(hnditFont);
		g2d.drawString("HNDIT",centerPointX-30,centerPointY-150);


		quartzFont=new Font("Verdana",Font.BOLD,50);
		g2d.setFont(hnditFont);
		g2d.drawString("12",centerPointX-30,centerPointY-120);
		g2d.drawString("6",centerPointX-18,centerPointY+170);
		g2d.drawString("3",centerPointX+140,centerPointY+13);
		g2d.drawString("9",centerPointX-170,centerPointY+13);


		int[]coordinateXs={centerPointX,xsm,xs,xsa};
		int[]coordinateYs={centerPointY,ysm,ys,ysa};
		g2d.fillPolygon(coordinateXs,coordinateYs,4);

		int[]coordinateXm={centerPointX,xmm,xm,xma};
		int[]coordinateYm={centerPointY,ymm,ym,yma};
		g2d.fillPolygon(coordinateXm,coordinateYm,4);

		int[]coordinateXh={centerPointX,xhm,xh,xha};
		int[]coordinateYh={centerPointY,yhm,yh,yha};
		g2d.fillPolygon(coordinateXh,coordinateYh,4);

		for(int i=1; i<=360; i++)
		{
			int tickX;
			int tickY;

			int tickXb;
			int tickYb;

			tickX=(int) (Math.cos(i * Math.PI / 30 - Math.PI / 2)* 180 + centerPointX);
    		tickY=(int) (Math.sin(i * Math.PI / 30 - Math.PI / 2)* 180 + centerPointY);

    		tickXb=(int) (Math.cos(i * Math.PI / 30 - Math.PI / 2) * 300 + centerPointX);
    		tickYb=(int) (Math.sin(i * Math.PI / 30 - Math.PI / 2) * 300 + centerPointY);

    		g2d.drawLine(tickXb,tickYb,tickX,tickY);
		}

	}

	public static void main(String[]args)
	{
		SimpleAnalogClock sac=new SimpleAnalogClock();
	}
}