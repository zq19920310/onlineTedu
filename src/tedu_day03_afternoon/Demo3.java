package tedu_day03_afternoon;

public class Demo3 {
    public static void main(String[] args) { //main方法--系统级别的方法:最厉害---程序的入口
        nonming();//调用农民的方法
        shangfan();
        chushi();
        kehu();
    }

    public static void nonming(){//农民的方法
        System.out.println( "播种" );
        System.out.println( "浇水" );
        System.out.println( "施肥" );
        System.out.println( "杀虫" );
        System.out.println( "收割" );
    }

    public static void shangfan(){ //商贩的方法
        System.out.println( "收菜" );
        System.out.println( "叫卖" );
        System.out.println( "讨价还价" );
        System.out.println( "打包" );
    }

    public static void chushi(){
        System.out.println( "买菜" );
        System.out.println( "洗菜" );
        System.out.println( "切菜" );
        System.out.println( "炒菜" );
    }

    public static void kehu(){
        System.out.println( "点菜" );
        System.out.println( "等菜" );
        System.out.println( "吃菜" );
        System.out.println( "买单" );
    }


}
