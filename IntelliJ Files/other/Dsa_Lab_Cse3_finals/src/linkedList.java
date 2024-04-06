import java.util.LinkedList;

public class linkedList {

    public linkedList(){


        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(19);
        linkedList.add(37);
        linkedList.add(11);
        linkedList.add(23);

        System.out.println(linkedList);
        linkedList.addFirst(62);
        System.out.println(linkedList);
        linkedList.set(3,22);
        System.out.println(linkedList);

    }

}
