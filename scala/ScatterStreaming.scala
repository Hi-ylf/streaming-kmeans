/**
  * Created by jinjuting on 2017/7/12-15:38.
  */
import org.viz.lightning._
import scala.util.Random

object lgnTest {
  def scatterStreaming(lgn: Lightning): Unit ={
    var x = Array.fill(100)(Random.nextDouble() * 15)
    var y = Array.fill(100)(Random.nextDouble() * 15)
    val viz = lgn.scatterStreaming(x, y)
    Range(0,1000).foreach { _ =>
      x = Array.fill(100)(Random.nextDouble() * 15)
      y = Array.fill(100)(Random.nextDouble() * 15)
      lgn.scatterStreaming(x=x, y=y, viz=viz)
    }
  }
  def main(args: Array[String]): Unit = {
    val lgn = Lightning(host="http://localhost:3000")
    lgn.createSession()
    scatterStreaming(lgn)
  }
}
