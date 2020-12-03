package tedu_day04_afternoon;

/**
 * 先看懂句子,再去了解每一个单词是干嘛
 * 看代码的时候,不要背单词,要了解一行代码的含义/书写格式
 * 如果需要将文件,交给计算机去执行,必须要加上一行固定的代码
 * psvm+tab键
 */

public class RedPackage {
    /**
     * 变量:给数据起名字并且分类的过程
     * double 小数
     * int    整数
     * 随机红包-----随机数字----最小值~最大值之间的  保留小数点后面的两位
     * 1+1=2    2=1+1
     * 随机数----公式----Math.random()
     *             0 <= Math.random()*max <max
     * 四舍五入 保留小数点的后两位 ---- 公式 ---Math.round(数字) ---- 默认保留到整数位
     * 整数除以整数只能得到整数
     *
     * 需要容器来帮我存储生成的这些红包,给这些红包记上标记,通过标记来找到最后一个红包应该如何表示
     * 数组:可以存储多个相同类型的数据,并且会给这些数据添加上下标
     *  数组的定义        double[] red = new double[num];
     *                          可以存储num个小数数组
     *                          red数组的名字
     * 数组的使用      对数组里数据进行获取或者修改   通过数组的下标来获取
     *                          数组的名称[下标]
     *                下标从0开始计数 表示数组中每一个数据的位置
     *                Java中99.99%都是从0开始计数的  数组的下标从开始计算
     * 如果需要将代码重复执行或者发现大量重复的代码的时候,使用循环结构
     * while(循环条件){   条件一般都是针对于执行次数
     *     代码1
     *     代码2
     *     代码3
     *     代码4
     * }
     *
     * 跑不够6圈不要回家
     * int 圈数 = 0 ; Java里计数从0开始  数组的下标从0开始
     * while(圈数 < 6){  只要圈数小于6  循环代码    0 1 2 3 4  5
     *    跑一会
     *    走一会
     *    跑一会
     *    圈数+1
     * }
     * 做判断----选择条件去执行内容
     * if(判断条件){
     *    判断结果:条件满足时执行
     * }else{
     *   判断结果:条件不满足时执行
     * }
     *
     */
    public static void main(String[] args) {    //程序的入口:计算机执行 命令的区域
        double total = 88.88;//总金额
        int    num   = 20;    //总个数
        double max   = total / num * 2; //最大值
        double[] red = new double[num];
        int    i     = 0;//执行次数  计数  i用来表示数组的下标
        double sum   = 0;//求红包的金额之和
        while(i < num){// 0 1 2 3 4 5 6 .......num-2  num-1
            double rd    = Math.random()*max ; //随机数  0 ~ max
            double money = Math.round( rd * 100) / 100.0;//随机红包金额
            if(i<num-1){// 0 1 2 3 4 5 6 .......num-2
                red[i]=money; //随机红包的生成 ---  除了最后一个红包之外
                sum  +=money;//将每次循环时生成的红包金额money累加起来  +=
            }else{//最后一个红包   i=num-1
                double last = Math.round( (total - sum) * 100) / 100.0;  //总金额-其他金额之和  四舍五入
                if(last>0){
                    red[i]=last;
                }else{ //最后一个红包是负数 没办法用---当我发现红包是负数的时候,重新生成一波新的红包直到不是负数为止
                    System.out.println("出现了负数的情况"+last);
                    i=0;
                    sum=0;
                    continue;  //立即回到循环最开始的第一行----起始点重新开始
                }
            }
            i+=1;//i是累加的  +=
        }
        int   j  =  0;//计数
        while(j<num){
            System.out.println(red[j]);
            j+=1;
        }


    }
}
