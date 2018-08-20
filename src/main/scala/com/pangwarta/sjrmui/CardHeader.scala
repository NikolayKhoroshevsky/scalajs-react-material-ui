package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.Children.Varargs
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CardHeader {

  @JSImport("material-ui", "CardHeader")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends CardContent.Props {
    var action: js.UndefOr[Element] = js.native
    var avatar: js.UndefOr[Element] = js.native
    var classes: js.Dictionary[String] = js.native
    var subheader: js.UndefOr[Element] = js.native
    var title: js.UndefOr[Element] = js.native
  }

  private def props(
      action:     js.UndefOr[Element],
      avatar:     js.UndefOr[Element],
      classes:    js.Dictionary[String],
      subheader:  js.UndefOr[Element],
      title:      js.UndefOr[Element],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    action.foreach(p.updateDynamic("action")(_))
    avatar.foreach(p.updateDynamic("avatar")(_))
    subheader.foreach(p.updateDynamic("subheader")(_))
    title.foreach(p.updateDynamic("title")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object avatar extends ClassKey("avatar")
  object action extends ClassKey("action")
  object content extends ClassKey("content")
  object title extends ClassKey("title")
  object subheader extends ClassKey("subheader")

  private val component = JsComponent[Props, Varargs, Null](RawComponent)

  def apply(
      action:    js.UndefOr[Element]   = js.undefined,
      avatar:    js.UndefOr[Element]   = js.undefined,
      classes:   Map[ClassKey, String] = Map.empty,
      subheader: js.UndefOr[Element]   = js.undefined,
      title:     js.UndefOr[Element]   = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      action,
      avatar,
      classes,
      subheader,
      title,
      otherProps: _*
    )
    component(p)(children: _*)
  }
}
