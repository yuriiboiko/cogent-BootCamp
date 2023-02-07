package google.interview.level2;

public class OrderVersion {
	/*
	 * Given a list of elevator versions represented as strings, write a function solution(l) 
	 * that returns the same list sorted in ascending order by major, minor, and revision 
	 * number so that you can identify the current elevator version. The versions in list 
	 * l will always contain major numbers, but minor and revision numbers are optional. 
	 * If the version contains a revision number, then it will also have a minor number.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] l = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
		String[] l1= {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};
		

		System.out.println(toString(solution(l)));
		System.out.println(toString(solution(l1)));

	}

	
	public static String[] solution(String[] l) {
		for (int i = 0; i < l.length; i++) {
			for (int j = i; j < l.length; j++) {
				if(compareVersion(l[i],l[j])==1) {
					String temp=l[i];
					l[i]=l[j];
					l[j]=temp;
				}
			}
			
		}
		return l;
	}


	//Return 0 if the string are the same, 
	//Return -1 if the s1 version is less than the s2 version
	//Return 1 if the s1 version is greater than the s2 version
	private static int compareVersion(String s1, String s2) {
		String[] list1 =s1.split("\\.");
		String[] list2 =s2.split("\\.");
		int size= Math.min(list1.length, list2.length);
		for (int i = 0; i <size; i++) {
			int l= Integer.parseInt(list1[i]);
			int r= Integer.parseInt(list2[i]);
			if(l<r) {
				return -1;
			}
			else if(l>r) {
				return 1;
			}
		}
		if(list1.length==list2.length) {
			return 0;
		}else {
			if(list1.length>list2.length) {
				return 1;
			}
			else {
				return -1;
			}
		}
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
