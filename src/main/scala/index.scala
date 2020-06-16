package main

import org.scalajs.dom.{document, raw, html }
import scalatags.JsDom.all._
import scala.scalajs.js.timers.setInterval

object Main {
  def main(args: Array[String]): Unit = {
    val content =
      div(cls:="container",
        "Hello"
      )

    val root = document.getElementById("root")
    root.appendChild(content.render)
  }
}
