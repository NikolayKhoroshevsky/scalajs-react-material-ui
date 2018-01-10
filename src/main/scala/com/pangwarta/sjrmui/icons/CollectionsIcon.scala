package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CollectionsIcon {

  @JSImport("material-ui-icons", "Collections")
  @js.native
  private object RawComponent extends js.Object
  private val Collections = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Collections()
}
