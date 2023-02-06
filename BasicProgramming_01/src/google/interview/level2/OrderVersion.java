package google.interview.level2;

public class OrderVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] l = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
		
		
		System.out.println(toString(solution(l)));
	}
	
    public static String[] solution(String[] l) {


    	
    	
    	
    	
    return  l;
    }

    
    
    
    public static String toString(String[] l) {
    	StringBuilder sb=new StringBuilder();
    	for (int i = 0; i < l.length; i++) {
			sb.append(l[i]);
			sb.append(" ");
		}
    	return sb.toString();
    }
}
