package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React._
import internal.Transition
import japgolly.scalajs.react.Children.Varargs
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object StepContent {

  @JSImport("material-ui", "StepContent")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var active: js.UndefOr[Boolean] = js.native
    var alternativeLabel: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var completed: js.UndefOr[Boolean] = js.native
    var last: js.UndefOr[Boolean] = js.native
    var optional: js.UndefOr[Boolean] = js.native
    var orientation: js.UndefOr[String] = js.native
    var transition: js.UndefOr[String | Element] = js.native
    var transitionDuration: js.UndefOr[Transition.Duration]
  }

  private def props(
      active:           js.UndefOr[Boolean],
      alternativeLabel: js.UndefOr[Boolean],
      classes:          js.Dictionary[String],
      className:        js.UndefOr[String],
      completed:        js.UndefOr[Boolean],
      last:             js.UndefOr[Boolean],
      optional:         js.UndefOr[Boolean],
      orientation:      js.UndefOr[String],
      transition:       js.UndefOr[String | Element],
      otherProps:       (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    active.foreach(p.updateDynamic("active")(_))
    alternativeLabel.foreach(p.updateDynamic("alternativeLabel")(_))
    className.foreach(p.updateDynamic("className")(_))
    completed.foreach(p.updateDynamic("completed")(_))
    last.foreach(p.updateDynamic("last")(_))
    optional.foreach(p.updateDynamic("optional")(_))
    orientation.foreach(p.updateDynamic("orientation")(_))
    transition.foreach(p.updateDynamic("transition")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object last extends ClassKey("last")
    object transition extends ClassKey("transition")
  }

  private val component = JsComponent[Props, Varargs, Null](RawComponent)

  def apply(
      active:           js.UndefOr[Boolean]          = js.undefined,
      alternativeLabel: js.UndefOr[Boolean]          = js.undefined,
      classes:          Map[ClassKey, String]        = Map.empty,
      className:        js.UndefOr[String]           = js.undefined,
      completed:        js.UndefOr[Boolean]          = js.undefined,
      last:             js.UndefOr[Boolean]          = js.undefined,
      optional:         js.UndefOr[Boolean]          = js.undefined,
      orientation:      js.UndefOr[Step.Orientation] = js.undefined,
      transition:       js.UndefOr[String | Element] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      active,
      alternativeLabel,
      classes,
      className,
      completed,
      last,
      optional,
      orientation,
      transition,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
