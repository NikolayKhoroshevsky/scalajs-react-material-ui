package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VisibilityOffIcon {

  @JSImport("material-ui-icons", "VisibilityOff")
  @js.native
  private object RawComponent extends js.Object
  private val VisibilityOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VisibilityOff()
}
