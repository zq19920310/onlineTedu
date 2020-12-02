package tedu_day01_night;

/**
 * 看代码的时候,不要背单词,要了解一行代码的含义/书写格式
 * 如果需要将代码交给计算机去执行,必须要写上一行固定的代码
 * psvm+tab键   快捷键
 */

public class Demo {
    public static void main(String[] args) {//程序的入口,计算机执行命令的区域
        /**
         * 整型---存储整数数据
           byte   short   int   long
           变量:给数据起名字并且归类
           区别??-----各自可以存储的数据大小有区别
         */
        byte  a = 127;  //1个字节       -128  ~  127
        short b = 32767;//2个字节       -32768 ~  32767
        int   c = 2147483647;//4个字节  -2147483648  ~   2147483647
        //8个字节 -9223372036854775808  ~  9223372036854775807
        long  d = 123123123123L;//使用long定义整数时,一定要加上L或者l
        System.out.println( d ); //可以在控制台当中打印出小括号里的内容

        /**
         * 浮点型----存储小数
         * float   4个字节
         * double  8个字节
         */
        float  e = 22.0f;//使用float定义小数时,一定要加上F或者f
        double g = 123.0;

        /**
         * 字符型
         * char
         * 1.必须要加上单引号
         * 2.只能存储一个
         */
        char aa = '中';
        char bb = 'a';
        char cc = '&';
        char dd = 'の';
        /**
         * 布尔型   存储程序的对错
         * boolean  true  false
         */
        boolean ff = 1>0 ;  //true
        boolean gg = 1<0 ;  //false
        System.out.println(ff);
        System.out.println(gg);
    }
}

