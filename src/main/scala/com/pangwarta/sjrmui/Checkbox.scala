package com.pangwarta.sjrmui

import BottomNavigationAction.icon
import icons.MuiSvgIcons._
import japgolly.scalajs.react._
import japgolly.scalajs.react.Children.None
import japgolly.scalajs.react.raw.React._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Checkbox {

  @JSImport("material-ui", "Checkbox")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var checked: js.UndefOr[Boolean | String] = js.native
    var checkedIcon: js.UndefOr[Node] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var defaultChecked: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var disableRipple: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[Element] = js.native
    var indeterminate: js.UndefOr[Boolean] = js.native
    var indeterminateIcon: js.UndefOr[Node | String] = js.native
    var inputProps: js.Dictionary[String] = js.native
    var inputRef: js.UndefOr[RefFn[String]] = js.native
    var inputType: js.UndefOr[String] = js.native
    var name: js.UndefOr[String] = js.native
    var onChange: OnJSEv2[ReactEvent, Boolean] = js.native
    var tabIndex: js.UndefOr[Int | String] = js.native
    var value: js.UndefOr[String] = js.native
  }

  private def props(
      checked:           js.UndefOr[Boolean | String],
      checkedIcon:       js.UndefOr[Node],
      classes:           js.Dictionary[String],
      className:         js.UndefOr[String],
      defaultChecked:    js.UndefOr[Boolean],
      disabled:          js.UndefOr[Boolean],
      disableRipple:     js.UndefOr[Boolean],
      icon:              js.UndefOr[Element],
      indeterminate:     js.UndefOr[Boolean],
      indeterminateIcon: js.UndefOr[Node | String],
      inputProps:        js.Dictionary[String],
      inputRef:          js.UndefOr[js.Function],
      name:              js.UndefOr[String],
      onChange:          OnJSEv2[ReactEvent, Boolean],
      tabIndex:          js.UndefOr[Int | String],
      value:             js.UndefOr[String],
      otherProps:        (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes    = classes,
      inputProps = inputProps
    )
    checked.foreach(p.updateDynamic("checked")(_))
    checkedIcon.foreach(p.updateDynamic("checkedIcon")(_))
    className.foreach(p.updateDynamic("className")(_))
    defaultChecked.foreach(p.updateDynamic("defaultChecked")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    disableRipple.foreach(p.updateDynamic("disableRipple")(_))
    icon.foreach(p.updateDynamic("icon")(_))
    indeterminate.foreach(p.updateDynamic("indeterminate")(_))
    indeterminateIcon.foreach(p.updateDynamic("indeterminateIcon")(_))
    inputRef.foreach(p.updateDynamic("inputRef")(_))
    name.foreach(p.updateDynamic("name")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    tabIndex.foreach(p.updateDynamic("tabIndex")(_))
    value.foreach(p.updateDynamic("value")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object default extends ClassKey("default")
  object checked extends ClassKey("checked")
  object disabled extends ClassKey("disabled")

  private val component = JsComponent[Props, None, Null](RawComponent)

  def apply(
      checked:           js.UndefOr[Boolean | String]       = js.undefined,
      checkedIcon:       js.UndefOr[Element]                = js.undefined,
      classes:           Map[ClassKey, String]              = Map.empty,
      className:         js.UndefOr[String]                 = js.undefined,
      defaultChecked:    js.UndefOr[Boolean]                = js.undefined,
      disabled:          js.UndefOr[Boolean]                = js.undefined,
      disableRipple:     js.UndefOr[Boolean]                = js.undefined,
      icon:              js.UndefOr[Element]                = js.undefined,
      indeterminate:     js.UndefOr[Boolean]                = js.undefined,
      indeterminateIcon: js.UndefOr[Node | String]          = js.undefined,
      inputProps:        Map[String, String]                = Map.empty,
      inputRef:          js.UndefOr[RefFn[String]]          = js.undefined,
      name:              js.UndefOr[String]                 = js.undefined,
      onChange:          ReactHandler2[ReactEvent, Boolean] = js.undefined,
      tabIndex:          js.UndefOr[Int | String]           = js.undefined,
      value:             js.UndefOr[String]                 = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      checked,
      checkedIcon,
      classes,
      className,
      defaultChecked,
      disabled,
      disableRipple,
      icon,
      indeterminate,
      indeterminateIcon,
      inputProps,
      inputRef,
      name,
      onChange,
      tabIndex,
      value,
      otherProps: _*
    )
    component(p)
  }
}
