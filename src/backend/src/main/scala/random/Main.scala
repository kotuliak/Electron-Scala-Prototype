package random

import java.io.{FileOutputStream, RandomAccessFile}

import scala.io.Source
import scala.util.Random

object Main extends App {
    val Random = new Random()
    val outStreamName = "/tmp/testpipe"
    val outStream = new RandomAccessFile(outStreamName, "rw")
    var rnd = 0
    while (true) {
        rnd = Random.nextInt()
        println(s"Random Number $rnd")
        outStream.writeChars(s"$rnd \n")
        Thread.sleep(5000)
    }

}
