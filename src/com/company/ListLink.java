package com.company;

class Node {
    public int value;
    public Node next;

    Node(int value) {
        this.value = value;

    }
}
   /* void printList()                //печать списка
    {
        ListNode element = next;       //получаем ссылку на первый элемент
        while (element != null)           //пока элемент существуе
        {
            System.out.print(element.val + " "); //печатаем его данные
            element = element.next;                     //и переключаемся на следующий
        }
    }*/

public class ListLink {
    public Node head;
    /*  public Node head;
      public Node tail;

      public void addFirst(E data) {
          Node node = new Node(data);  //создаём новый элемент
          node.data=data;
          if (head == null) {
              head = node;
              tail = node;
          } else {
              node.next = head;
              head = node;
          }
      }

      void printList()                //печать списка
      {
          Node element = head;       //получаем ссылку на первый элемент
          while (element != null)           //пока элемент существуе
          {
              System.out.print(element.data + " "); //печатаем его данные
              element = element.next;                     //и переключаемся на следующий
          }
      }
   public boolean hasLoop(Node head) {
       if (head == null) return false;
       Node fast = head.next;
       Node slow = head;
       while (fast != null && fast.next != null && slow!=null) {
           if (fast == slow) {
               return true;
           }
           fast = fast.next.next;
           slow = slow.next;
       }
       return false;
   }

  }*/
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean ifLoopExists() {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr)
                return true;

        }
        return false;
    }

}