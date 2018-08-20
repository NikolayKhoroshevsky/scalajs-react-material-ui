package com.pangwarta.sjrmui

import japgolly.scalajs.react.Children.None
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object StepIcon {

  @JSImport("material-ui", "StepIcon")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var active: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var completed: js.UndefOr[Boolean] = js.native
    var icon: Node = js.native
  }

  private def props(
      active:     js.UndefOr[Boolean],
      classes:    js.Dictionary[String],
      completed:  js.UndefOr[Boolean],
      icon:       Node,
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes, icon = icon)
    active.foreach(p.updateDynamic("active")(_))
    completed.foreach(p.updateDynamic("completed")(_))
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object completed extends ClassKey("completed")
  }

  private val component = JsComponent[Props, None, Null](RawComponent)

  private def apply(
      active:    js.UndefOr[Boolean]   = js.undefined,
      classes:   Map[ClassKey, String] = Map.empty,
      completed: js.UndefOr[Boolean]   = js.undefined,
      icon:      Node
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      active,
      classes,
      completed,
      icon,
      otherProps: _*
    )
    this.component(p)
  }
}
