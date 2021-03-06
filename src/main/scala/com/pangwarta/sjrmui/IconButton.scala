package com.pangwarta.sjrmui
import japgolly.scalajs.react.Children.Varargs
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object IconButton {

  @JSImport("@material-ui/core", "IconButton")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends ButtonBase.Props {
    var color: js.UndefOr[String] = js.native
  }

  private def props(
      centerRipple:             js.UndefOr[Boolean],
      classes:                  js.Dictionary[String],
      className:                js.UndefOr[String],
      component:                js.UndefOr[String | Element],
      disableRipple:            js.UndefOr[Boolean],
      disabled:                 js.UndefOr[Boolean],
      focusRipple:              js.UndefOr[Boolean],
      keyboardFocusedClassName: js.UndefOr[String],
      onBlur:                   OnJSEv1[ReactEvent],
      onClick:                  OnJSEv1[ReactMouseEvent],
      onFocus:                  OnJSEv1[ReactFocusEvent],
      onFocusVisible:           OnJSEv1[ReactFocusEvent],
      onKeyDown:                OnJSEv1[ReactKeyboardEvent],
      onKeyUp:                  OnJSEv1[ReactKeyboardEvent],
      onMouseDown:              OnJSEv1[ReactMouseEvent],
      onMouseLeave:             OnJSEv1[ReactMouseEvent],
      onMouseUp:                OnJSEv1[ReactMouseEvent],
      onTouchEnd:               OnJSEv1[ReactTouchEvent],
      onTouchMove:              OnJSEv1[ReactTouchEvent],
      onTouchStart:             OnJSEv1[ReactTouchEvent],
      role:                     js.UndefOr[String],
      tabIndex:                 js.UndefOr[Int | String],
      color:                    js.UndefOr[String],
      otherProps:               (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    centerRipple.foreach(p.updateDynamic("centerRipple")(_))
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    disableRipple.foreach(p.updateDynamic("disableRipple")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    focusRipple.foreach(p.updateDynamic("focusRipple")(_))
    keyboardFocusedClassName.foreach(p.updateDynamic("keyboardFocusedClassName")(_))
    onBlur.foreach(p.updateDynamic("onBlur")(_))
    onClick.foreach(p.updateDynamic("onClick")(_))
    onFocus.foreach(p.updateDynamic("onFocus")(_))
    onFocusVisible.foreach(p.updateDynamic("onFocusVisible")(_))
    onKeyDown.foreach(p.updateDynamic("onKeyDown")(_))
    onKeyUp.foreach(p.updateDynamic("onKeyUp")(_))
    onMouseDown.foreach(p.updateDynamic("onMouseDown")(_))
    onMouseLeave.foreach(p.updateDynamic("onMouseLeave")(_))
    onMouseUp.foreach(p.updateDynamic("onMouseUp")(_))
    onTouchEnd.foreach(p.updateDynamic("onTouchEnd")(_))
    onTouchMove.foreach(p.updateDynamic("onTouchMove")(_))
    onTouchStart.foreach(p.updateDynamic("onTouchStart")(_))
    role.foreach(p.updateDynamic("role")(_))
    tabIndex.foreach(p.updateDynamic("tabIndex")(_))
    color.foreach(p.updateDynamic("color")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class Color(get: String) extends StringType
  object Color {
    object default extends Color("default")
    object inherit extends Color("inherit")
    object primary extends Color("primary")
    object secondary extends Color("secondary")
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object disabled extends ClassKey("disabled")
    object colorPrimary extends ClassKey("colorPrimary")
    object colorSecondary extends ClassKey("colorSecondary")
    object colorInherit extends ClassKey("colorInherit")
    object label extends ClassKey("label")
    object icon extends ClassKey("icon")
  }

  private def component = JsComponent[Props, Varargs, Null](RawComponent)

  def apply(
      centerRipple:             js.UndefOr[Boolean]               = js.undefined,
      classes:                  Map[ClassKey, String]             = Map.empty,
      className:                js.UndefOr[String]                = js.undefined,
      component:                js.UndefOr[String | Element]      = js.undefined,
      disableRipple:            js.UndefOr[Boolean]               = js.undefined,
      disabled:                 js.UndefOr[Boolean]               = js.undefined,
      focusRipple:              js.UndefOr[Boolean]               = js.undefined,
      keyboardFocusedClassName: js.UndefOr[String]                = js.undefined,
      onBlur:                   ReactHandler1[ReactEvent]         = js.undefined,
      onClick:                  ReactHandler1[ReactMouseEvent]    = js.undefined,
      onFocus:                  ReactHandler1[ReactFocusEvent]    = js.undefined,
      onKeyboardFocus:          ReactHandler1[ReactFocusEvent]    = js.undefined,
      onKeyDown:                ReactHandler1[ReactKeyboardEvent] = js.undefined,
      onKeyUp:                  ReactHandler1[ReactKeyboardEvent] = js.undefined,
      onMouseDown:              ReactHandler1[ReactMouseEvent]    = js.undefined,
      onMouseLeave:             ReactHandler1[ReactMouseEvent]    = js.undefined,
      onMouseUp:                ReactHandler1[ReactMouseEvent]    = js.undefined,
      onTouchEnd:               ReactHandler1[ReactTouchEvent]    = js.undefined,
      onTouchMove:              ReactHandler1[ReactTouchEvent]    = js.undefined,
      onTouchStart:             ReactHandler1[ReactTouchEvent]    = js.undefined,
      role:                     js.UndefOr[String]                = js.undefined,
      tabIndex:                 js.UndefOr[Int | String]          = js.undefined,
      color:                    js.UndefOr[Color]                 = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      centerRipple,
      classes,
      className,
      component,
      disableRipple,
      disabled,
      focusRipple,
      keyboardFocusedClassName,
      onBlur,
      onClick,
      onFocus,
      onKeyboardFocus,
      onKeyDown,
      onKeyUp,
      onMouseDown,
      onMouseLeave,
      onMouseUp,
      onTouchEnd,
      onTouchMove,
      onTouchStart,
      role,
      tabIndex,
      color,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
