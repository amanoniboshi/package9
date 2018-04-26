import java.util.ArrayList;

public class Tianjin implements Handler{
    private Handler handler;                //存放当前处理者后继的Handler接口变量
    private ArrayList<String> numberList;   //存放身份证号码的数组线性表
    Tianjin(){
        numberList = new ArrayList<String>();
        numberList.add("345678912");        //这里使用模拟的身份证号码
        numberList.add("886543219");
        numberList.add("972121493");
        numberList.add("667734729");
    }
    public void handleRequest(String number){
        if(numberList.contains(number))
            System.out.println("该人在天津居住");
        else{
            System.out.println("该人不在天津居住");
            if(handler != null)
                handler.handleRequest(number);   //将请求传递给下一个处理者
        }
    }
    public void setNextHandler(Handler handler){
        this.handler = handler;
    }
}