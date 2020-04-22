plugins {
    `java-library`
    id(BuildPlugins.kotlinLibrary)
    id(BuildPlugins.kotlinKapt)
}

dependencies {
    implementation(fileTree(Pair("dir", "libs"), Pair("include", listOf("*.jar"))))
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.ktxCore)

    // Rx
    implementation(Libraries.rxJava2)
    implementation(Libraries.rxAndroid)
    implementation(Libraries.rxKotlin)

    // Fast Android Networking
    implementation(Libraries.fastAndroidNetworking)

    // Room
    implementation(Libraries.room)
    implementation(Libraries.roomKtx)
    implementation(Libraries.roomRxJava2)
    kapt(Libraries.roomCompiler)
}
