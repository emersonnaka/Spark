package example;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class FirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First example!");
		
		// Create a SparkConf to initialize
		SparkConf conf = new SparkConf().setAppName("FirstExample").setMaster("local[*]");
		// Create a Java version of the Spark Context
		JavaSparkContext sparkContext = new JavaSparkContext(conf);
		String path = "Insert file path";
		
		System.out.println("Opening file " + path);
		
		JavaRDD<String> lines = sparkContext.textFile(path);
		System.out.println("Total of lines: " + lines.count());
		sparkContext.close();
	}

}
