class change {
	public static void main(String[] args) {
		int a=7,b=4,c=3;
		System.out.println("Before Swapping");
		System.out.println(a+" "+b+" "+c);
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.println("After Swapping");
		System.out.println(a+" "+b+" "+c);
		}
}
