plugins {
    id("com.enpasos.muzero.java-conventions")
  //  alias(libs.plugins.springboot)
  //  alias(libs.plugins.spring.dependencyManagement)

   // alias(libs.plugins.graalvm)
    id("idea")
}
//plugins {
//    id("com.enpasos.muzero.java-conventions")
//    id("idea")
//    alias(libs.plugins.protobuf)
//    alias(libs.plugins.springboot)
//    alias(libs.plugins.spring.dependencyManagement)
//}

//apply(plugin = "io.spring.dependency-management")
//apply(plugin = "org.springframework.boot")

//tasks.named<BootJar>("bootJar") {
//        isEnabled = false
//}
//tasks.named<Jar>("jar") {
//    this.archiveClassifier.set("")
//}

    dependencies {

    implementation(libs.springboot.starter)
    testImplementation(libs.springboot.starter.test)

    implementation(libs.bundles.commons)

        implementation(libs.djl.api)

        compileOnly(libs.lombok)
        annotationProcessor(libs.lombok)
        testCompileOnly(libs.lombok)
        testAnnotationProcessor(libs.lombok)


}

//configurations {
//    all {
//        exclude(group = "org.apache.logging.log4j", module = "log4j-to-slf4j")
//        exclude(group = "org.slf4j", module = "slf4j-simple")
//    }
//}

description = "platform"

//protobuf {
//    protoc {
//        artifact = "com.google.protobuf:protoc:3.21.4"
//    }
// }
