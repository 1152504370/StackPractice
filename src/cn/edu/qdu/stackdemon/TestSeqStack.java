package cn.edu.qdu.stackdemon;

public class TestSeqStack {
	public static void main(String[] args) {
		SeqStack myStack = new SeqStack();
		int test[] = { 1, 3, 5, 7, 9 };
		int n = 5;
		try {
			for (int i = 0; i < n; i++) {
				myStack.push(new Integer(test[i]));
			}
			System.out.println("Ԫ����ջ����Ϊ�� ");
			for (int i = 0; i < n; i++) {
				System.out.print(test[i] + " ");
			}
			System.out.println();

			System.out.println("��ǰջ��Ԫ��Ϊ�� " + myStack.getTop());

			System.out.println("Ԫ�س�ջ����Ϊ�� ");
			while (myStack.notEmpty()) {
				System.out.print(myStack.pop() + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
