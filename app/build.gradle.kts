//plugins {
//	java
//	id("org.springframework.boot") version "3.2.2"
//	id("io.spring.dependency-management") version "1.1.4"
//	id("org.graalvm.buildtools.native") version "0.9.28"
//}


plugins {
    id("com.enpasos.muzero.java-conventions")
    alias(libs.plugins.springboot)
    alias(libs.plugins.spring.dependencyManagement)

    alias(libs.plugins.graalvm)
    id("idea")
}

//group = "com.example"
//version = "0.0.1-SNAPSHOT"
//
//java {
//	sourceCompatibility = JavaVersion.VERSION_21
//}

//repositories {
//    mavenCentral()
//}

dependencies {
    implementation(project(":platform"))
    implementation(libs.springboot.starter)
    testImplementation(libs.springboot.starter.test)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
