package tedu_day02_afternoon;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * import ���Ƕ�������һ��
 * javax.swing   ��ͥ��ַ
 * JFrame   Ҫ�ҵ���
 * �������ʱ��ǧ��Ҫ������,Ҫ�˽�һ�д���ĺ������д��ʽ
 * �����Ҫ���ļ����������ȥִ��,����Ҫ����һ�й̶��Ĵ����ʽ
 * psvm+tab��    �Զ�����һ�д���
 */

public class FishGame {
    public static void main(String[] args) {
        ImageIcon bgImg = new ImageIcon("C:/image/bg_03.png");
        ImageIcon icon  = new ImageIcon("C:/image/icon.png");
        ImageIcon mm    = new ImageIcon("C:/image/min.png");
        ImageIcon cc    = new ImageIcon("C:/image/close.png");

        JButton min = new JButton(mm);
        JButton close= new JButton(cc);
        //���ð�ť���ڵ�λ�úʹ�С
        min.setBounds(720,10,30,30);
        close.setBounds(760,10,30,30);
        //���ð�ť���ر������ɫ
        min.setContentAreaFilled(false);
        close.setContentAreaFilled(false);
        //���ð�ť�ı߿�����
        min.setBorderPainted(false);
        close.setBorderPainted(false);

        JFrame jf = new JFrame();//�ҵ���һ������jf��������������������صĹ���

        JLabel label = new JLabel( bgImg );//�ҵ���һ������label������������������صĹ���

        label.add(min);//����ť���õ���������ʾ
        label.add(close);//����ť���õ���������ʾ

        jf.setUndecorated(true); //��jf�Ѵ��ڵı߿���������

        jf.setIconImage(icon.getImage());//��jf���ô��ڵ�����ͼ��

        jf.add(label);   //��������ӵ�������

        jf.setBounds(-1200,100,800,480);//��jf�������ô��ڵ�λ�ø���С

        jf.setVisible(true);//��jf������ʾ������

    }
}







