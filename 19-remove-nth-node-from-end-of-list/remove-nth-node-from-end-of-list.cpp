/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head==NULL) return nullptr;
        if(head->next==nullptr){
            if(n==1){
            delete head;
            return NULL;
            }
        return head;
        }
        ListNode* temp=head;
        int count=0;
        while(temp!=nullptr){
            count++;
            temp=temp->next;
        }
        int removeIndex=count-n+1;
         if (removeIndex == 1) {
            ListNode* toDelete = head;
            head = head->next;
            delete toDelete;
            return head;
        }
        ListNode* traverse=head;
        ListNode* prev=NULL;
        int k=0;
        while(traverse!=NULL){
            k++;
            if(k==removeIndex){
                prev->next=prev->next->next;
                break;
            }
            prev=traverse;
            traverse=traverse->next;
        }
        return head;
    }
};