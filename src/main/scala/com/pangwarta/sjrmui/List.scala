package com.pangwarta.sjrmui

import japgolly.scalajs.react.Children.Varargs
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object List {

  @JSImport("@material-ui/core", "List")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | Element] = js.native
    var dense: js.UndefOr[Boolean] = js.native
    var disablePadding: js.UndefOr[Boolean] = js.native
    var subheader: js.UndefOr[Element] = js.native
  }

  private def props(
      classes:        js.Dictionary[String],
      className:      js.UndefOr[String],
      component:      js.UndefOr[String | Element],
      dense:          js.UndefOr[Boolean],
      disablePadding: js.UndefOr[Boolean],
      subheader:      js.UndefOr[Element],
      otherProps:     (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    dense.foreach(p.updateDynamic("dense")(_))
    disablePadding.foreach(p.updateDynamic("disablePadding")(_))
    subheader.foreach(p.updateDynamic("subheader")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object padding extends ClassKey("padding")
  object dense extends ClassKey("dense")
  object subheader extends ClassKey("subheader")

  private val component = JsComponent[Props, Varargs, Null](RawComponent)

  def apply(
      classes:        Map[ClassKey, String]        = Map.empty,
      className:      js.UndefOr[String]           = js.undefined,
      component:      js.UndefOr[String | Element] = js.undefined,
      dense:          js.UndefOr[Boolean]          = js.undefined,
      disablePadding: js.UndefOr[Boolean]          = js.undefined,
      subheader:      js.UndefOr[Element]          = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      dense,
      disablePadding,
      subheader,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
