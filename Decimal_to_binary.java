class Decimal_to_binary{
	public int dtb(int n){
		if(n==0){
			return 0;
		}
		return n%2 + 10*dtb(n/2);
	}
	public static void main(String args[]){
		Decimal_to_binary ms = new Decimal_to_binary();
		System.out.println(ms.dtb(10));
	}
}