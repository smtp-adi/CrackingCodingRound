package com.com.datastructures.LL;
public class SLLNode<T>
{
    private T data;
    private SLLNode next;

    public SLLNode(T data)
    {
        this.data = data;
    }

    public T getData ()
    {
        return this.data;
    }

    public void setData (T data)
    {
        this.data = data;
    }

    public SLLNode getNext ()
    {
        return this.next;
    }

    public void setNext (SLLNode next)
    {
        this.next = next;
    }

}