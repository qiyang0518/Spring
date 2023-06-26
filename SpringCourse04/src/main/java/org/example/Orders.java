package org.example;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Orders
{
    private String oName;
    private String address;

    public Orders(String oName,String address)
    {
        this.oName = oName;
        this.address = address;
    }

    public void OrdersTest()
    {
        System.out.println(oName + "::" + address);
    }


}
