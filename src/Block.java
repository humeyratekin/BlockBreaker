import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Block extends Rectangle{
	Image pic;
	int dx=3;
	int dy=-3;
	
	Rectangle left, right;
	
	boolean destroyed=false;
	boolean powerup=false;
	
	Block(int a, int b, int width, int height, String s){
		this.x=a;
		this.y=b;
		this.width=width;
		this.height=height;
		left=new Rectangle(a-1,b,1,height);
		right=new Rectangle(a+width+1,b,1,height);
		pic=Toolkit.getDefaultToolkit().getImage(s);
	}
	
	public void draw(Graphics g,Component c) {
		if(!destroyed)
			g.drawImage(pic,x,y,width,height,c);
	}
	
	

}
