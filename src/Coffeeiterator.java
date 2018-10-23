import java.util.Iterator;

/**
 * @param
 * @Author: judy
 * @Description:
 * @Date: Created in 0:33 2018/10/23
 */
public class Coffeeiterator implements Iterator<Coffee> {
    private int size;
    int count= 5;

    @Override
    public boolean hasNext() {
        return count>0;
    }

    /**
     * 实现的是Iterator迭代器中的next方法
     * @return
     */
    public Coffee next(){       
        try {
            count--;
            return  Generator.class.newInstance().next();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void remove(){
        throw  new UnsupportedOperationException();
    }

    public static void main(String[] args){
        Coffeeiterator coffeeGenerator=new Coffeeiterator();
        for (int i = 0; i <4 ; i++) {
            System.out.println( coffeeGenerator.next());
        }
        for (Coffee e: new Generator(5))
        System.out.println( "judy"+"   "+e);
    }
}
