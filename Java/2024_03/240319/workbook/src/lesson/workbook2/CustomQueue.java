package lesson.workbook2;

import java.util.Stack;

public class CustomQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public CustomQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void add(int element) {
        s2.push(element);
    }

    public Integer poll() {
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        return s1.pop();
    }

    public Integer size() {
        return s1.size() + s2.size();
    }

    public Boolean isEmpty() {
        return size() == 0;
    }
}

