/**
 * Created by lin on 2018/10/20.
 */
public class JedisTransactions {

    public static void main(String[] args) {
//        Jedis jedis = null;
//        Pipeline pipeline = null;
//        try{
//            jedis = new Jedis("localhost", 6379);
//            //事务是可以跟pipelining一起使用的
//            pipeline = jedis.pipelined();
//            //首先设置value的值为100
//            pipeline.set("value", "100");
//            //设置watch
//            pipeline.watch("value");
//            //开启事务
//            pipeline.multi();
//            //递增value 10
//            pipeline.incrBy("value", 10);
//            //执行错误的操作lpush
//            pipeline.lpush("value", "error");
//            //再次递增value 10
//            pipeline.incrBy("value", 10);
//            //执行exec命令,获取"未来"的返回结果
//            Response<List<Object>> listResponse = pipeline.exec();
//            //执行pipelining
//            pipeline.sync();
//
//            List<Object> result = listResponse.get();
//            if(result != null && result.size() > 0){
//                for(Object o : result){
//                    System.out.println(o.toString());
//                }
//            }
//
//            //虽然事务中第二个操作失败了,但不影响value的值
//            System.out.println("\nvalue is " + jedis.get("value"));
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if(jedis != null){
//                jedis.close();
//            }
//        }
    }

}

