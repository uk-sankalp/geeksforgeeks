/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        ArrayList<Integer> arr=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        Collections.reverse(arr);
        temp=head;
        int ind=0;
        while(temp!=null){
            if(temp.data!=arr.get(ind)){
                return false;
            }
            temp=temp.next;
            ind++;
        }
        return true;
        
    }
}