package tedu_day01_night;

/**
 * �������ʱ��,��Ҫ������,Ҫ�˽�һ�д���ĺ���/��д��ʽ
 * �����Ҫ�����뽻�������ȥִ��,����Ҫд��һ�й̶��Ĵ���
 * psvm+tab��   ��ݼ�
 */

public class Demo {
    public static void main(String[] args) {//��������,�����ִ�����������
        /**
         * ����---�洢��������
           byte   short   int   long
           ����:�����������ֲ��ҹ���
           ����??-----���Կ��Դ洢�����ݴ�С������
         */
        byte  a = 127;  //1���ֽ�       -128  ~  127
        short b = 32767;//2���ֽ�       -32768 ~  32767
        int   c = 2147483647;//4���ֽ�  -2147483648  ~   2147483647
        //8���ֽ� -9223372036854775808  ~  9223372036854775807
        long  d = 123123123123L;//ʹ��long��������ʱ,һ��Ҫ����L����l
        System.out.println( d ); //�����ڿ���̨���д�ӡ��С�����������

        /**
         * ������----�洢С��
         * float   4���ֽ�
         * double  8���ֽ�
         */
        float  e = 22.0f;//ʹ��float����С��ʱ,һ��Ҫ����F����f
        double g = 123.0;

        /**
         * �ַ���
         * char
         * 1.����Ҫ���ϵ�����
         * 2.ֻ�ܴ洢һ��
         */
        char aa = '��';
        char bb = 'a';
        char cc = '&';
        char dd = '��';
        /**
         * ������   �洢����ĶԴ�
         * boolean  true  false
         */
        boolean ff = 1>0 ;  //true
        boolean gg = 1<0 ;  //false
        System.out.println(ff);
        System.out.println(gg);
    }
}

