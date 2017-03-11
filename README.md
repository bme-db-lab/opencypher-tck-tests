# opencypher-cucumber-tests

## Contributor's guide

### IntelliJ IDEA

* Install the [Scala plug-in](https://plugins.jetbrains.com/idea/plugin/1347-scala).
* Install the [Xtend plug-in](https://plugins.jetbrains.com/idea/plugin/8073-xtend-support). If the built-in installer does not work, download the `org.eclipse.xtend.idea-2.10.0.zip` and install it manually using the [install plugin from disk](https://www.jetbrains.com/help/idea/2016.3/installing-plugin-from-disk.html) feature.

* Navigate the the folder of the repository and issue the following command:

  ```
  ./gradlew build -x test
  ```

* Import the projects as a Gradle project. If you previously imported the project, go to the Gradle view and update the project.

### Eclipse

Download the [Eclipse Scala IDE](http://scala-ide.org/).

1. Install the following plug-ins from the update site of your Eclipse release (e.g. the Neon update site):

* **Xtend IDE**
* **Xtext Complete SDK**

1. Go to the **Help** | **Eclipse Marketplace...** and install the **Buildship: Eclipse Plug-ins for Gradle** plug-in.
