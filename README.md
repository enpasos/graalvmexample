# Getting Started

The goal of this project is to move milestone by milestone from a simple Spring Boot application
to a full-fledged Spring Boot application. The project is based on the Spring Boot project template.

## Three ways to build and run the application

For each milestone, three ways to build and run the application need to work:

* via a bootable jar

```
gradlew clean build
java -jar app/build/libs/app-0.0.2-SNAPSHOT.jar
```

* via a docker container

```
gradlew bootBuildImage
docker run --rm app:0.0.2-SNAPSHOT
```

* via a native image (GraalVM)

```
gradlew nativeCompile
app\build\native\nativeCompile\app.exe
```

## Milestones

### M1 - 2024-02-05

An initial version of the project has been created. It is a simple Spring Boot application.

### M2-SNAPSHOT (2024-02-12)

- dependency management in ```libs.versions.toml```
- subproject for app
- and a subproject platform for commons functions
- application.properties -> application.yml
- BUG: somehow now .exe is created ... trying to figure out why
