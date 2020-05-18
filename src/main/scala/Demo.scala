import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.streaming.kafka010.KafkaUtils

object Demo {

  def main(args: Array[String]): Unit = {

    //sparkStreaming
    //    KafkaUtils.createDirectStream();
    //
    //    //sparkCore
    //    KafkaUtils.createRDD()

    val conf = new SparkConf()
    val ssc = new StreamingContext(conf, Seconds(5))


//    ssc.checkpoint()

    ssc.start()
    ssc.awaitTermination()

  }
}
