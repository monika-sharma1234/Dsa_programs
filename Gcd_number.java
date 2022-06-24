class Gcd_number{
	public int gcd(int a,int b){
		if(b==0){
			return a;
		}
		if(a<0 || b<0){
			return -1;
		}
		return gcd(b,a%b);
	}
	public static void main(String args[]){
		Gcd_number ms = new Gcd_number(); 
		System.out.println(ms.gcd(12,8));
	}
}