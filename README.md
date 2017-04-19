# opencypher-cucumber-tests

[![Build Status](https://travis-ci.com/bme-db-lab/opencypher-tck-tests.svg?token=dduaCwDzExdmU27AvBiK&branch=master)](https://travis-ci.com/bme-db-lab/opencypher-tck-tests)

[Latest test outputs](https://bme-db-lab.github.io/opencypher-tck-tests/feature-overview.html)

## Contributor's guide

First, build the repository from command line to generate the source files for the Xtext grammar. To do this, navigate the the folder of the repository and issue the following command:

```
./gradlew build -x test
```

### IntelliJ IDEA

Install the following dependencies:

* [Scala plug-in](https://plugins.jetbrains.com/idea/plugin/1347-scala).
* [Xtend plug-in](https://plugins.jetbrains.com/idea/plugin/8073-xtend-support). If the built-in installer does not work, download the `org.eclipse.xtend.idea-2.10.0.zip` and install it manually using the [install plugin from disk](https://www.jetbrains.com/help/idea/2016.3/installing-plugin-from-disk.html) feature.

Import the repository as a Gradle project. If you previously imported the project, go to the Gradle view and update the project.

### Eclipse

It is recommended to start with the [Eclipse Scala IDE](http://scala-ide.org/).

Install the following dependencies:

1. Go to **Help** | **Install New Software...** and install the following plug-ins from the update site of your Eclipse release (e.g. the Neon update site):

    * **Xtend IDE**
    * **Xtext Complete SDK**

1. Go to **Help** | **Eclipse Marketplace...** and install the **Buildship: Eclipse Plug-ins for Gradle** plug-in.

Import the repository as a Gradle project. You might need to update the Gradle project: **right click** on the parent project and pick **Gradle** | **Refresh Gradle Project**.
