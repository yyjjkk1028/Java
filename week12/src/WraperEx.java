import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class WraperEx {
	public static void main(String[] args) {
		/*String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query,"&");
		
		int n = st.countTokens();
		System.out.println("토큰 개수 = " + n);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}*/
		Integer[] a = new Integer[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*45+1);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d",a[i]);
		}
		System.out.println();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d",a[i]);
		}
	}
}
