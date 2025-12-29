/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        int zeros=0;
        int ones=0;
        int twos=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zeros++;
            }
            else if(temp.data==1){
                ones++;
            }
            else{
                twos++;
            }
            temp=temp.next;
        }
        Node curr=head;
        while(zeros!=0){
            curr.data=0;
            curr=curr.next;
            zeros--;
        }
        while(ones!=0){
           curr.data=1;
            curr=curr.next;
            ones--;
        }
        while(twos!=0){
            curr.data=2;
            curr=curr.next;
            twos--;
        }
        return head;
    }
}