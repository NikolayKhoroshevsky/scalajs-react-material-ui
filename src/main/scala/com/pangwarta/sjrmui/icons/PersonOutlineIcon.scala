package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PersonOutlineIcon {

  @JSImport("material-ui-icons", "PersonOutline")
  @js.native
  private object RawComponent extends js.Object
  private val PersonOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PersonOutline()
}

