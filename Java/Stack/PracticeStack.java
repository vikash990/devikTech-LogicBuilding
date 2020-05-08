import java.util.*;

public class PracticeStack{

public static void main(String args[]){

Stack<Integer> stack=new Stack<Integer>();

stack.push(10);
stack.push(7);
stack.push(22);
stack.push(21);

Iterator<Integer> itr=stack.iterator();

while(itr.hasNext()){

System.out.println(itr.next());

} 

System.out.println(stack.isEmpty());

System.out.println(stack.peek());


}
}