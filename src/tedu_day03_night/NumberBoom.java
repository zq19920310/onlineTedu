package tedu_day03_night;


import java.util.Random;
import java.util.Scanner;

/**
 * import  哥们儿跟我来一下
 * java.util 家庭地址
 * Random   要找的人
 * 编程---先学句子,再学词
 * 看待代码时,不要背单词,要了解一行代码的含义/熟悉格式
 * 如果需要将代码交给计算机去执行,必须要写上一行固定的代码格式
 * psvm+tab键    快捷键
 */
public class NumberBoom {
    /**
     * 如果需要使用数据(代码,文字,数字,视频,音频....),必须要使用变量的代码书写格式
     * 变量:给数据起名字并且分类的过程   int给数据分整数类
     * 我知道我要做什么,但是我不会做----找"人"帮忙
     *      我肚子疼    看病  但是我自己不会看病  找大夫
     *      门锁坏了    开锁  但是我自己不会开锁  找工人
     * 随机数----但是我自己不会做----找"人"帮忙----Random
     * 如何找"人"帮忙？？？
     *   1.名字                 知道了这个原名之后,必须要将他原名改成我自己喜欢叫的名字
     *                          语法:  原名  自定义名称 = new  原名();
     *                                 赵强  赵老师/强哥  =  new  赵强();
     *   2.在哪儿               借助于编程工具来帮我找到这个"人"在哪儿
     *   3.可以让这个人帮你做事情       语法: 强哥.写代码();
     *                                      强哥.讲课();
     *              rd.nextInt()可以生成随机整数
     *                    -2147483648 <=  rd.nextInt() < 2147483648
     *                    需要的炸弹数字是1~100  包括1  也包括100  从1~100
     *                           0 <=  rd.nextInt(100)   < 100      0~99
     *                           1 <=  rd.nextInt(100)+1 < 101      1~100
     *                           含头不含尾
     * 操作权限只有两个   输入  输出
     * 输入:键盘上打字、手机屏幕
     * 输出:屏幕上显示、手机屏幕
     * System.out.println();  获取系统的输出权限,在控制台打印出小括号里的内容
     * 系统   输出  打印
     * 必须要获取系统的输入权限,才可以输入数字----但是我不会做----找"人"帮忙-----Scanner
     *
     * 判断guess跟boom之间的关系---选择结构:根据条件去执行对应的结果
     *     条件                  结果
     *   boom == guess     恭喜发财,程序结束
     *   boom  < guess     end   = 猜测数字
     *   boom  > guess     start = 猜测数字
     *   if(boom == guess){
     *      恭喜发财,程序结束
     *   }else if(boom  < guess){
     *      end   = 猜测数字
     *   }else if( boom  > guess){
     *      start = 猜测数字
     *   }
     *
     * 需要不停的去判断guess跟boom之间的关系---重复的去执行,直到猜中了为止----循环结构
     * while(判断条件){
     *     代码1
     *     代码2
     *     代码3
     *     代码4
     *     代码5
     *     代码6
     * }
     *
     */
    public static void main(String[] args) {//程序的入口
        int start = 1;  //起始数字
        int  end  = 100; //结束数字
        Random rd = new Random();//找到了一个叫做rd的人来帮我生成随机数
        int boom  = rd.nextInt(100)+1;  //炸弹数字----让rd来帮我生成一个随机数
        Scanner sc=new Scanner(System.in);//找到一个叫做sc的人帮我获取输入权限
        while(1>0){
            System.out.println( "请在 "+ start + " ~ "+end+" 之间猜测数字..." );
            int guess = sc.nextInt(); //可以在控制台当中输入数字
            if(guess == boom){
                System.out.println("恭喜发财,猜中了数字....");
                break;  //循环程序要结束
            }else if(boom  < guess){
                System.out.println("猜大了");
                end = guess;
            }else if(boom  > guess ){
                System.out.println("猜小了");
                start=guess;
            }
        }

    }
}
