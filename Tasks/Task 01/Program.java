class Program {
	public static void main(String[] args) {
		int sum = 15867;
		int x = sum/5000;
		int y = (sum - x*5000)/2000;
		int z = (sum-x*5000-y*2000)/1000;
		int a = (sum-x*5000-y*2000-z*1000)/500;
		int b = (sum-x*5000-y*2000-z*1000-a*500)/200;
		int c = (sum-x*5000-y*2000-z*1000-a*500-b*200)/100;
		int d = (sum-x*5000-y*2000-z*1000-a*500-b*200-c*100)/50;
		System.out.println("5000 - "+x);
		System.out.println("2000 - "+y);
		System.out.println("1000 - "+z);
		System.out.println("500 - "+a);
		System.out.println("200 - "+b);
		System.out.println("100 - "+c);
		System.out.println("50 - "+d);	
	}
}