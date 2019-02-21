package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		//
		// 코드를 완성 하십시오.
		//
		int num1 = 0;
		int num2 = 0;
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]!=arr[j]) {
					if(temp < arr[i] * arr[j]) {
						num1=arr[i];
						num2=arr[j];
						temp = arr[i] * arr[j];
					}
				}
			}
		}
		System.out.println("["+num1+","+num2+"]");
	}
}
