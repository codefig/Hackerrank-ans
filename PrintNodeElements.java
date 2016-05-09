// class Node {
// 	int data;
// 	Node next;
// }

void Print(Node head) {
  Node current_head = head;
  while(head != null)
  {
    System.out.println(head.data);
    head = head.next;
  }
  
}