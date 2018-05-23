package StackAndQueue;

import java.util.Stack;
//������ջʵ��һ������
//��������peek��poll�������涼Ҫ�����ƶ�ջ�Ĳ���
public class StackToQueue {
	private Stack<Integer> stackPop;
	private Stack<Integer> stackPush;
	public StackToQueue() {
		stackPop=new Stack<>();
		stackPush=new Stack<>();
	}
	public static void main(String[] args) {
		StackToQueue stack=new StackToQueue();
		for(int i=0;i<5;i++) {
			stack.add(i+1);
		}
		for(int i=0;i<5;i++)
			System.out.println(stack.poll());
	}
	
	public void add(int data) {
		stackPush.push(data);
	}
	public int poll() {
		if(stackPop.isEmpty()&&stackPush.isEmpty()) {//����ǿ����һ��Ҫ��Ԫ��
			throw new RuntimeException("Queue is empty");
		}else if(stackPop.empty()){//�������Ҫ������Ҫ��֤Popջȫ������
			//��סҪһ���Ե��ֻ꣬Ҫ��֤ǰ��˳�򲻱䣬��������popջ������Ϳ�����
			while(!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	public int peek() {
		if(stackPop.isEmpty()&&stackPush.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}else if(stackPop.isEmpty()){
			while(!stackPush.isEmpty())
				stackPop.push(stackPush.pop());
		}
		return stackPop.peek();
	}
}
