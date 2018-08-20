import scalariform.formatter.preferences._

lazy val commonSettings = Seq(
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.4",
  scalariformPreferences := scalariformPreferences.value
    .setPreference(AlignArguments, true)
    .setPreference(AlignParameters, true)
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(AllowParamGroupsOnNewlines, true)
    .setPreference(DanglingCloseParenthesis, Force)
    .setPreference(DoubleIndentConstructorArguments, true)
    .setPreference(DoubleIndentMethodDeclaration, true)
    .setPreference(IndentLocalDefs, true)
    .setPreference(NewlineAtEndOfFile, true),
  skip in packageJSDependencies := false,
  webpackBundlingMode := BundlingMode.LibraryOnly(),
  useYarn := true,
  emitSourceMaps := false
)

lazy val root = (project in file("."))
  .settings(
    npmDependencies in Compile ++=
      "react"               -> "latest" ::
      "react-dom"           -> "latest" ::
      "@material-ui/core"   -> "latest"  ::
      "@material-ui/icons"  -> "latest"  ::
      Nil,
    libraryDependencies ++=
      "com.github.japgolly.scalacss"      %%% "core"        % "0.5.5"     ::
      "com.github.japgolly.scalacss"      %%% "ext-react"   % "0.5.5"     ::
      "com.github.japgolly.scalajs-react" %%% "core"        % "1.2.3"     ::
      "com.github.japgolly.scalajs-react" %%% "extra"       % "1.2.3"     ::
      "org.scala-js"                      %%% "scalajs-dom" % "0.9.4"     ::
      "org.typelevel"                     %%  "cats-core"   % "1.0.1"     ::
      Nil,
    name := "scalajs-react-material-ui",
    commonSettings,
    organization := "com.pangwarta",
    licenses += ("Apache 2.0",  url("http://www.apache.org/licenses/LICENSE-2.0")),
    mappings.in(Compile, packageBin) += baseDirectory.in(ThisBuild).value / "LICENSE" -> "LICENSE"
  ).enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

lazy val example = (project in file("example"))
  .dependsOn(root)
  .settings(
    commonSettings,
    scalaJSUseMainModuleInitializer := true,
    scalaJSUseMainModuleInitializer in Test := false,
    scalacOptions += "-Ypartial-unification"
  ).enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

