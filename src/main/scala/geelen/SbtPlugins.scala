package geelen

import sbt._
import java.io.File

trait SbtPlugins extends Project {
  lazy val intellij = task {
    new File(".idea").createNewFile
    None
  }
}