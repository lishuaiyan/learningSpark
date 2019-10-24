package com.k.spark.learning

import org.apache.spark.{SparkConf, SparkContext}

object MyFirstSpark {
  def main(args : String): Unit = {
    val conf = new SparkConf()
      .setAppName("appName") //设置应用名称
      .setMaster("local") //设置 提交app的模式
    val sc = new SparkContext(conf); //创建上下文环境
    val data = Array(1, 2, 3, 4, 5)
    val distData = sc.parallelize(data)

    val distFile = sc.textFile("data.txt")

  }

}
