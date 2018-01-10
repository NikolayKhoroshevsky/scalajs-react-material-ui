package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MailOutlineIcon {

  @JSImport("material-ui-icons", "MailOutline")
  @js.native
  private object RawComponent extends js.Object
  private val MailOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MailOutline()
}
