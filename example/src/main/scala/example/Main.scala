package example

import com.github.zachalbia.sjrmui.Typography.Type
import com.github.zachalbia.sjrmui.{ AppBar, Avatar, Badge, Grid, Typography }
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom.document
import CssSettings._

object Main {
  val avatarCls = "ExampleStyles-avatar"
  val badgeCls = "ExampleStyles-badge"
  val marginCls = "ExampleStyles-margin"

  def main(args: Array[String]): Unit = {
    val elem =
      <.div(
        AppBar(
          color    = AppBar.primary,
          position = AppBar.fixed,
          square   = true)(
          Typography(
            color     = Typography.Color.secondary,
            `type`    = Type.headline,
            component = "p")("Foo")),
        <.div(
          ^.cls := marginCls,
          Grid(container = true)(
            Grid(item = true, lg = Some(6))(
              Avatar(
                classes = Map(Avatar.root -> avatarCls),
                src     = Some("https://i.redd.it/pjnmzubsrt201.jpg"))(),
              Badge(
                badgeContent = Some(<.strong("meow").rawElement),
                color        = Badge.Color.primary,
                classes      = Map(Badge.root -> avatarCls, Badge.badge -> badgeCls))(
                  <.img(^.src := "https://i.redd.it/pjnmzubsrt201.jpg", ^.cls := avatarCls)),
              Typography(`type` = Type.body1)(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque mollis quis urna ac lacinia. Curabitur euismod erat eu ligula porttitor vestibulum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut sed est sit amet ligula placerat faucibus ac id felis. Aliquam ut condimentum nunc. Nam nec accumsan felis, a dapibus mi. Vestibulum urna felis, commodo nec nunc fermentum, convallis fermentum ex. Quisque lobortis orci id dui posuere vehicula. Vivamus semper ipsum in dictum consectetur.\n\nPellentesque faucibus enim interdum justo volutpat lobortis. Curabitur consectetur massa eget vehicula consectetur. Quisque volutpat leo lorem, nec sodales nibh suscipit non. Ut vitae arcu laoreet ipsum aliquam finibus et nec erat. Pellentesque tincidunt quis leo ultrices feugiat. Vivamus sit amet posuere massa. Etiam sollicitudin rutrum neque sit amet placerat. Morbi sit amet lobortis ante. Sed augue ipsum, malesuada a risus eget, eleifend venenatis quam. Proin eros nulla, consequat ac pellentesque nec, dapibus vitae nisl.\n\nNam sodales, nunc at aliquam sodales, nunc neque volutpat lacus, vitae porta lorem ante sit amet erat. Ut in mi eget mi lobortis rutrum ut nec diam. Nullam porttitor bibendum euismod. Fusce lorem metus, porttitor in aliquam eu, aliquet a odio. In vel lectus purus. Aliquam ultricies libero ac nunc consectetur sollicitudin. Nunc consequat efficitur iaculis. Nullam eget dignissim enim. Phasellus elit risus, feugiat at sapien non, placerat ultrices leo. Maecenas sem nunc, gravida et aliquam sed, hendrerit ut lorem. Aliquam erat volutpat. Nullam cursus odio eu ante iaculis blandit.\n\nNullam eu erat felis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Pellentesque convallis, sem vitae efficitur laoreet, nisi nunc pharetra quam, ac consectetur est leo at mi. In eget dolor placerat, cursus quam in, egestas lacus. Proin in velit porta quam fringilla molestie. Etiam dictum lacus ac urna luctus accumsan. Pellentesque interdum sem lacus, in pharetra quam fermentum ut. Nam dictum malesuada mi, eget bibendum leo vehicula vitae.\n\nSed sit amet metus ipsum. Proin dictum rhoncus lectus, ut ullamcorper odio dapibus in. Nam tempus in mi id suscipit. Nullam venenatis elit et nulla sodales ornare. In hac habitasse platea dictumst. Quisque vel urna eu ante tristique semper. Mauris mollis massa enim. Proin non suscipit massa. Etiam ipsum eros, hendrerit vitae orci vel, pellentesque condimentum arcu. Nullam ac dolor sed leo finibus bibendum.\n\nFusce sed enim sagittis neque eleifend consectetur. In viverra risus at enim hendrerit, sit amet lobortis ex convallis. Sed pellentesque porttitor aliquet. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nullam urna purus, pharetra sed semper in, dapibus ac ante. Proin at erat efficitur, suscipit libero a, pulvinar augue. Sed imperdiet fermentum ex tincidunt lobortis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent velit tortor, ornare nec tellus sit amet, dapibus consectetur neque. Phasellus erat lacus, suscipit a nisi sit amet, porta facilisis orci. Donec varius placerat augue, sed elementum diam condimentum eget. Pellentesque congue nec nibh ut consectetur. Ut scelerisque lectus vitae blandit posuere. Donec sed eros venenatis, vestibulum augue id, sagittis dolor. Etiam turpis sapien, porttitor a mauris vel, consectetur pretium libero.\n\nUt vitae varius quam. Fusce feugiat, lectus placerat ullamcorper viverra, ex sapien consectetur augue, luctus hendrerit erat dolor non libero. Nunc id mauris nec augue scelerisque aliquet. Nulla ac dolor sit amet justo mollis auctor. Maecenas porttitor, augue eget facilisis tincidunt, lacus ligula laoreet leo, condimentum ultrices diam diam vel ex. Duis blandit risus a turpis commodo, vel vestibulum ante ultrices. Phasellus interdum condimentum velit eget imperdiet. Proin pretium tellus quis vestibulum laoreet. In volutpat vel arcu ac congue. Nam rutrum ultricies sapien sit amet placerat. Pellentesque id risus nisi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Cras placerat augue ante, ut maximus est hendrerit at. Praesent lobortis quam at erat lobortis consequat.\n\nUt dignissim efficitur accumsan. Sed rhoncus et justo et elementum. Donec lobortis laoreet pellentesque. Integer consectetur orci eu consectetur posuere. Nulla non metus elementum erat porta elementum vel id neque. Maecenas ut ipsum efficitur tellus rhoncus maximus. Sed maximus accumsan arcu, sed dapibus turpis porttitor ut. Quisque lacus nisl, tempor sit amet felis id, commodo imperdiet ex.\n\nVestibulum dictum urna at libero pretium scelerisque. Aenean bibendum interdum ligula ac convallis. Integer nibh sem, elementum at placerat vel, consectetur eget lorem. In fermentum turpis nec justo egestas eleifend et sit amet ex. Vestibulum molestie nisi quis lorem sollicitudin, id posuere sapien dignissim. Donec augue purus, placerat ut arcu eget, sodales laoreet lorem. Curabitur suscipit gravida ligula id volutpat. Duis a porta ligula. Nam tincidunt lacus malesuada urna vestibulum efficitur. Donec blandit ullamcorper posuere. Nunc posuere nisi nec nibh lobortis pretium. Suspendisse auctor pulvinar pulvinar. Quisque iaculis aliquam metus quis volutpat.\n\nProin lobortis leo vulputate tellus sollicitudin, id ullamcorper lorem euismod. Vestibulum viverra tincidunt elit vel laoreet. Ut porttitor et nisl sed tincidunt. Sed mattis sem magna, vitae egestas turpis maximus a. Nam tempus massa vel velit pulvinar, a pulvinar ipsum sodales. Suspendisse sit amet finibus sapien. Integer a bibendum felis. Nulla a hendrerit mauris. Phasellus consequat purus ut nisi euismod, vulputate commodo nibh aliquam. In suscipit tristique eros ac laoreet. Nunc vitae porttitor nulla. Donec eget felis interdum, viverra orci sit amet, ornare risus. Duis dictum gravida mauris ut scelerisque.")))))
    elem.renderIntoDOM(document.getElementById("root"))
    ExampleStyles.addToDocument()
  }
}
