import java.lang.*;
import java.util.*;

import javax.swing.text.html.parser.Element;

class node
{
    public int data;
    public node next;
}
class SingllyLL1
{
    public node Head;
    public int Count;

   public SingllyLL1()
    {
        Head = null;
        Count =0;
    }
    
    public void InsertFirst(int no)
    {
        node newn = new node();
        newn.data = no;
        newn.next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            newn.next = Head;
            Head = newn;
        }
        Count++;
    }
    public void InsertLast(int no)
    {
        node newn = new node();

        node temp = Head;
        newn.data = no;
        newn.next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
          

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        Count++;
    }

    public void InsertAtPos(int no ,int pos)
    {

        if((pos<1)||(pos > Count+1))
        {
            return;
        }
        if(pos ==1)
        {
            InsertFirst(no);
        }
        else if(pos == Count+1)
        {
            InsertLast(no);
         }
         else
         {
            node newn = new node();
            newn.data = no;
            newn.next = null;

            node temp = Head;

            for(int iCnt =1 ;iCnt<(pos-1);iCnt++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;

            Count++;
         }
         

    }

    public void DeleteFirst()
    {
        if(Count == 0)
        {
            return;
        }
        else if(Count ==1)
        {
            Head = null;
        }
        else
        {
            node temp = Head;

            Head = Head.next;
            temp = null;

        }
        Count--;
    }
    public void DeleteLast()
    {
        if(Count == 0)
        {
            return;
        }
        else if(Count ==1)
        {
            Head = null;
        }
        else
        {
            node temp = Head;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;

        }
        Count--;
    }
    public void DeleteAtPos(int pos)
    {
        if((pos <1 ) ||(pos >Count))
        {
            return;
        }
        if(pos==1)
        {
            DeleteFirst();
        }
        else if(pos==Count)
        {
            DeleteLast();
        }
        else
        {
            node temp = Head;

            for(int iCnt =1;iCnt<(pos-1);iCnt++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next =null;

            Count--;
        }

    }
    public void Display()
    {
        System.out.println("Elements of linked list are :");

        node temp = Head;

        while(temp != null)
        {
            System.out.print("|"+temp.data +"|->");
            temp = temp.next;
        }

    }
    public int CountNode()
    {
        return Count;
    }
}
class SingllyLL
{

    public static void main(String a[])
    {

        SingllyLL1 sobj = new SingllyLL1();

       



        // call all Function from here ;
        

    }
}