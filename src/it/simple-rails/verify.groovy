import org.jruby.plugins.WarFile

WarFile warFile = new WarFile(new File(basedir, "tmp/simple-rails-1.0-SNAPSHOT.war"))
assert warFile.exists()
assert warFile.contains("WEB-INF/web.xml")
assert warFile.contains("WEB-INF/lib/jruby-complete-1.1.6.jar")

File installedWar = new File(localRepositoryPath, "integration/test/simple-rails/1.0-SNAPSHOT/simple-rails-1.0-SNAPSHOT.war")
assert installedWar.exists()

return true
