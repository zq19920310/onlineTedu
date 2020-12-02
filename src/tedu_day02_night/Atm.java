package tedu_day02_night;

import java.util.Scanner;

/**
 *  看代码的时候不要看(背)单词,要了解这一行代码的含义/书写格式
 *  先学句子,再去学每一个单词含义
 *  如果需要将代码交给计算机去执行,必须要写上一行固定的代码格式
 *  psvm+tab键    自动生成
 */
public class Atm {
    /**
     * 新存款 = 原来存款-取款
     * 数字本身没有意义----要给数字起名字并且归类----变量
     * int 限制等号右边的数据必须是整数
     * Java中的等号   2 = 1+1   赋值:将等号右边的运算结果给到等号左边的名称
     *               1+1 = 2   只要看到等号从右往左看
     */
    public static void main(String[] args) {//程序的入口:计算机执行命令的区域
        int  cunkuan = 50000;
        Scanner scan = new Scanner(System.in);//找到了一个叫做scan的人帮我获取系统的输入权限
        while( cunkuan>=100 ){ //只要存款大于等于100 就可以循环代码

            System.out.println("请输入您的取款金额:");
            int  qukuan  = scan.nextInt(); //让scan可以在控制台当中输入整数,并且给这个整数起个名字叫做qukuan
            if(qukuan % 100  != 0){//判断取款金额跟100的余数  不等于 0    !=
                System.out.println("《《《您输入的取款金额不是100的整数,请重新输入...》》》");
                continue;//重新开始循环---从当前位置立即回到循环最开始的第一行
            }
            if(qukuan > 20000){
                System.out.println("《《《单次提款的金额上限不能超过20000元,请重新输入》》》");
                continue;
            }
            if(qukuan> cunkuan){
                System.out.println("《《《卡内余额不足,请重新输入...》》》");
                continue;
            }
            if(qukuan>20000){
                System.out.println("《《《卡内余额不足,请重新输入...》》》");
                break;
            }
            cunkuan = cunkuan - qukuan; // 新存款 = 原来存款 - 取款
            System.out.println( "卡内所剩存款为:" + cunkuan  + "元" ); //加号 拼接符
        }
    }
}

