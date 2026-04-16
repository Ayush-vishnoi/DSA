package stack;

public class implement_usingArray {
    static class myStack {
        int top;
        int size;
        int[] st;
    
        public myStack(int n) {
            size=n;
            st=new int[size];
            top=-1;
        }
    
        public boolean isEmpty() {
            return top==-1;
        }
    
        public boolean isFull() {
            return top==size-1;
        }
    
        public void push(int x) {
           if(top==size-1) return;
           st[++top]=x;
        }
    
        public int pop() {
            if(top==-1) return -1;
            return st[top--];
        }
    
        public int peek() {
            if(top==-1) return -1;
            return st[top];
        }
    }
    public static void main(String args[]){
        myStack st = new myStack(5);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.peek()); // 30
        System.out.println(st.pop());  // 30
        System.out.println(st.peek()); // 2
    }
}
