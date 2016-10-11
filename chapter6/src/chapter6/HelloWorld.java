package chapter6;


public class HelloWorld {
	private String msg;
	private String msg1;
	private String msg2;
	private String msg3;
	static int count = 0;
	static String prefix = "";
	
	public String getMsg1() {
		return msg1;
	}
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}
	public String getMsg2() {
		return msg2;
	}
	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}
	public String getMsg3() {
		return msg3;
	}
	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}
	
	public HelloWorld(){
		msg = "Hello World!";
	}
	public HelloWorld(String msg){
		this.msg = msg;
	}
	
	public HelloWorld(String msg, int option) {
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + "æ»≥Á«œººø‰?";
	}
		
	public void print(){
		//System.out.println(msg);
		count++;
		System.out.println("[" + count + "]" + prefix + msg);
	}
	
	public String getMsg(){
		return msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}

}
