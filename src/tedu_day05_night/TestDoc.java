package tedu_day05_night;

import javax.swing.*;

public class TestDoc {
    //psvm+tab��  ��class�ļ���ɿ���ִ���ļ�
    public static void main(String[] args) {//��������---��ִ���ļ�
        /**
         * 1.��ȷ��Ҫ�ҵ�����Doctor��
         * 2.�����ɶ���
         *   �﷨---- ����  ������ = new ����()
         *             new Doctor()    �ҵ���һ������Doctor��Ķ���
         *             zhaoqiang       ���������
         *             Doctor          zhaoqiang�����������Doctor��
         * 3.   ������.������           ���������Ҫ����
         *      ������.��������()       ���������������
         */
        Doctor  zhaoqiang = new Doctor();
        zhaoqiang.kanbing();  //������.��������()      ���������������
        String hospital = zhaoqiang.hospital;// ������.������
        System.out.println(hospital);
        //������һ������------�����Ҳ�����----�����æ
        JFrame jf =new JFrame();
        jf.setSize(400,800);
        jf.setVisible(true); //�ô�����ʾ
    }
}
