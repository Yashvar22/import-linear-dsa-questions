public class ques_20_remove_nth_node_from_last {
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      public ListNode deleteNth(ListNode head,int n){
            ListNode fast=head;
            ListNode slow=head;
            for(int i=0;i<n;i++){
              fast=fast.next;
            }   
            if(fast==null){
                return head.next;
            }   
            while(fast.next!=null){
              slow=slow.next;
              fast=fast.next;
            }  
            ListNode delete=slow.next;
            slow.next=slow.next.next;
            delete=null;
            return head;
      }
    public static void main(String[] args) {
        
    }
}
