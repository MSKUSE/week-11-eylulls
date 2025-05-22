
public class StackLinkedList implements Stack{

    StackItem top;
    @Override
    public void push(Object item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public Object pop() {
        if(this.pop == null){
            throw new MyEmptyStackException("stack is empty,you can't pop anything");
        }
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
}
