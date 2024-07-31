
public class Test 
{

    public static void main(String[] args)
    {
        //Logger ob=new Logger() //if we remove this comment error
        Logger obj1=Logger.getInstanceOfLogger();//obj which is created in the logger class is used  
        System.out.println("obj1's value:"+obj1.value);
        obj1.increamentvalue();//obj1 value is changed
        Logger obj2=Logger.getInstanceOfLogger();//same obj reference is provided
        System.out.println("obj2's value:"+obj2.value);//obj2 value should be zero if new object is created but 1 so same object is refered
    }


}
