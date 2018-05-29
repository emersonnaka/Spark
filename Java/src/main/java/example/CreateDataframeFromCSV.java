package example;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;;

public class CreateDataframeFromCSV {
	
	public static void main(String[] args) {
		String path = "Insert file path";
		
		SparkConf conf = new SparkConf().setAppName("FirstExample").setMaster("local[*]");
		SparkSession sparkSession = SparkSession
			.builder()
			.appName("Create dataframe from CSV file")
			.config(conf)
			.getOrCreate();
		Dataset<Row> df = sparkSession.read().csv(path);
		
		df.show();
	}

}
