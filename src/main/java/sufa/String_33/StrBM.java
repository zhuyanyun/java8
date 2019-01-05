package sufa.String_33;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018-12-27 21:53
 * @Vertion 1.0
 **/
public class StrBM {

    private static final int SIZE = 256; // 全局变量或成员变量

//    //b模式串， m 模式串长度    bc 散列表
//    //数组的下标对应字符的 ASCII 码值，数组中存储这个字符在模式串中出现的位置
    private void generateBC(char[] b, int m, int[] bc) {
        for (int i = 0; i < SIZE; ++i) {
            bc[i] = -1; // 初始化 bc
        }
        for (int i = 0; i < m; ++i) {
            int ascii = (int) b[i]; // 计算 b[i] 的 ASCII 值
            bc[ascii] = i;
        }
    }
//
//    //a主串    b模式串， m 模式串长度    bc 散列表
//    public int bm(char[] a, int n, char[] b, int m) {
//        int[] bc = new int[SIZE]; // 记录模式串中每个字符最后出现的位置
//        generateBC(b, m, bc); // 构建坏字符哈希表
//        int i = 0; // i 表示主串与模式串对齐的第一个字符
//        while (i <= n - m) {
//            int j;
//            for (j = m - 1; j >= 0; --j) { // 模式串从后往前匹配
//                if (a[i+j] != b[j]) break; // 坏字符对应模式串中的下标是 j
//            }
//            if (j < 0) {
//                return i; // 匹配成功，返回主串与模式串第一个匹配的字符的位置
//            }
//            // 这里等同于将模式串往后滑动 j-bc[(int)a[i+j]] 位
//            i = i + (j - bc[(int)a[i+j]]);
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        String a ="bcabdrt";
//        String b ="abcbd";
//        StrBM strBM = new StrBM();
//        strBM.bm(a.toCharArray(),7,b.toCharArray(),5);
//    }

//    // b 表示模式串，m 表示长度，suffix，prefix 数组事先申请好了
    private void generateGS(char[] b, int m, int[] suffix, Boolean[] prefix) {
        for (int i = 0; i < m; ++i) { // 初始化
            suffix[i] = -1;
            prefix[i] = false;
        }
        for (int i = 0; i < m - 1; ++i) { // b[0, i]
            int j = i;
            int k = 0; // 公共后缀子串长度
            while (j >= 0 && b[j] == b[m - 1 - k]) { // 与 b[0, m-1] 求公共后缀子串
                --j;
                ++k;
                suffix[k] = j + 1; //j+1 表示公共后缀子串在 b[0, i] 中的起始下标
            }
//            i
            if (j == -1) prefix[k] = true; // 如果公共后缀子串也是模式串的前缀子串
        }
    }
//
//    public static void main(String[] args) {
//        StrBM strBM = new StrBM();
//        String s = "cabcab";
//        int[] suffix = new int[6];
//        Boolean[] prefix = new Boolean[6];
//        strBM.generateGS(s.toCharArray(), 6,suffix,prefix);
//    }

    // a,b 表示主串和模式串；n，m 表示主串和模式串的长度。
    public int bm(char[] a, int n, char[] b, int m) {
        int[] bc = new int[SIZE]; // 记录模式串中每个字符最后出现的位置
        generateBC(b, m, bc); // 构建坏字符哈希表
        int[] suffix = new int[m];
        Boolean[] prefix = new Boolean[m];
        generateGS(b, m, suffix, prefix);
        int i = 0; // j 表示主串与模式串匹配的第一个字符
        while (i <= n - m) {
            int j;
            for (j = m - 1; j >= 0; --j) { // 模式串从后往前匹配
                if (a[i+j] != b[j]) break; // 坏字符对应模式串中的下标是 j
            }
            if (j < 0) {
                return i; // 匹配成功，返回主串与模式串第一个匹配的字符的位置
            }
            int x = j - bc[(int)a[i+j]];
            int y = 0;
            if (j < m-1) { // 如果有好后缀的话
                y = moveByGS(j, m, suffix, prefix);
            }
            i = i + Math.max(x, y);
        }
        return -1;
    }

    // j 表示坏字符对应的模式串中的字符下标 ; m 表示模式串长度
    private int moveByGS(int j, int m, int[] suffix, Boolean[] prefix) {
        int k = m - 1 - j; // 好后缀长度
        if (suffix[k] != -1) return j - suffix[k] + 1;
        for (int r = j + 2; r <= m - 1; ++r) {
            if (prefix[m - r] == true) {
                return r;
            }
        }
        return m;
    }
//
//    public static void main(String[] args) {
//        String s = "ssss";
//        s.indexOf("sfsafs");
//    }
}
