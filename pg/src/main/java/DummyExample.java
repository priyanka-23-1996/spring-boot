
public class DummyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abcabc";
		String s1="";
		char[] ch = s.toCharArray();
//		for(int i=ch.length - 1;i>=0;i--) {
//			s1 += ch[i];
//			
//		}
//		System.out.println(s1);
		
	   for(int i=0;i<ch.length;i++) {
		   if(s.substring(i+1, s.length()-1).contains(String.valueOf(ch[i]))){
			   System.out.println(ch[i]);
		   }
		   break;
	   }

	}

}
