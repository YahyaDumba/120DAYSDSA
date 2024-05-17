public class LList {
    public int size=0;
    LList()
    {
        this.size=0;
    }
    NODE head;
    class NODE {
        String data;
        NODE next;
        NODE(String data) {
            this.data = data;
            this.next = null;//always first will be null
            size++;
        }
    }
    public void addFirst(String data)
    {
        NODE newNOde= new NODE(data);
        if(head==null)
        {
            head=newNOde;
            return;
        }
        newNOde.next=head;
        head=newNOde;
    }
    public void addLast(String data)
    {
        NODE newNode=new NODE(data);
        if(head == null)
        {
            head=newNode;
            return;
        }
        //traversing in a linked list
        NODE currnode=head;
        while(currnode.next !=null)
        {
            currnode=currnode.next;
        }
        currnode.next=newNode;

    }
    public void printLL()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        NODE currnode=head;
        while(currnode!=null)
        {
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.print("null");
    }
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
        }
        size--;
        head=head.next;
    }
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        size--;
        if(head.next==null)//will arise if and only if there is only one node in the whole linkedlist
        {
            head=null;
            return;
        }
        NODE secondlast=head;
        NODE lastnode=head.next;
        while(lastnode.next!=null)
        {
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;


    }
    public int getsize()
    {
        return size;
    }
    public  void reverseLL()
    {
        if(head==null || head.next==null)
        {
            return;

        }
        NODE prevnode=head;
        NODE currnode=head.next;
        while(currnode!=null)
        {
            NODE nextnode=currnode.next;
            currnode.next=prevnode;
            //updating
            prevnode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prevnode;
    }
    public NODE reverseRecursive(NODE head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        NODE newhead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String[] args) {
        LList list=new LList();
        list.addFirst("There");
        list.addFirst("Hii!");
        list.printLL();
        System.out.println();
        list.addLast("Yahya");
        list.printLL();
        list.addLast("Here!");
        System.out.println();
        list.printLL();
        list.deleteFirst();
        System.out.println();
        list.printLL();
        System.out.println();
        list.deleteLast();
        list.printLL();
        System.out.println();
        System.out.println(list.getsize());
        list.reverseLL();
        list.printLL();
        list.head=list.reverseRecursive(list.head);
        list.printLL();
    }
}