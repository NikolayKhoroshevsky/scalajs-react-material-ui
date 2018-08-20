package com.pangwarta.sjrmui

import japgolly.scalajs.react.Children.Varargs
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Toolbar {

  @JSImport("material-ui", "Toolbar")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableGutters: js.UndefOr[Boolean] = js.native
  }

  private def props(
      classes:        js.Dictionary[String],
      className:      js.UndefOr[String],
      disableGutters: js.UndefOr[Boolean],
      otherProps:     (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    disableGutters.foreach(p.updateDynamic("disableGutters")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object gutters extends ClassKey("gutters")
  }

  private val component = JsComponent[Props, Varargs, Null](RawComponent)

  def apply(
      classes:        Map[ClassKey, String] = Map.empty,
      className:      js.UndefOr[String]    = js.undefined,
      disableGutters: js.UndefOr[Boolean]   = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      disableGutters,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
