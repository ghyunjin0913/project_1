package Haksa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
	
	Scanner sc = new Scanner(System.in);
	Student std = new Student();
	List<Student> Student = new ArrayList<Student>();
	Subject[] subList = new Subject[5];
 	{
			subList[0] = new Subject("강의1", 5, 3);
			subList[1] = new Subject("강의2", 5, 5);
			subList[2] = new Subject("강의3", 5, 2); 
			subList[3] = new Subject("강의4", 5, 2);
			subList[4] = new Subject("강의5", 5, 3);
	}

	public void printList() {
		for(int i = 0; i < subList.length; i++) {
			System.out.println(i + ". " + subList[i]);
		}
	}

	public String applyClass(int num) {
		String subName = "";
		for (int j = 0; j < subList.length; j++) {
			if(j == num) {
				if(subList[j].getFullPers() > subList[j].getNowPers()) {
					subName = subList[j].getSubName();
					subList[j].setNowPers(subList[j].getNowPers() + 1);
					break;
				} else { return null;}				
			} else {
				continue;
			}
		}
		return subName;
	}

}
