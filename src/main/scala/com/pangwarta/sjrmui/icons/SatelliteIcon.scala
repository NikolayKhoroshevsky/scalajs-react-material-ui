package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SatelliteIcon {

  @JSImport("material-ui-icons", "Satellite")
  @js.native
  private object RawComponent extends js.Object
  private val Satellite = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Satellite()
}
