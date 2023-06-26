package org.example;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Demo
{
    private String sName;
    private int age;

    public Demo()
    {}

    public Demo(String sName,int age)
    {
        this.sName = sName;
        this.age = age;
    }

    public String say(String name)
    {
        System.out.println("hello" + name);
        return "hello" + name;
    }

    public void setsName(String sName)
    {
        this.sName = sName;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void DemoTest()
    {
        System.out.println(sName + "::" + age);
    }
}
