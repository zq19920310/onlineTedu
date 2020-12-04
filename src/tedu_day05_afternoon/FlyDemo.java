package tedu_day05_afternoon;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlyDemo {//窗口
	public static void main(String[] args) {//程序的入口
		JFrame   jf=new JFrame();		//创建了一个窗口名字叫做jf
		FlyPanel fp=new FlyPanel();	    //创建了一个画布名字叫做fp
		jf.addMouseMotionListener(fp); //让窗口给鼠标添加一个画布作为监听器
		jf.add(fp);						//将画布添加到窗口上
		jf.setSize(480, 800); //设置窗口的大小
		jf.setVisible(true);           //让窗口显示
	}
}

class FlyPanel extends JPanel implements MouseMotionListener {//画布
  int x=200;
  int y=80;
  public void paint(Graphics g) {//画画的方法    g画笔的名字
      super.paint(g);
      g.drawImage(new ImageIcon("C://background.png").getImage(), 0, 0, this);
      g.drawImage(new ImageIcon("C://hero0.png").getImage() , x, y, this);
  }

	public void mouseDragged(MouseEvent e) {//鼠标拖动

	}

	public void mouseMoved(MouseEvent e) {//鼠标移动  e鼠标
		//将鼠标的x坐标跟y坐标变成飞机的x坐标跟y坐标
		x=e.getX();
		y=e.getY();
		repaint();//如果修改了飞机的坐标必须要通知画画的方法重新画飞机的坐标
	}
}








