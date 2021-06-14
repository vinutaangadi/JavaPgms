package com.code;
class MethodOverload {
    public void disp(char c)
    {
        System.out.print(c);
    }
    public void disp(char c, int num)
    {
        System.out.println(c +" "+num);
    }
}
class Sample{
    public static void main(String args[])
    {
        MethodOverload obj = new MethodOverload();
        obj.disp('a');
        obj.disp('a',10);
    }
}