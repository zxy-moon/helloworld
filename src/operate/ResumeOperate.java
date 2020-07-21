package operate;
import java.util.LinkedList;
import java.util.Scanner;

public class ResumeOperate {

	// չʾ���м���
    public static void showResume() {
    	LinkedList<Resume> resumes = new LinkedList<>();
    	DataOperate.loadData(resumes);
    	if (resumes.size() == 0) {
            System.out.println("HRϵͳΪ��");
            return;
        }
        System.out.println("HRϵͳ��һ����" + resumes.size() + "�ݼ�����" + "���£�");
        for (Resume resume : resumes) {
        	int k=resumes.indexOf(resume)+1;
        	System.out.println("*****��" + k + "�ݼ���*****");
            System.out.println(resume);
        }
    }
    
    //�鿴ָ������״̬�ļ���
    public static void showAppointResume() {
    	LinkedList<Resume> resumes = new LinkedList<>();
    	DataOperate.loadData(resumes);
    	if (resumes.size() == 0) {
            System.out.println("HRϵͳΪ��");
            return;
        }
    	Scanner sc=new Scanner(System.in);
    	boolean keepon=false;
    	do {
    		System.out.println("*****������Ҫ��ѯ�ļ���״̬*****");
        	System.out.println("-1�������˲ſ�");
        	System.out.println("0��������");
        	System.out.println("1������ͨ��");
        	System.out.println("2������ͨ��");
        	System.out.println("3������ͨ��");
        	System.out.println("4�����ͨ��");
        	System.out.println("5������ͨ��");
        	System.out.println("6����ǩԼ");
        	System.out.println("7������ְ");
        	int k = sc.nextInt();
        	sc.nextLine();
        	boolean notexist=true;
        	for(Resume resume:resumes) {
        		if(k == resume.getProcess()) {
        			notexist=false;
        			System.out.println(resume);
        		}
        	}
        	if(notexist)
        		System.out.println("�����ڸ�״̬�ļ���");
        	System.out.println("*****�Ƿ������ѯ����/��*****");
            if(sc.nextLine().equals("��"))
            	keepon=true;
            else
            	keepon=false;
    	}while(keepon);
//    	sc.close();
    }
	
	// ���ָ������
    public static void addResume() {
    	LinkedList<Resume> resumes = new LinkedList<>();
    	DataOperate.loadData(resumes);
        Scanner sc = new Scanner(System.in);
        boolean keepon=false;
        do {
        	System.out.println("*****�������������������֤�š�ѧ�����绰�š�����״̬�����и�����*****");
            String name = sc.nextLine();
            String id = sc.nextLine();
            String education = sc.nextLine();
            String telephone = sc.nextLine();
            int process = sc.nextInt();
            sc.nextLine();
            Resume resume = new Resume(name, id, education, telephone, process);
            resumes.add(resume);
            
            System.out.println("*****�Ƿ������ӣ���/��*****");
            if(sc.nextLine().equals("��"))
            	keepon=true;
            else
            	keepon=false;
        }while(keepon);
//        sc.close();
        DataOperate.saveData(resumes);
        System.out.println("��ӳɹ�");
    }

    //ɾ��ָ������
    public static void deleteResume() {
    	LinkedList<Resume> resumes = new LinkedList<>();
    	DataOperate.loadData(resumes);
    	if (resumes.size() == 0) {
            System.out.println("HRϵͳΪ��");
            return;
        }
        Scanner sc = new Scanner(System.in);
        boolean keepon=false;
        do {
        	System.out.println("*****������Ҫɾ���ļ�����Ӧ�����֤��*****");
            String id = sc.nextLine();
            boolean isnotexisted=true;
            for(int i = 0; i < resumes.size(); i++) {
            	if (resumes.get(i).getId().equals(id)) {
                	isnotexisted=false;
                	resumes.remove(resumes.get(i));
                    System.out.println("ɾ���ɹ�");
                }
            }
            if(isnotexisted)
            	System.out.println("û���ҵ�����Ҫɾ���ļ���");
            
            System.out.println("*****�Ƿ����ɾ������/��*****");
            if(sc.nextLine().equals("��"))
            	keepon=true;
            else
            	keepon=false;
        }while(keepon);
//        sc.close();
        DataOperate.saveData(resumes);
        System.out.println("�������");
    }

    //�޸�ָ������
    public static void updateResume() {
    	LinkedList<Resume> resumes = new LinkedList<>();
    	DataOperate.loadData(resumes);
    	if (resumes.size() == 0) {
            System.out.println("HRϵͳΪ��");
            return;
        }
        Scanner sc = new Scanner(System.in);
        boolean keepon=false;
        do {
        	System.out.println("*****������Ҫ�޸ĵļ�����Ӧ�����֤��*****");
            String id = sc.nextLine();
            boolean isnotexisted=true;
            for (Resume resume : resumes) {
                if (resume.getId().equals(id)) {
                	isnotexisted=false;
                	boolean iscompleted=false;
                	do {
                		System.out.println("*****���ҵ�Ҫ�޸ĵļ���*****");
                		System.out.println("****����ԭʼ״̬****");
                		System.out.println(resume);
                		System.out.println("*************************");
                    	System.out.println("�޸���������1");
                    	System.out.println("�޸����֤�š���2");
                    	System.out.println("�޸�ѧ������3");
                    	System.out.println("�޸ĵ绰�š���4");
                    	System.out.println("�޸ļ���״̬����5");
                    	int choice=sc.nextInt();
                    	sc.nextLine();
                    	switch(choice) {
                    	case 1:
                    		{System.out.println("ԭʼ������" + resume.getName());
                    		System.out.println("�������µ�����");
                    		resume.setName(sc.nextLine());}
                            break;
                        case 2:
                        	{System.out.println("ԭʼ���֤�ţ�" + resume.getId());
                        	System.out.println("�������µ����֤��");
                        	resume.setId(sc.nextLine());}
                            break;
                        case 3:
                        	{System.out.println("ԭʼѧ����" + resume.getEducation());
                        	System.out.println("�������µ�ѧ��");
                        	resume.setEducation(sc.nextLine());}
                            break;
                        case 4:
                        	{System.out.println("ԭʼ�绰�ţ�" + resume.getTelephone());
                        	System.out.println("�������µĵ绰��");
                        	resume.setTelephone(sc.nextLine());}
                            break;
                        case 5:
                        	{System.out.println("ԭʼ����״̬��" + resume.getProcess());
                        	System.out.println("�������µļ���״̬");
                        	resume.setProcess(sc.nextInt());
                        	sc.nextLine();}
                            break;
                        default:
                            System.out.println("������������������");
                    	}
                    	
                    	System.out.println("*****�Ƿ�����޸ı���������/��*****");
                        if(sc.nextLine().equals("��"))
                        	iscompleted=true;
                        else
                        	iscompleted=false;
                	}while(iscompleted);
                    System.out.println("�޸ĳɹ�");
                }
            }
            if(isnotexisted)
            	System.out.println("û���ҵ�����Ҫ�޸ĵļ���");
            
            System.out.println("*****�Ƿ�����޸���һ����������/��*****");
            if(sc.nextLine().equals("��"))
            	keepon=true;
            else
            	keepon=false;
        }while(keepon);
//        sc.close();
        DataOperate.saveData(resumes);
        System.out.println("�������");
    }

    // ��ѯָ������
    public static void searchResume() {
    	LinkedList<Resume> resumes = new LinkedList<>();
    	DataOperate.loadData(resumes);
    	if (resumes.size() == 0) {
            System.out.println("HRϵͳΪ��");
            return;
        }
        Scanner sc = new Scanner(System.in);
        boolean keepon=false;
        do {
        	System.out.println("*****������Ҫ��ѯ�ļ�����Ӧ�����֤��*****");
            String id = sc.nextLine();
            boolean isnotexisted=true;
            for (Resume resume : resumes) {
                if (resume.getId().equals(id)) {
                	isnotexisted=false;
                    System.out.println("�ҵ�Ҫ��ѯ�ļ���");
                    System.out.println(resume);
                }
            }	
            if(isnotexisted)
            	System.out.println("û���ҵ�����Ҫ��ѯ�ļ���");
            
            System.out.println("*****�Ƿ������ѯ����/��*****");
            if(sc.nextLine().equals("��"))
            	keepon=true;
            else
            	keepon=false;
        }while(keepon);
//        sc.close();
        System.out.println("��ѯ���");
    }

}
