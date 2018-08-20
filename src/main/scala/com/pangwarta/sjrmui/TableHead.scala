package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React._
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.Children.Varargs
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object TableHead {

  @JSImport("material-ui", "TableHead")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var component: js.UndefOr[String | Element] = js.native
  }

  private def props(
      component:  js.UndefOr[String | Element],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    component.foreach(p.updateDynamic("component")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Varargs, Null](RawComponent)

  def apply(
      component: js.UndefOr[String | Element] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      component,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}

