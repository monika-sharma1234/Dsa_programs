class Max_product{
	public void Max_product(int arr[]){
		int max_product = 0;
		int m=0,s=0;
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i]*arr[j]>max_product){
					max_product = arr[i]*arr[j];
					m = i;
					s =j;
				}
			}
		}
		System.out.println("pairs:-"+m+","+s);
		System.out.println("maximum product :- "+max_product);
	}
	public static void main(String args[]){
		int arr[] = {10,20,30,40,50,60,45,62};
		Max_product ms = new Max_product();
		ms.Max_product(arr);
	}
}