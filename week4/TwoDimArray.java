package week4;
public class TwoDimArray {
	public static void testArr(double[][] abc) 
	{
		System.out.println("����");
	}
	public static void main(String[] args) {
		double score[][] = {{3.3,3.5},
				{3.5,4.5},{4.0,3.7}};
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				sum += score[i][j];	
			}
		}
		int n = score.length;
		int m = score[0].length;
		double avg = sum / (n*m);
		System.out.println("����"+sum+"�̰� ������"+avg+"�Դϴ�.");
		System.out.printf("���� %.2f�̰� ������%.2f�Դϴ�.",sum,avg);
		testArr(score);
	}
}
