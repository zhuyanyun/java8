package sufa.erchashu_15;

/**
 * Created by zyy on 18/12/9.
 */
public class Bsearch {
    public int search(int[] a, int n, int value){
        int low = 0;
        int high = n - 1;

        while (low <= high){
            int mid = low + ((high-low) >> 1);
            if(a[mid] == value ){
                return mid;
            }else if(a[mid] < value){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(5/2);
    }
}
