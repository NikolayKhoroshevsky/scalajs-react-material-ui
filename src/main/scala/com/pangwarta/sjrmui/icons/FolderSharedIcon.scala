package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FolderSharedIcon {

  @JSImport("material-ui-icons", "FolderShared")
  @js.native
  private object RawComponent extends js.Object
  private val FolderShared = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FolderShared()
}

