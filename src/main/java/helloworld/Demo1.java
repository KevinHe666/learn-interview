package helloworld;

/**
 * @ClassName Demo1
 * @Description TODO
 * @Author Kevin
 * @Date 2020/7/20 9:23 上午
 * @Version
 */
public class Demo1 {
    public static void main(String[] args) {
        //最有效的方法计算乘法 2乘以8 将一个数左移N位 相当于乘以2的N次方 位运算是CPU直接支持
        System.out.println("2✖️8= " + (2 << 3));
        //异或的运算  将a b 两个int类型进行变量交换
        swap(31, 40);
    }

    /**
     * 方式二 异或运算 用来交换
     * 一个数与另一个数异或两次是其本身,一个数和自身异或结果是0
     *
     * @param a
     * @param b
     */
    public static void swap2(int a, int b) {

    }

    /**
     * 方式一
     *
     * @param a
     * @param b
     */
    public static void swap(int a, int b) {
        System.out.printf("a=%d, b=%d", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("\na=%d, b=%d", a, b);
    }
}
