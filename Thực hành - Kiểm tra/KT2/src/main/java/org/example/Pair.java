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
        return a + " " + b;
    }

    public boolean isPrime() {
        return isPrime((Integer) a) && isPrime((Integer) b);
    }

    private boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i <= (int)(Math.sqrt(num)); i++)
        {
            if(num % i == 0) return false;
        }
        return true;
    }

}
