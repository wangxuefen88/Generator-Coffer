import java.util.*;
import java.util.Random;

/**
 * @param
 * @Author: judy
 * @Description:
 * @Date: Created in 23:31 2018/10/22
 */
public class Generator  implements ConffeeGenerator<Coffee> ,Iterable<Coffee>{

   private Class[] arraysCoffer = {CoffeeA.class,CoffeeB.class,CoffeeC.class,CoffeeD.class,CoffeeF.class,CoffeeX.class,CoffeeY.class,CoffeeZ.class};
   private static Random random=new Random(47);

    public Generator(){}
    private int size=0;
   public Generator(int sz){
       this.size=sz;
   }
    @Override
    public Coffee next() {
        try {
            //拿到一个coffee，然后创建实例返回，newInstance()返回的是一个实例方法Object，需要强制转型
            return(Coffee)arraysCoffer[random.nextInt(arraysCoffer.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     * new is about Iterator
     * @return an Iterator.
     */

    public Iterator<Coffee> iterator() {
        return new Coffeeiterator();
    }
}

