package hrsys_2;
import operate.ResumeOperate;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
        boolean notExit = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*****��ӭ�����������ϵͳ*****");
            System.out.println("�鿴���м�������0");
            System.out.println("�鿴ָ������״̬�ļ�������1");
            System.out.println("���ָ����������2");
            System.out.println("ɾ��ָ����������3");
            System.out.println("�޸�ָ����������4");
            System.out.println("��ѯָ����������5");
            System.out.println("�˳�HRϵͳ����6");
            /**
             * ��������ѡ����˳��������
             * ˼�����ܷ����п��ƹ���Ŀ¼������
             */
            switch (sc.nextInt()) {
                case 0:
                    ResumeOperate.showResume();
                    break;
                case 1:
                    ResumeOperate.showAppointResume();
                    break;
                case 2:
                    ResumeOperate.addResume();
                    break;
                case 3:
                    ResumeOperate.deleteResume();
                    break;
                case 4:
                    ResumeOperate.updateResume();
                    break;
                case 5:
                    ResumeOperate.searchResume();
                    break;
                case 6:
                	notExit = false;
                    break;
                default:
                    System.out.println("������������������");
                    break;
            }
        }while (notExit);
        sc.close();
        System.out.println("���˳�HRϵͳ");
	}

}