package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CameraFrontIcon {

  @JSImport("material-ui-icons", "CameraFront")
  @js.native
  private object RawComponent extends js.Object
  private val CameraFront = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CameraFront()
}
