package week3;

public class breakEx2 {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 10; i++) {
			inner: for (int j = 0; j < 10; j++) {
				if(i+j == 6)
					break outer;
				System.out.println("i = "+ i +", j = " + j);
			}	
		}
	}

}
