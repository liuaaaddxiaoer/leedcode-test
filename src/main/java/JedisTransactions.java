/**
 * Created by lin on 2018/10/20.
 */
public class JedisTransactions {

    public static void main(String[] args) {
//        Jedis jedis = null;
//        Pipeline pipeline = null;
//        try{
//            jedis = new Jedis("localhost", 6379);
//            //�����ǿ��Ը�pipeliningһ��ʹ�õ�
//            pipeline = jedis.pipelined();
//            //��������value��ֵΪ100
//            pipeline.set("value", "100");
//            //����watch
//            pipeline.watch("value");
//            //��������
//            pipeline.multi();
//            //����value 10
//            pipeline.incrBy("value", 10);
//            //ִ�д���Ĳ���lpush
//            pipeline.lpush("value", "error");
//            //�ٴε���value 10
//            pipeline.incrBy("value", 10);
//            //ִ��exec����,��ȡ"δ��"�ķ��ؽ��
//            Response<List<Object>> listResponse = pipeline.exec();
//            //ִ��pipelining
//            pipeline.sync();
//
//            List<Object> result = listResponse.get();
//            if(result != null && result.size() > 0){
//                for(Object o : result){
//                    System.out.println(o.toString());
//                }
//            }
//
//            //��Ȼ�����еڶ�������ʧ����,����Ӱ��value��ֵ
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

