package com.example.transformer

import scala.concurrent.duration._

class Transformer(val t: Long) {

    def transform(): Long = {

        val t0 = System.currentTimeMillis()

        Thread.sleep(t)  

        System.currentTimeMillis() - t0 


    } // .transform

} // .Transformer


