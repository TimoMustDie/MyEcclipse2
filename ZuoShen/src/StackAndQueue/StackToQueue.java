package StackAndQueue;

import java.util.Stack;
//用两个栈实现一个队列
//核心是在peek和poll方法里面都要进行移动栈的操作
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
		if(stackPop.isEmpty()&&stackPush.isEmpty()) {//这里强调了一定要有元素
			throw new RuntimeException("Queue is empty");
		}else if(stackPop.empty()){//这里很重要，首先要保证Pop栈全弹完了
			//记住要一次性倒完，只要保证前后顺序不变，后来的在pop栈的下面就可以了
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
