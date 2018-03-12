import java.nio.file.FileSystems

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.alpakka.file.scaladsl.DirectoryChangesSource
import scala.concurrent.duration._


object FileWatcher {

  implicit val system: ActorSystem = ActorSystem()
  implicit val materializer = ActorMaterializer()

  def watchDirectory(dirPath: String , pollInterval:FiniteDuration = 1.second): Unit = {

    val fs = FileSystems.getDefault
    val changes = DirectoryChangesSource(fs.getPath(dirPath), pollInterval , maxBufferSize = 1000)

    changes.runForeach {
      case (path,change) => {
        println(s"${path} ,  ${change}")
      }
    }
  }

}
