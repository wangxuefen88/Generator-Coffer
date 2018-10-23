import sun.rmi.runtime.Log;

/**
 * @param
 * @Author: judy
 * @Description:
 * @Date: Created in 23:30 2018/10/22
 */
public class Coffee {
    private static long count=0;
    private final long id=count++;
   public String toString(){
        return getClass().getSimpleName()+" " +id;
    }
}

class CoffeeA extends Coffee{}
class CoffeeB extends Coffee{}
class CoffeeC extends Coffee{}
class CoffeeD extends Coffee{}
class CoffeeX extends Coffee{}
class CoffeeY extends Coffee{}
class CoffeeZ extends Coffee{}
class CoffeeF extends Coffee{}