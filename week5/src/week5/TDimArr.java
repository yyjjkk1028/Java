package week5;

public class TDimArr {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		int [][] arr2 = new int[3][5];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("-------------");
		int [][][] arry3 = new int[2][3][5];
		for (int i = 0; i < arry3.length; i++) {
			for (int j = 0; j < arry3[0].length; j++) {
				for (int j2 = 0; j2 < arry3[0][0].length; j2++) {
					System.out.print(arry3[i][j][j2] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
