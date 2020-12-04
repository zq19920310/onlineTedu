package tedu_day05_night;

import javax.swing.*;

public class TestDoc {
    //psvm+tab将  将class文件变成可以执行文件
    public static void main(String[] args) {//程序的入口---可执行文件
        /**
         * 1.明确你要找的类是Doctor类
         * 2.将类变成对象
         *   语法---- 类名  对象名 = new 类名()
         *             new Doctor()    找到了一个叫做Doctor类的对象
         *             zhaoqiang       对象的名称
         *             Doctor          zhaoqiang这个对象属于Doctor类
         * 3.   对象名.属性名           找这个对象要数据
         *      对象名.方法名称()       让这个对象做事情
         */
        Doctor  zhaoqiang = new Doctor();
        zhaoqiang.kanbing();  //对象名.方法名称()      让这个对象做事情
        String hospital = zhaoqiang.hospital;// 对象名.属性名
        System.out.println(hospital);
        //创建出一个窗口------但是我不会做----找类帮忙
        JFrame jf =new JFrame();
        jf.setSize(400,800);
        jf.setVisible(true); //让窗口显示
    }
}
