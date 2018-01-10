package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BatteryStdIcon {

  @JSImport("material-ui-icons", "BatteryStd")
  @js.native
  private object RawComponent extends js.Object
  private val BatteryStd = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BatteryStd()
}
