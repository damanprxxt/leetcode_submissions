/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        long  a = 0;
        long  b = 0;
        long revera=0;
        long reverb=0;
        while(l1 != null)
        {
            a=a*10+l1.val;
            l1=l1.next;
        }
        while(a > 0) {
         long valat = a % 10;
         revera = revera * 10 + valat;
           a =a/ 10;
         }
        
        while(l2 != null)
        {
            b=b*10+l2.val;
            l2=l2.next;
        }
        
        while(b > 0) {
         long valat = b % 10;
         reverb = reverb * 10 + valat;
           b =b/ 10;
         }
        
        
        
        
        a=revera;
        b=reverb;
        long  d=a+b;
        long  c=0;
        long digit=d%10;
        Integer dig=(int)(long)digit;
        
        ListNode l3= new ListNode(dig);
        d=d/10;
        ListNode head=l3;
        
        
        
        
        
        while(d>0){
            digit=d%10;
            dig=(int)(long)digit;
            l3.next = new ListNode(dig);
            l3=l3.next;
            d=d/10;
        }
        // l3.val=b;
        
        return head;
        // return l3;
        
    }
}