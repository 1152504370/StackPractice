package cn.edu.qdu.stackdemon;

public interface Stack {
	// ��ջ
	public void push(Object obj) throws Exception;

	// ��ջ
	public Object pop() throws Exception;

	// ��ȡ����ɾ��ջ��Ԫ��
	public Object getTop() throws Exception;

	// �ж��Ƿ�Ϊ��
	public boolean notEmpty();

}
