public class ques_21_intersection_two_ll {
    public class Node {
        int val;
         Node next;
         Node() {}
         Node(int val) { this.val = val; }
         Node(int val, Node next) { this.val = val; this.next = next; }
      }

    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA==null || headB==null){
            return null;
        }
       Node t1=headA;
       Node t2=headB;
       while(t1!=t2){
          t1=t1.next;
          t2=t2.next;
          if(t1==t2) return t1;
          if(t1==null) t1=headB;
          if(t2==null) t2=headA;
       }
       return t1;
    }
    public static void main(String[] args) {
        
    }
}
