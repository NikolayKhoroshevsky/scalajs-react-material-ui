package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.Children.Varargs
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CardActions {

  @JSImport("@material-ui/core", "CardActions")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableActionSpacing: js.UndefOr[Boolean] = js.native
  }

  private def props(
      classes:              js.Dictionary[String],
      className:            js.UndefOr[String],
      disableActionSpacing: js.UndefOr[Boolean],
      otherProps:           (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    disableActionSpacing.foreach(p.updateDynamic("disableActionSpacing")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object action extends ClassKey("action")

  private val component = JsComponent[Props, Varargs, Null](RawComponent)

  def apply(
      classes:              Map[ClassKey, String] = Map.empty,
      className:            js.UndefOr[String]    = js.undefined,
      disableActionSpacing: js.UndefOr[Boolean]   = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      disableActionSpacing,
      otherProps: _*
    )
    component(p)(children: _*)
  }
}
