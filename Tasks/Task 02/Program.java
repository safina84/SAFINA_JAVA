class Program {
	public static void main(String[] args) {
		int number = 137;
		int x=number%2;
		int y=(number/2)%2;
		int z=(number/2/2)%2;
		int a=(number/2/2/2)%2;
		int b=(number/2/2/2/2)%2;
		int c=(number/2/2/2/2/2)%2;
		int d=(number/2/2/2/2/2/2)%2;
		int e=(number/2/2/2/2/2/2/2)%2;		
		System.out.println("137 = "+e+d+c+b+a+z+y+x);
	}
}