package tedu_day05_afternoon;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlyDemo {
	public static void main(String[] args) {
		JFrame   jf=new JFrame();				
		FlyPanel fp=new FlyPanel();	
		jf.add(fp);										
		jf.setSize(513, 499);			
		jf.setLocationRelativeTo(null);
		jf.setUndecorated(true);
		jf.setVisible(true);		
	}
}

class FlyPanel extends JPanel  {
  int x=200;
  int y=80;
  public void paint(Graphics g) {
      super.paint(g);
      g.drawImage(new ImageIcon("C://back3.gif").getImage(), 0, 0, this);
      g.drawImage(new ImageIcon("C://hero.GIF").getImage() , x, y, this);
  }
}








