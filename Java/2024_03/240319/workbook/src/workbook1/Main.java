package workbook1;

import java.sql.Array;
import java.util.*;

class MyStack {
    // 여기에 코드를 작성하세요.
    List<String> list = new ArrayList<>();
    int size = 0;

    public void push(String str){
        list.add(str);
        size++;
    }

    public String pop(){
        if(list.isEmpty())
            return "-1";

        size--;
        String str = list.get(size);
        list.remove(size);
        return str;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        MyStack myStack = new MyStack();
        if (myStack.isEmpty())   System.out.println("스택이 비어있습니다.");
        myStack.push("3");
        myStack.push("5");
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}