package Haksa;

import java.util.Scanner;

public class loginMenu {
	Scanner sc = new Scanner(System.in);
	joinController jc = new joinController();
	join j = new join();
	
	public void mainmenu() {	
		while(true) {
			System.out.println("===== login =====");
			System.out.println("1. 로그인\n2. 회원가입");
			System.out.print("선택 : ");
			String login = sc.nextLine();
						
			if(login.equals("1")) {
				if(login() == true) {
					System.out.println("로그인 성공");
					new StudentMenu().stdMenu(); 
					break; 
				} else {
					System.out.println("로그인 실패");
					continue;
				}						
			} else if(login.equals("2")) {
				join();
				continue;
			} else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}	
	}
	
	public boolean login() {
		System.out.print("id : ");
		String inputId = sc.nextLine();
		System.out.print("pw : ");
		String inputPw = sc.nextLine();
		
		boolean result = jc.login(inputId, inputPw);
		
		return result;
	}
	
	public void join() {		
		System.out.print("id : ");
		String Id = sc.nextLine();
		System.out.print("pw : ");
		String Pw = sc.nextLine();
		System.out.print("이름 : ");
		String Name = sc.nextLine();
		System.out.print("전공 : ");
		String Major = sc.nextLine();
		int No = 0;
		for (int i = 202406; i < 202499;) {
			if(No == 0) {
				No = i;
				i++;
				break;
			}
		}
		System.out.println(No);
		join ji = new join(Id, Pw, Name, Major, No);
		jc.join_(ji);
	}
}
