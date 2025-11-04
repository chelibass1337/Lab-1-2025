package myfirstpackage;

public class MySecondClass {
	private int first;
	private int second;
	public void setfirstvalue(int i) {
		first=i;
	}

	public void setsecondvalue(int j) {
		second=j;
	}

	public int multiplication() {
		return first*second;	
	}
	
	public MySecondClass(int uno,int des) {
		first=uno;
		second=des;
	}
}