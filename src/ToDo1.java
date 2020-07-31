import java.util.Scanner;

public class ToDo1 {
	void ToDoStart() {

		System.out.println(
				"\n-------------------\n1~4중에서 고르세요.\n" + "1. 일정 추가\n" + "2. 일정 삭제\n" + "3. 일정 확인\n" + "4. 끝내기");

		Scanner sc = new Scanner(System.in);
		boolean breakNum = true;
		String num = sc.nextLine();
		System.out.println("\n-------------------\n");
		switch (num) {
		case "1":
			ToDoInsert();
			break;
		case "2":
			ToDoDelete();
			break;
		case "3":
			ToDoCheck();
			break;
		case "4":
			System.out.println("안녕히 가세요.");
			breakNum = false;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		if (breakNum) {
			System.out.println("\n더 원하시는 일이 있습니까?");
			ToDoStart();
		}

	}

	public void ToDoInsert() {

	}

	public void ToDoDelete() {

	}

	public void ToDoCheck() {

	}

}
