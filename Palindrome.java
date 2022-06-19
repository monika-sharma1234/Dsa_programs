class Palindrome{
	public boolean isPalindrome(String s){
		if(s.length()==0 || s.length()==1){
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length()-1)){
			return isPalindrome(s.substring(1,s.length()-1));
		}
		return false;
	}
	public static void main(String args[]){
		Palindrome ms= new Palindrome();
		System.out.println(ms.isPalindrome("naman"));
	}
}