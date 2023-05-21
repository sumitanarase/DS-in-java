import java.lang.*;
import java.time.temporal.Temporal;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.print.attribute.standard.NumberOfInterveningJobs;

class node
{
    int data;
    node next;
    node prev;
}
class Link
{
    public int Count;
    public node Head;

    public Link()
    {
        Count =0;
        Head = null;
    }
    public void InsertFirst(int no)
    {
        node newn = new node();

        newn.next =null;
        newn.prev = null;
        newn.data =no;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            newn.next = Head;
            Head.prev = newn;
            Head = newn;
        }
        Count++;
    }

    public void InsertLast(int no)
    {
        node newn =  new node();

        newn.data = no;
        newn.next = null;
        newn.prev = null;

        if(Head ==null)
        {
            Head = newn;
        }
        else
        {
            node temp = Head;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next=newn;

        }
        Count++;
    }
   public void DeleteFirst()
    {
        if(Count == 0)
        {
            return;
        }
        else if(Count == 1)
        {
            Head =null;
        }
        else 
        {
            Head = Head.next;
            Head.prev = null;
        }
        Count--;
    }
   public void DeleteLast()
    {
        if(Count == 0)
        {
            return;
        }
        else if(Count == 1)
        {
            Head =null;
        }
        else 
        {
            node temp = Head;

            while(temp.next.next != null)
            {
                temp =temp.next;
            }
            temp.next =null;
        }
        Count--;
    }
    public void InsertAtPos(int no ,int pos)
    {
        node newn = new node();

        if((pos < 1)||(pos > Count+1))
        {
            return;
        }
        if(pos == 1)
        {
            InsertFirst(no);
        }
        else if(pos == Count+1)
        {
            InsertLast(no);
        }
        else
        {
            newn.data = no;
            newn.next =null;
            newn.prev = null;

            node temp = Head;

            for(int iCnt =1;  iCnt<(pos-1);iCnt++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next.prev = newn;
            newn.prev = temp;
            temp.next = newn;

        }
    }

    public void DeleteAtPos(int pos)
    {
        node newn = new node();

        if((pos < 1)||(pos > Count))
        {
            return;
        }
        if(pos == 1)
        {
            DeleteFirst();
        }
        else if(pos == Count+1)
        {
            DeleteLast();
        }
        else
        {
            
            node temp = Head;
            node temdel = null;

            for(int iCnt =1;  iCnt<(pos-1);iCnt++)
            {
                temp = temp.next;
            }
            temdel = temp.next;
            temp.next = temp.next.next;
            temdel=null;
            

        }
    }


    public void Display()
    {
        node temp = Head;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|<=>");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public int CountNode()
    {
        return Count;

    }
}
class DoubllyLL
{

    public static void main(String arg[])
    {
        Link obj = new Link();

        obj.InsertFirst(21);
        obj.InsertFirst(11);

      obj.InsertAtPos(75, 2);
      obj.DeleteAtPos(2);

        obj.Display();



    }
}