import java.util.Scanner;

public class ToDo1 {
	void ToDoStart() {

		System.out.println(
				"\n-------------------\n1~4�߿��� ������.\n" + "1. ���� �߰�\n" + "2. ���� ����\n" + "3. ���� Ȯ��\n" + "4. ������");

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
			System.out.println("�ȳ��� ������.");
			breakNum = false;
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		if (breakNum) {
			System.out.println("\n�� ���Ͻô� ���� �ֽ��ϱ�?");
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
