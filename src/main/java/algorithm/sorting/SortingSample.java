package algorithm.sorting;

import java.util.Random;

/**
 * Created by owen on 15/11/11.
 */
public class SortingSample {

    private int[] a = {};

    public static void main( String[] args )
    {

    }


    /**生成随机数组
     *
     * @param i
     * @param n
     * @return
     */
    private int[] Random(int[] i , int n){
        Random random = new Random();
        i = new int[n];
        for (int j = 0; j < n ; j++){
            i[j] = random.nextInt();
        }
        return i;
    }



    private int[] Insertion(){
        return null;
    }

}
