package sufa.quickSorts_12;/**
 * Created by mac on 2018/12/8.
 */

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/12/8 下午3:34
 * @Vertion 1.0
 **/
public class MyQuick {

    // 快速排序，a是数组，n表示数组的大小
    public static void quickSort(int[] a, int n){
        quickSortInternally(a, 0, n-1);
    }

    // 快速排序递归函数，p,r为下标
    public static void quickSortInternally(int[] a, int p, int r){
        if(p >= r) return;


        int q = partition(a,p,r);
        quickSortInternally(a, p,q-1);
        quickSortInternally(a,q+1, r);
    }

    public static int partition(int[] a, int p, int r){
        int pivot = a[r];
        int i = p;
        for(int j = p; j<r; j++){
            if(a[j] < pivot){
                int temp = a[i];
                a[j] = a[i];
                a[i] =temp;
            }
        }

        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;

        System.out.println("******" + i);
        return i;
    }

}
