class foreach {

	public static void main(String[] args) {
		
		int B[] = {1, 2, 3, 4, 5};
		
			
		
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]++);
			
		}
		for(int x:B)
		{
			System.out.println(x);
			
		}


	}

}
