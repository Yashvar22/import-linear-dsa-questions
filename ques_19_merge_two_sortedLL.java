public class ques_19_merge_two_sortedLL {
    public class ListNode {
           int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode mergeTwoLists(ListNode t1, ListNode t2) {
        ListNode dummyNode=new ListNode(-1);
           ListNode temp=dummyNode;
           while(t1!=null && t2!=null){
               if(t1.val<t2.val){
                   temp.next=t1;
                   t1=t1.next;
                   temp=temp.next;
               }
               else{
                   temp.next=t2;
                   t2=t2.next;
                   temp=temp.next;
               }
           }
           if(t1!=null){
               temp.next=t1;
           }
           else{
               temp.next=t2;
           }
          return dummyNode.next;
       }
    public static void main(String[] args) {
        
    }
}
