package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.Children.None
import japgolly.scalajs.react.raw.React._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CssBaseline {

  @JSImport("@material-ui/core", "CssBaseline")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var children: js.UndefOr[Element] = js.native
  }

  private val component = JsComponent[Props, None, Null](RawComponent)

  def apply(children: Element) = {
    val p = js.Dynamic.literal(children = children).asInstanceOf[Props]
    this.component(p)
  }
}
