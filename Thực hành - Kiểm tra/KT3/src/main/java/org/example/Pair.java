package org.example;

public class Pair<T, T1>
{
    public T a;
    public T1 b;
    public Pair() {}
    public Pair(T i, T1 i1)
    {
        a = i;
        b = i1;
    }

    public String toString()
    {
        return "(" + a + "," + b + ")";
    }

}
