sbtPlugin := true

version := "1.7.4"

name := "lifty"

organization := "org.lifty"

scalaVersion := "2.9.1"

publishTo := Some("Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/")

credentials += Credentials(Path.userHome / "dev" / ".nexus_credentials")

pomPostProcess := {
    import xml._
    Rewrite.rewriter {
        case e: Elem if e.label == "classifier" => NodeSeq.Empty
    }
}