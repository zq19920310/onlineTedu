package tedu_day02_night;

import java.util.Scanner;

/**
 *  �������ʱ��Ҫ��(��)����,Ҫ�˽���һ�д���ĺ���/��д��ʽ
 *  ��ѧ����,��ȥѧÿһ�����ʺ���
 *  �����Ҫ�����뽻�������ȥִ��,����Ҫд��һ�й̶��Ĵ����ʽ
 *  psvm+tab��    �Զ�����
 */
public class Atm {
    /**
     * �´�� = ԭ�����-ȡ��
     * ���ֱ���û������----Ҫ�����������ֲ��ҹ���----����
     * int ���ƵȺ��ұߵ����ݱ���������
     * Java�еĵȺ�   2 = 1+1   ��ֵ:���Ⱥ��ұߵ������������Ⱥ���ߵ�����
     *               1+1 = 2   ֻҪ�����ȺŴ�������
     */
    public static void main(String[] args) {//��������:�����ִ�����������
        int  cunkuan = 50000;
        Scanner scan = new Scanner(System.in);//�ҵ���һ������scan���˰��һ�ȡϵͳ������Ȩ��
        while( cunkuan>=100 ){ //ֻҪ�����ڵ���100 �Ϳ���ѭ������

            System.out.println("����������ȡ����:");
            int  qukuan  = scan.nextInt(); //��scan�����ڿ���̨������������,���Ҹ��������������ֽ���qukuan
            if(qukuan % 100  != 0){//�ж�ȡ�����100������  ������ 0    !=
                System.out.println("�������������ȡ�����100������,����������...������");
                continue;//���¿�ʼѭ��---�ӵ�ǰλ�������ص�ѭ���ʼ�ĵ�һ��
            }
            if(qukuan > 20000){
                System.out.println("�������������Ľ�����޲��ܳ���20000Ԫ,���������롷����");
                continue;
            }
            if(qukuan> cunkuan){
                System.out.println("��������������,����������...������");
                continue;
            }
            if(qukuan>20000){
                System.out.println("��������������,����������...������");
                break;
            }
            cunkuan = cunkuan - qukuan; // �´�� = ԭ����� - ȡ��
            System.out.println( "������ʣ���Ϊ:" + cunkuan  + "Ԫ" ); //�Ӻ� ƴ�ӷ�
        }
    }
}

