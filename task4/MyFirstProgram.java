class MyFirstClass {
	public static void main(String[] s){
	MySecondClass o=new MySecondClass(6,6);
	int i, j;
    	for (i = 1; i <= 8; i++) {
        	for(j = 1; j <= 8; j++) {
            		o.setfirstvalue(i);
            		o.setsecondvalue(j);
            		System.out.print(o.multiplication());
            		System.out.print(" ");
        	}
        	System.out.println();
    	}
	}
}
class MySecondClass {
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

	
	