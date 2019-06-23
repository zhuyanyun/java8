package jike.concurrent.step_26;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-06-20 11:20
 * @Vertion 1.0
 **/
public class MyForkJoin2 {

    public static void main(String[] args) {
        String[] fc = {"hello world", "hello me", "hello fork", "hello join", "fork join in world"};
        ForkJoinPool forkJoinPool = new ForkJoinPool(3);
        MR mr = new MR(fc, 0, fc.length);
        Map<String, Long> result = forkJoinPool.invoke(mr);
        result.forEach((k,v) -> System.out.println(k+":"+v));
    }


    // MR 模拟类
    static class MR extends RecursiveTask<Map<String, Long>> {
        private String[] fc;

        private int start,end;

        public MR(String[] fc, int start, int end) {
            this.fc = fc;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Map<String, Long> compute() {
            if(end - start == 1){
                return calc(fc[start]);
            }else {
                int mid = (start + end)/2;
                MR mr1 = new MR(fc, start, mid);
                mr1.fork();
                MR mr2 = new MR(fc, mid, end);
                return merge(mr2.compute(),mr1.join());
            }
        }

        //合并结果
        private Map<String,Long> merge(Map<String,Long> r1,Map<String,Long> r2){
            HashMap<String, Long> result = new HashMap<>();
            result.putAll(r1);
            r2.forEach((k,v) -> {
                Long c = result.get(k);
                if(c == null){
                    result.put(k,1L);
                }else {
                    result.put(k,c+v);
                }
            });
            return result;
        }



        //统计单词数量
        private Map<String,Long> calc(String line){
            HashMap<String, Long> result = new HashMap<>();
            String[] words = line.split("\\s");

            for(String w : words){
                Long v = result.get(w);
                if(v == null){
                    result.put(w,1L);
                }else {
                    result.put(w,v+1);
                }
            }
            return result;
        }
    }
}
