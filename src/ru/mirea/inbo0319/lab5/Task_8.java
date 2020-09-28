package ru.mirea.inbo0319.lab5;

class Task_8
{
    public static boolean recursion (String s)
    {
        char firstChar;
        char lastChar;
        int size = s.length ();
        String subString;
        if (size <= 1)
        {
            return true;
        }
        else
        {
            firstChar = s.toCharArray() [0];
            lastChar = s.toCharArray() [size - 1];
            subString = s.substring(1, size - 1);
            return firstChar == lastChar && recursion(subString);
        }
    }
}