package com.kevin.learn.structures.string;

/**
 * @ClassName KMP
 * @Description KMP算法
 * @Author Kevin
 * @Date 2020/12/9 9:49 上午
 * @Version 1.0
 **/
public class KMP {
    public static void main(String[] args) throws Exception {
        int k = KMP("aababababca", "abababca", getNext("abababca"));
        System.out.println(k);
    }

    /**
     * KMP算法
     *
     * @param next        next数组
     * @param modelString 模式串
     * @param mainString  主串
     * @return 匹配的第一个位置
     */
    public static int KMP(String mainString, String modelString, int[] next) {
        int i = 0;
        int j = 0;
        while (i < mainString.length() && j < modelString.length()) {
            if (-1 == j || mainString.charAt(i) == modelString.charAt(j)) {
                i++;
                j++;
            } else {
                //不相等,滑动
                j = next[j];
            }
        }
        if (j == modelString.length()) {
            //如果最后j到达模式串的尾部,则说明匹配上了
            return i - j;
        } else {
            return -1;
        }
    }

    /**
     * @param modelString 模式字符串
     *                    求next数组
     */
    public static int[] getNext(String modelString) {
        int[] next = new int[100];
        next[0] = -1;
        int i = 0;
        int j = -1;
        while (i < modelString.length()) {
            if (j == -1 || modelString.charAt(i) == modelString.charAt(j)) {
                //相等的情况
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }

        return next;
    }
}
