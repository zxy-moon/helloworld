package operate;

/**
 * ������
 * @author ��ܰ��
 *
 */
public class Resume {

	//����
    private String name;
    //���֤��
    private String id;
    //ѧ��
    private String education;
    //�绰��
    private String telephone;
    /**
     * ����״̬
     * -1�������˲ſ�
     * 0��������
     * 1������ͨ��
     * 2������ͨ��
     * 3������ͨ��
     * 4�����ͨ��
     * 5������ͨ��
     * 6����ǩԼ
     * 7������ְ
     */
    private int process;

    public Resume(String name, String id, String education, String telephone ,int process) {
        this.name = name;
        this.id = id;
        this.education = education;
        this.telephone = telephone;
        this.process = process;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }


    @Override
    public String toString() {
        return "������" + name + '\n' +
                "���֤�ţ�" + id + '\n' +
                "ѧ����" + education + '\n' +
                "�绰�ţ�" + telephone + '\n' +
                "����״̬��" + process;
    }
}
