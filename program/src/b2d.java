class b2d {

	public static void main(String[] args) {
		int n=110,a,res=0,i=0;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			switch(i)
			{
			case 0:res=res+a;
					i++;break;
			case 1:res=res+a*2;
					i++;break;
			case 2:res=res+a*2*2;
					i++;break;
	
			}
		}
		System.out.println(res);
	}

}

