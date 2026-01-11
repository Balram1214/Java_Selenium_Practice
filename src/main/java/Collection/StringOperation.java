package Collection;

public class StringOperation {

	public static void main(String[] args) {
		
		String str = "1021301032540";
		
		String output = "";
		int zeroCnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			String s = Character.toString(ch);
			
			if(!s.equals("0")) {
				output+=s;
			}else {
				zeroCnt++;
			}
			
		}
		
		for(int j = 1; j<=zeroCnt; j++) {
			output+="0";
		}
		
		System.out.println(output);

	}

}
