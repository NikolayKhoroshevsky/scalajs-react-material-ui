package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object AppBar {

  @JSImport("material-ui", "AppBar")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class Color(get: String) extends StringType
  object inherit extends Color("inherit")
  object primary extends Color("primary")
  object accent extends Color("accent")
  object default extends Color("default")

  sealed abstract case class Position(get: String) extends StringType
  object static extends Position("static")
  object fixed extends Position("fixed")
  object absolute extends Position("absolute")

  @js.native
  private[sjrmui] trait Props extends Paper.Props {
    var color: String = js.native
    var position: String = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      component:  String | ReactElement,
      elevation:  Int,
      square:     Boolean,
      color:      String,
      position:   String,
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes   = classes,
      className = className,
      component = component,
      elevation = elevation,
      square    = square,
      color     = color,
      position  = position
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object positionFixed extends ClassKey("positionFixed")
  object positionAbsolute extends ClassKey("positionAbsolute")
  object positionStatic extends ClassKey("positionStatic")
  object colorDefault extends ClassKey("colorDefault")
  object colorPrimary extends ClassKey("colorPrimary")
  object colorAccent extends ClassKey("colorAccent")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String] = Map.empty,
      className: js.UndefOr[String]    = js.undefined,
      component: String | ReactElement = "div",
      elevation: Int                   = 2,
      square:    Boolean               = false,
      color:     Color                 = primary,
      position:  Position              = fixed
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      elevation,
      square,
      color,
      position,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
