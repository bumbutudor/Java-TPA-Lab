package com.student.utm;

public class Book
{
    public static void main(String[] args)
    {
        //тест
        Page obj1 = new Page("Red", 9);
        Page obj2 = new Page ("Yellow",15);
        obj1.toPage();
        obj1.changeDepth(12);
        obj1.toPage();
        obj2.toPage();
        obj2.changeDepth(23);
        obj2.toPage();

    }
}

class Line
{
    int LineDepth;
    Line()
    {
        LineDepth = 10;
    }
    Line(int num)
    {
        LineDepth = num;
    }
}

class Page extends Line
{
    String color;
    Page()
    {
        super();
        color = "black";
    }
    Page(int num)
    {
        super(num);
    }
    Page(String c, int num)
    {
        super(num);
        color = c;
    }
    void changeDepth(int newLine)
    {
        super.LineDepth = newLine;
    }
    void toPage()
    {
        System.out.println("Page have" + " " + LineDepth+" " + "lines and" + " " + color + " " + "color");
    }
}