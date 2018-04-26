import java.util.ArrayList;

public class Beijing implements Handler{
	private Handler handler;
	private ArrayList<String>numberList;
	Beijing(){
		numberList=new ArrayList<String>();
		numberList.add("11129812340930034");
		numberList.add("10120810340930632");
		numberList.add("22029812340930034");
		numberList.add("32620810340930632");
	}
	public void handleRequest(String number){
		if(numberList.contains(number))
			System.out.println("�����ڱ�����ס");
		else{
			System.out.println("���˲��ڱ�����ס");
			if(handler!=null)
				handler.handleRequest(number);
		}
	}
	public void setNextHandler(Handler handler){
		this.handler=handler;
	}

}
