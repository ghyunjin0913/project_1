package Haksa;

import java.util.Scanner;

public class StudentMenu {
	Scanner sc = new Scanner(System.in);	
	StudentController stdCon = new StudentController();
	joinController jc = new joinController();
	private Student mysub; 
	
	public void stdMenu(){
		while(true) {
			System.out.println("===== 학생 menu =====");
			System.out.println("1. 수강신청\n2. 수강신청 확인\n3. 정보확인\n4. 종료");
			System.out.print("메뉴 번호 입력: ");
			
			String menuNum = sc.nextLine();
			int num = Integer.parseInt(menuNum);
			
			switch(num) {
			case 1:
				applyClass();
				break;
			case 2:
				subjecList();
				break;
			case 3:
				information();
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}
			System.out.println();
		}
	}
	
	public void applyClass() {
		stdCon.printList();
		String[] basket = new String[3];
		while(true) {						
			for(int i = 0; i < basket.length;) {					
				System.out.print("강의 선택(번호): ");
				String sub = sc.nextLine();
				int subNum = Integer.parseInt(sub);
				String result = stdCon.applyClass(subNum);
				if(result != null) {
					basket[i] = result;
					i++;
				} else {
					System.out.println("인원 초과!");
				}
			}
			break;	
		}
		mysub = new Student(basket[0], basket[1], basket[2]);
	}
	
	public void subjecList() {
		if(mysub != null) {
			System.out.println(mysub);
		} else {
			System.out.println("수강신청을 해주세요.");
		}
	}
	
	public void information() {
		System.out.print("학번을 입력하세요 : ");
		String inputNo = sc.nextLine();
		int No = Integer.parseInt(inputNo);
		System.out.println(jc.selectList(No));
	}
}
