package main

import org.scalajs.dom.{document, raw, html }
import scalatags.JsDom.all._
import scala.scalajs.js.timers.setInterval
import nav._
import countdown._

object Main {
  def main(args: Array[String]): Unit = {
    val content =
      div(cls:="container",
        nav.default,
        div(id:="timer", 60)
      )

    val root = document.getElementById("root")
    root.appendChild(content.render)
    setInterval(1000) {countdown.timer}
  }
}
