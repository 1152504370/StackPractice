package cn.edu.qdu.stackdemon;

public interface Stack {
	// 进栈
	public void push(Object obj) throws Exception;

	// 退栈
	public Object pop() throws Exception;

	// 获取但不删除栈顶元素
	public Object getTop() throws Exception;

	// 判断是否为空
	public boolean notEmpty();

}
