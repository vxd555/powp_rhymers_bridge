package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer
{
    IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer()
    {
        this.intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack)
    {
        this.intArrayStack = intArrayStack;
    }

    public int getTotal()
    {
        return intArrayStack.getTotal();
    }

    public void setTotal(int total)
    {
        intArrayStack.setTotal(total);
    }

    public void countIn(int in)
    {
        intArrayStack.countIn(in);
    }

    public boolean callCheck()
    {
        return intArrayStack.callCheck();
    }

    public boolean isFull()
    {
        return intArrayStack.isFull();
    }

    public int peekaboo()
    {
        return intArrayStack.peekaboo();
    }

    public int countOut()
    {
        return intArrayStack.countOut();
    }
}