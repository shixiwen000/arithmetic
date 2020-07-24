package stageOne;

import java.util.Stack;

public class leetCode_155_minStack {

}
class MinStack {
    Stack<Integer> data;
    Stack<Integer> helper;
    /** initialize your data structure here. */
    public MinStack() {
         data=new Stack<>();
         helper=new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if(helper.isEmpty()||helper.peek()>=x) {
            helper.push(x);
        }
    }

    public void pop() {
        if(!data.isEmpty()){
            if(data.pop().equals(helper.peek())) {
                helper.pop();
            }
        }
    }

    public int top() {
        if(!data.isEmpty()) {
            return data.peek();
        }
        throw new RuntimeException("数据栈为空");
    }

    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException("数据栈为空");
    }
}