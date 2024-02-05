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


dependencies {
    implementation(project(":platform"))
    implementation(libs.springboot.starter)
    testImplementation(libs.springboot.starter.test)
}


//graalvmNative {
//    binaries {
//        named("main") {
//            mainClass.set("com.example.demo.DemoApplication")
//        }
//        named("test") {
//            buildArgs.addAll("--verbose", "-O0")
//        }
//    }
//}


tasks.withType<Test> {
    useJUnitPlatform()
}
