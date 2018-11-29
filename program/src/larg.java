class larg {

	public static void main(String[] args) {
		int a=7,b=6,c=3,d=5,lar,smal;
		lar=((a>b)&&(a>c)&&(a>d))?a:((b>c)&&(b>d)?b:(c>d)?c:d);
		smal=((a<b)&&(a<c)&&(a<d))?a:((b<c)&&(b<d)?b:(c<d)?c:d);
		System.out.println(lar+" "+smal);
		}

}
