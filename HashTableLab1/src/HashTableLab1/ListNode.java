package HashTableLab1;

public class ListNode {
	private Number data;
	private ListNode next;

   public ListNode(Number d, ListNode n){
	   data = d;
	   next = n;
   }

   public ListNode getNext(){
      return next;
   }
   
   public Number getData() {
	   return data;
	   }

 
   public void setNext(ListNode next){
	   this.next = next;
   }
}
