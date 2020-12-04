package tedu_day05_afternoon;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlyDemo {//����
	public static void main(String[] args) {//��������
		JFrame   jf=new JFrame();		//������һ���������ֽ���jf
		FlyPanel fp=new FlyPanel();	    //������һ���������ֽ���fp
		jf.addMouseMotionListener(fp); //�ô��ڸ�������һ��������Ϊ������
		jf.add(fp);						//��������ӵ�������
		jf.setSize(480, 800); //���ô��ڵĴ�С
		jf.setVisible(true);           //�ô�����ʾ
	}
}

class FlyPanel extends JPanel implements MouseMotionListener {//����
  int x=200;
  int y=80;
  public void paint(Graphics g) {//�����ķ���    g���ʵ�����
      super.paint(g);
      g.drawImage(new ImageIcon("C://background.png").getImage(), 0, 0, this);
      g.drawImage(new ImageIcon("C://hero0.png").getImage() , x, y, this);
  }

	public void mouseDragged(MouseEvent e) {//����϶�

	}

	public void mouseMoved(MouseEvent e) {//����ƶ�  e���
		//������x�����y�����ɷɻ���x�����y����
		x=e.getX();
		y=e.getY();
		repaint();//����޸��˷ɻ����������Ҫ֪ͨ�����ķ������»��ɻ�������
	}
}








