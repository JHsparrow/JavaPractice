
public class EX11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String season[] = {"Spring","Summer","Fall","Winter"};
//		String[] season = {"Spring","Summer","Fall","Winter"};
		
//		int scores[] = {83,90,87};
//		
//		int sum = 0;
//		for (int i=0; i<scores.length;i++ ) {
//			sum += scores[i]; 
//		}
//		System.out.println(sum);
		
//		String arr1[] = new String[3];
//		
//		for (int i=0; i<3; i++) {
//			System.out.println(arr1[i]);
//		}
		
//		int scores[] [] = {
//				{80,90,96},
//				{76,88}
//		};
//		
//		
//		int sum = 0;
//		for (int i=0; i<scores[1].length;i++) {
//			sum +=  scores[1] [i];
//		}
//		System.out.println(sum);
//		
//		double Avg = (double)sum / scores[1].length;
//		System.out.println(Avg);
		
//		int scores[][] = {{80,90,76},{76,88}};
//		int mathScores[][] = new int[2][3];
//		
//		for (int i=0; i<scores[i].length;i++) {
//			for(int j=0;j<scores[j].length;j++) {
//				System.out.println(mathScores[i][j]);
//			}
//		}
		
//		String strArray[] = new String[3];
//		strArray[0] = "java";
//		strArray[1] = "java";
//		strArray[2] = new String("java");
//		
//		System.out.println(strArray[0] == strArray[1]);
//		System.out.println(strArray[0] == strArray[2]);
//		System.out.println(strArray[0].equals(strArray[2]));
		
		int oldIntArray[] = {1,2,3};
		int newIntArray[] = new int[5];
		
//		for (int i = 0; i<oldIntArray.length;i++) {
//			newIntArray = new int[5];
//		}
		
		System.arraycopy(oldIntArray, 0, newIntArray,0, oldIntArray.length);
		//원본배열 , 원본 시작 인덱스, 새배열, 새배열 시작 인덱스, 복사 항목 수
		
		for (int i = 0; i<newIntArray.length;i++) {
			System.out.println(newIntArray[i]);
		}
		
				
		
		
	}

}
