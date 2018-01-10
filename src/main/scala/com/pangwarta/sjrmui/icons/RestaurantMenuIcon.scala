package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RestaurantMenuIcon {

  @JSImport("material-ui-icons", "RestaurantMenu")
  @js.native
  private object RawComponent extends js.Object
  private val RestaurantMenu = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RestaurantMenu()
}

