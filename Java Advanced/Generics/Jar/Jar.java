package Advanced.Generics.Jar;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {
    private Deque<T> content;

    public Jar() {
        this.content = new ArrayDeque<>();
    }
    public void addElement(T element){
        this.content.push(element);
    }
    public T removeElement(){
       return this.content.pop();
    }
}
