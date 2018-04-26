import java.util.ArrayList;

public class Tianjin implements Handler{
    private Handler handler;                //��ŵ�ǰ�����ߺ�̵�Handler�ӿڱ���
    private ArrayList<String> numberList;   //������֤������������Ա�
    Tianjin(){
        numberList = new ArrayList<String>();
        numberList.add("345678912");        //����ʹ��ģ������֤����
        numberList.add("886543219");
        numberList.add("972121493");
        numberList.add("667734729");
    }
    public void handleRequest(String number){
        if(numberList.contains(number))
            System.out.println("����������ס");
        else{
            System.out.println("���˲�������ס");
            if(handler != null)
                handler.handleRequest(number);   //�����󴫵ݸ���һ��������
        }
    }
    public void setNextHandler(Handler handler){
        this.handler = handler;
    }
}