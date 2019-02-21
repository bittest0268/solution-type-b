package problem04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		char[] stoneBridge = createStoneBridge();
		int stoneLength=stoneBridge.length;
		int inNum = 0;	//다리 길이
		int thisNum=0;	//현재 다리 위치
		int cnt=0; //도전 횟수
		int reCnt=0; //재시도 횟수
		Scanner sc=new Scanner(System.in);
		System.out.println(stoneBridge);

		while(thisNum <= stoneLength) {
			System.out.println((cnt+1)+"." );
			inNum = sc.nextInt();
			System.out.println(inNum);
			
			if(inNum > 4 && inNum < 1) {
				System.out.println("1~4사이 숫자를 입려해주세요.");
				continue;
			}else {
				thisNum += inNum-1;
				cnt++;
				if('O'==stoneBridge[thisNum]) {	//강
					stoneBridge = createStoneBridge();
					thisNum = 0;
					cnt=0;
					reCnt++;
				}
			}
		}
		System.out.println("게임종료");
		System.out.println("도전 횟수 : "+cnt +"재시도 횟수 : "+reCnt);
	}

	public static char[] createStoneBridge() {
		char[] stoneBridge = new char[20];
		char[] stoneRiver= {'O','#'};
		int i=0;
		int cnt1=0;
		int cnt2=0;
		
		
		do{
			for(i=0; i<stoneBridge.length; i++) {
				stoneBridge[i] = stoneRiver[(int) (Math.random()*2)];
			}
			
			for(i=0; i<stoneBridge.length; i++) {
				if('#' == (stoneBridge[i])) {
					cnt1++;
				}else {
					cnt2++;
				}
			}
			
		}while(cnt1 < 10 && cnt2 <10); 
		return stoneBridge;
	}
}
