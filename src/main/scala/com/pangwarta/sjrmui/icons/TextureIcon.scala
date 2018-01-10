package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TextureIcon {

  @JSImport("material-ui-icons", "Texture")
  @js.native
  private object RawComponent extends js.Object
  private val Texture = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Texture()
}

