package strTokenizer;

import java.util.StringTokenizer;

public class StringTokenizers {

	public static void main(String[] args) {
		String str = "Sunday Monday Tuesday Wednesday Thursday Friday Saturday";
		String strReverse;
		
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreTokens()) {
			sb.insert(0, st.nextToken());
			if (st.hasMoreTokens()) {
				sb.insert(0, "");
			}	
		}
		strReverse = sb.toString();
		System.out.println(strReverse);

	}

}
