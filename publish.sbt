import de.heikoseeberger.sbtheader.license.Apache2_0

enablePlugins(AutomateHeaderPlugin)

// License information
headers := Map(
  "scala" -> Apache2_0("2017", "Aleksandr Ivanov"),
  "conf" -> Apache2_0("2017", "Aleksandr Ivanov", "#")
)

// Release configuration
releaseIgnoreUntrackedFiles := true
releaseVersionBump          := sbtrelease.Version.Bump.Next
releaseCrossBuild           := true

// Publish configurations
publishArtifact in Test := false
publishMavenStyle := true

licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))

/** BINTRAY */
bintrayRepository := "snapshots"