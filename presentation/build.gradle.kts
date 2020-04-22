import org.gradle.kotlin.dsl.implementation

plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kotlinKapt)
}

android {
    compileSdkVersion(AndroidSdk.compile)

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
        testInstrumentationRunner = AppConfig.testInstrumentationRunner
    }

    buildTypes {
        getByName(BuildPlugins.BuildType.release) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(fileTree(Pair("dir", "libs"), Pair("include", listOf("*.jar"))))
    implementation(project(":domain"))
    implementation(project(":platform"))
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.viewModel)
    implementation(Libraries.lifeCycleRuntime)
    kapt(Libraries.lifeCycleCompiler)

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

    testImplementation(TestLibraries.junit)
    androidTestImplementation(TestLibraries.junitExt)
    androidTestImplementation(TestLibraries.espresso)
}
