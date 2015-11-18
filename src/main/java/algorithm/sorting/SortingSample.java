package algorithm.sorting;

import algorithm.L;

import java.util.Random;

/**
 * Created by owen on 15/11/11.
 * 使用内存内部排序
 *      -插入排序
 *          --插入排序      直接插入排序
 *          --希尔排序      插入排序的加强版,先分组后排序,减少交换移动次数
 *      -选择排序
 *          --选择排序
 *          --堆排序
 *      -交换排序
 *          --冒泡排序
 *          --快速排序
 *      -归并排序
 *      -技术排序
 */
public class SortingSample {


    public static void main( String[] args )
    {
        int[] a = L.SortingArray;
        /**
         * 插入排序
         */
//        a = Insertion(a);
//        for(int i = 0; i < 10 ; i++)
//            System.out.println(a[i]);

        /**
         * 希尔排序
         */
//        a = Shell(a);
//        for(int i = 0; i < 10 ; i++)
//            System.out.println(a[i]);

        /**
         * 冒泡排序
         */
//        a = Bubble(a);
//        for(int i = 0; i < 10 ; i++)
//            System.out.println(a[i]);


    }


    /**生成随机数组
     *
     *
     * @param n
     * @return
     */
    private static int[] Random(int n){
        Random random = new Random();
        int[] i = new int[n];
        for (int j = 0; j < n ; j++){
            i[j] = random.nextInt();
        }
        return i;
    }


    /**插入排序
     *
     * @param i
     * @return
     */
    private static int[] Insertion(int[] i){
        int temp ;
        int j;
        for(j = 1 ; j < i.length ; j++) {
            temp = i[j];
            int k;
            for (k = j - 1; k >= 0; k--) {
                if (i[k] > temp)
                    i[k + 1] = i[k];
                else
                    break;
            }
            i[k + 1] = temp;
        }
        return i;
    }

    /**
     * 希尔排序
     *
     * @param i
     * @return
     */
    private static int[] Shell(int[] i){
        int temp ;
        int j;
        for(int increment = i.length/2 ; increment > 0; increment /= 2){
            for(int k = increment; k < i.length ; k++){
                temp = i[k];
                for(j = k ; j >=increment ; j -= increment){
                    if(temp > i[j-increment]){
                        i[j] = i[j-increment];
                    }else{
                        break;
                    }
                }
                i[j] = temp;
            }
        }
        return i;
    }


    private static int[] Choice(int[] i){

        return i;
    }


    /**冒泡排序
     *
     */
    private static int[] Bubble(int[] i){
        int temp ;
        for(int j = 0; j < i.length;j++){
            for(int k = j+1;k<i.length ;k++){
                if(i[j]>i[k]){
                    temp = i[j];
                    i[j] = i[k];
                    i[k] = temp;
                }
            }
            /**
             * 同上
             */
//            for(int k = 0; k<i.length-1;k++){
//                if(i[k]>i[k+1]){
//                    temp = i[k];
//                    i[k] = i[k+1];
//                    i[k+1] = temp;
//                }
//            }
        }
        return i;
    }

}
