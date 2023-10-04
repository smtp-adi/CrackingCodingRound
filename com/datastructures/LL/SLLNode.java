package com.com.datastructures.LL;

/**
 * Node structure class for SLL.
 * @param <T>
 */
public class SLLNode<T>
{
    /**
     * data.
     */
    private T data;

    /**
     * reference to next node.
     */
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
