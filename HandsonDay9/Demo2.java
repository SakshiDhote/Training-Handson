
public class Demo2 {
	
	boolean palindromeCheck(String a) {
			
		StringBuffer s=new StringBuffer(a);
		StringBuffer b= s.reverse();
		if(s.equals(b)) {
			return true;
		}
		else {
			return false;
		}
	}
}
