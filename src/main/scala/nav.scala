package nav

import scalatags.JsDom.all._

object nav {
  val default =
    div(cls := "nav",
      h1(cls := "title", "Intro to Scala JS")
    )
}
