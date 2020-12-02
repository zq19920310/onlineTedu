package tedu_day03_afternoon;



public class Demo4 {
    public static void main(String[] args) {
        test();//无参数无返回值
        test(12,23,34); //有参数无返回值
        test(22,33,44);
    }
    public static void test(){
        System.out.println(1+2+3);
    }



    public static void test(int a , int b , int c){
        System.out.println(a+b+c);
    }
}
