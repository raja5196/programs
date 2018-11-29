class d2b {

	public static void main(String[] args) {
		int n=5,a,res=0,i=0;
		while(n>0)
		{
			a=n%2;
			n=n/2;
			switch(i)
			{
			case 0:res=res+a;
					i++;break;
			case 1:res=res+a*10;
					i++;break;
			case 2:res=res+a*10*10;
					i++;break;
	
			}
		}
		System.out.println(res);
	}

}
