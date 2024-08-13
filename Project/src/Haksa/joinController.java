package Haksa;

import java.util.ArrayList;
import java.util.List;

public class joinController {
	
	List<join> joinList = new ArrayList<join>();
	
	public joinController() {
		joinList.add(new join("abc", "123", "홍길동1", "컴공", 202401));
		joinList.add(new join("def", "456", "홍길동2", "경영", 202402));
		joinList.add(new join("ghi", "789", "홍길동3", "영문", 202403));
		joinList.add(new join("jkl", "101", "홍길동4", "화공", 202404));
		joinList.add(new join("mno", "112", "홍길동5", "전기", 202405));
	}
	
	public void join_(join j) {
		joinList.add(j);
	}
	
	public ArrayList selectList(int No) {
		ArrayList<join> selectList = new ArrayList<join>();
		for(join j : joinList) {
			if(j.getNo() == No) {
				selectList.add(j);
			}
		}				
		return selectList;
	}
	
	public List loginId() {
		List<String> loginArray = new ArrayList<>();
		for(join j : joinList) {
			loginArray.add(j.getId());
		}		
		return loginArray;
	}
	
	public List loginPw() {
		List<String> loginArray = new ArrayList<>();
		for(join j : joinList) {
			loginArray.add(j.getPw());
		}		
		return loginArray;
	}
	
	public boolean login(String id, String pw) {
		for(join j: joinList) {
			if(loginId().contains(id)) {
				if(loginPw().contains(pw)) {
					if(loginId().indexOf(id) == loginPw().indexOf(pw)) {
						return true;
					}else return false;
				}else return false;
			}else return false;
		}
		return false;
	}
}
