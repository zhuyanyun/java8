package sufa.binarySearch_15;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018-12-11 20:12
 * @Vertion 1.0
 **/
public class BinarySearch {

    public int bsearch(int[] a, int n, int val){
        return bsearchInternally(a, 0, n-1, val);
    }

    private int bsearchInternally(int[] a, int low,int high, int value){
        if(low > high) return -1;

        int mid = low + ((high - low) >> 1);
        if(a[mid] == value){
            if(a[mid-1] < value){
                return mid;
            }else{
                return bsearchInternally(a, mid, mid-1, value);
            }
        }else if(a[mid] < value){
            return bsearchInternally(a, mid + 1, high, value);
        }else {
            return bsearchInternally(a, low, high - 1, value);
        }
    }



}
