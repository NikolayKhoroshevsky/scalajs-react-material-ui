package com.pangwarta.sjrmui

import japgolly.scalajs.react.Children.Varargs
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Tabs {

  @JSImport("material-ui", "Tabs")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class IndicatorColor(get: String) extends StringType
  object IndicatorColor {
    object secondary extends IndicatorColor("secondary")
    object primary extends IndicatorColor("primary")
  }

  sealed abstract case class ScrollButtons(get: String) extends StringType
  object ScrollButtons {
    object auto extends ScrollButtons("auto")
    object on extends ScrollButtons("on")
    object off extends ScrollButtons("off")
  }

  sealed abstract case class TextColor(get: String) extends StringType
  object TextColor {
    object secondary extends TextColor("secondary")
    object primary extends TextColor("primary")
    object inherit extends TextColor("inherit")
  }

  @js.native
  private[sjrmui] trait Props[A] extends js.Object {
    var action: OnJSEv1[ReactEvent] = js.native
    var buttonClassName: js.UndefOr[String] = js.native
    var centered: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var indicatorClassName: js.UndefOr[String] = js.native
    var onChange: OnJSEv1[ReactEvent] = js.native
    var scrollable: js.UndefOr[Boolean] = js.native
    var theme: js.UndefOr[js.Object] = js.native
    var value: js.UndefOr[A] = js.native
  }

  private def props[A](
      action:             OnJSEv1[ReactEvent],
      buttonClassName:    js.UndefOr[String],
      centered:           js.UndefOr[Boolean],
      classes:            js.Dictionary[String],
      className:          js.UndefOr[String],
      fullWidth:          js.UndefOr[Boolean],
      indicatorClassName: js.UndefOr[String],
      onChange:           OnJSEv1[ReactEvent],
      scrollable:         js.UndefOr[Boolean],
      theme:              js.UndefOr[js.Object],
      value:              js.UndefOr[A],
      otherProps:         (String, js.Any)*
  ): Props[A] = {
    val p = js.Dynamic.literal(classes = classes)
    action.foreach(v => p.updateDynamic("action")(v))
    buttonClassName.foreach(v => p.updateDynamic("buttonClassName")(v))
    centered.foreach(v => p.updateDynamic("centered")(v))
    className.foreach(v => p.updateDynamic("className")(v))
    fullWidth.foreach(v => p.updateDynamic("fullWidth")(v))
    indicatorClassName.foreach(v => p.updateDynamic("indicatorClassName")(v))
    onChange.foreach(v => p.updateDynamic("onChange")(v))
    scrollable.foreach(v => p.updateDynamic("scrollable")(v))
    theme.foreach(v => p.updateDynamic("theme")(v))
    value.foreach(v => p.updateDynamic("value")(v.asInstanceOf[js.Any]))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props[A]]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object flexContainer extends ClassKey("flexContainer")
  object scrollingContainer extends ClassKey("scrollingContainer")
  object fixed extends ClassKey("fixed")
  object scrollable extends ClassKey("scrollable")
  object centered extends ClassKey("centered")
  object buttonAuto extends ClassKey("buttonAuto")

  private def component[A] = JsComponent[Props[A], Varargs, Null](RawComponent)

  def apply[A](
      classes:            Map[ClassKey, String] = Map.empty,
      className:          js.UndefOr[String]    = js.undefined,
      action:             OnJSEv1[ReactEvent]   = js.undefined,
      buttonClassName:    js.UndefOr[String]    = js.undefined,
      centered:           js.UndefOr[Boolean]   = js.undefined,
      fullWidth:          js.UndefOr[Boolean]   = js.undefined,
      indicatorClassName: js.UndefOr[String]    = js.undefined,
      onChange:           OnJSEv1[ReactEvent]   = js.undefined,
      scrollable:         js.UndefOr[Boolean]   = js.undefined,
      theme:              js.UndefOr[js.Object] = js.undefined,
      value:              js.UndefOr[A]         = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      action,
      buttonClassName,
      centered,
      classes,
      className,
      fullWidth,
      indicatorClassName,
      onChange,
      scrollable,
      theme,
      value,
      otherProps: _*
    )
    component[A](p)(children: _*)
  }
}
