logLevel := Level.Warn

lazy val root = (project in file(".")).dependsOn(assemblyPlugin)

lazy val assemblyPlugin = RootProject(uri("git://github.com/rlmark/sbtMusic.git"))