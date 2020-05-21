package com.keeplearng.datastructure.algorithm;

import java.util.HashMap;

/**
 * @Author liangyu
 * @create 2020/4/22 5:03 下午
 * @Description
 */
public class BoxWalking {

    static HashMap<String, Integer> tempMap = new HashMap<String, Integer>();

    /**
     * rec: 一个M * N的方格，从左下角走到右上角有多少种走法？
     * 对于m*n的格子，就是从m+n步中选出m步向下或n步向右，因此为C(m+n,m)=C(m+n,n)种
     * */

    public static int getTraversal1(int x, int y) {

        if(x==0 || y==0){
            return 1;
        }

        return getTraversal1(x - 1, y) + getTraversal1(x, y-1);
    }

    public static int getTraversal2(int x, int y) {
        int num = 0;
        if(x==0 || y==0){
            return 1;
        }
        if (x > 0) {
            num += getTraversal2(x - 1, y);
        }
        if (y > 0) {
            num += getTraversal2(x, y - 1);
        }
        return num;
    }

    public static int getTraversal3(int x, int y) {


        int num = 0;
        if (x == 0 || y == 0) {
            return 1;
        }
        if (x > 0) {
            String tempStr = String.valueOf(x - 1).concat("-").concat(String.valueOf(y));
            if (null != tempMap.get(tempStr .concat(String.valueOf(y)))) {
                System.out.println("读取map，当前值为：" + tempStr);
                num += tempMap.get(tempStr);
            } else {
                num += getTraversal3(x - 1, y);
                tempMap.put(tempStr, getTraversal3(x - 1, y));
            }
        }
        if (y > 0) {
            String tempStr = String.valueOf(x).concat("-").concat(String.valueOf(y-1));
            if (null != tempMap.get(tempStr)) {
                System.out.println("读取map，当前值为：" + tempStr);
                num += tempMap.get(tempStr);
            } else {
                num += getTraversal3(x, y - 1);
                tempMap.put((tempStr), getTraversal3(x, y - 1));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int num1 = getTraversal1(2, 1);
        System.out.println(num1);

        int num2 = getTraversal2(2, 1);
        System.out.println(num2);

        int num3 = getTraversal3(4, 5);
        System.out.println(num3);
    }
}
