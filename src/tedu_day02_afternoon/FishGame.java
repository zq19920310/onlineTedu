package tedu_day02_afternoon;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * import 哥们儿跟我来一下
 * javax.swing   家庭地址
 * JFrame   要找的人
 * 看代码的时候千万不要背单词,要了解一行代码的含义跟书写格式
 * 如果需要将文件交给计算机去执行,必须要加上一行固定的代码格式
 * psvm+tab键    自动生成一行代码
 */

public class FishGame {
    public static void main(String[] args) {
        ImageIcon bgImg = new ImageIcon("C:/image/bg_03.png");
        ImageIcon icon  = new ImageIcon("C:/image/icon.png");
        ImageIcon mm    = new ImageIcon("C:/image/min.png");
        ImageIcon cc    = new ImageIcon("C:/image/close.png");

        JButton min = new JButton(mm);
        JButton close= new JButton(cc);
        //设置按钮所在的位置和大小
        min.setBounds(720,10,30,30);
        close.setBounds(760,10,30,30);
        //设置按钮隐藏背景填充色
        min.setContentAreaFilled(false);
        close.setContentAreaFilled(false);
        //设置按钮的边框隐藏
        min.setBorderPainted(false);
        close.setBorderPainted(false);

        JFrame jf = new JFrame();//找到了一个叫做jf的人来帮我做跟窗口相关的工作

        JLabel label = new JLabel( bgImg );//找到了一个叫做label的人来帮我做画布相关的工作

        label.add(min);//将按钮放置到画布上显示
        label.add(close);//将按钮放置到画布上显示

        jf.setUndecorated(true); //让jf把窗口的边框隐藏起来

        jf.setIconImage(icon.getImage());//让jf设置窗口的启动图标

        jf.add(label);   //将画布添加到窗口上

        jf.setBounds(-1200,100,800,480);//让jf帮我设置窗口的位置跟大小

        jf.setVisible(true);//让jf帮我显示出窗口

    }
}







