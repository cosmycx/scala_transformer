package com.example.transformer


object Main {

    def main(args: Array[String]): Unit = {

        println("transformer...")

        time {

            val t = new Transformer( 5000 )

            println( t.transform )
            
        } // .time 

    } // .main 


    def time[R](block: => R): R = {

        val t0 = System.currentTimeMillis()
        val result = block   
        val t1 = System.currentTimeMillis()
        println("Elapsed time: " + (t1 - t0) + "ms")
        result
        
    } // .time


} // .Main
