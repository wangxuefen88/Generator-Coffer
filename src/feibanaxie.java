/**
 * @param
 * @Author: judy
 * @Description: 斐波那契数列，表示的前两个数相加
 * @Date: Created in 8:54 2018/10/23
 */
public class feibanaxie implements ConffeeGenerator {
   private  static int count=0;

    @Override
    public Object next() {
        return flb(count++);
    }
    private int flb(int n){
        if(n<2){
            return 1;
        }
        return flb(n-2)+ flb(n-1);
    }
    public static void  main(String[] args){
        feibanaxie fb=new feibanaxie();
        for (int i = 0; i < 18; i++) {
            System.out.println(fb.next());
        }

    }
}
