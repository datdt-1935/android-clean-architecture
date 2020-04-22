import sun.misc.Version

const val kotlinVersion = "1.3.71"

object BuildPlugins {
    object Versions {
        const val buildToolVersion = "3.6.3"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinLibrary = "kotlin"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"

    object BuildType {
        const val release = "release"
        const val debug = "debug"
    }
}

object AndroidSdk {
    const val min = 25
    const val compile = 29
    const val target = compile
    const val buildToolVersion = "29.0.1"
}

object AppConfig {
    const val applicationId = "com.sun.cleanarchitecture"
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
}

object Libraries {
    private object Versions {
        const val appCompat = "1.1.0"
        const val constraintLayout = "1.1.3"
        const val ktx = "1.2.0"
        const val lifeCycle = "2.2.0"

        // Rx
        const val rxJava2 = "2.2.19"
        const val rxAndroid = "2.1.1"
        const val rxKotlin = "2.4.0"

        // Fast Android Networking
        const val fastAndroidNetworking = "1.0.2"

        // Room
        const val room = "2.2.5"

        // Koin
        const val koin = "2.0.1"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifeCycle}"
    const val lifeCycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifeCycle}"
    const val lifeCycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCycle}"

    // Rx
    const val rxJava2 = "io.reactivex.rxjava2:rxjava:${Versions.rxJava2}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"

    // Fast Android Networking
    const val fastAndroidNetworking =
        "com.amitshekhar.android:rx2-android-networking:${Versions.fastAndroidNetworking}"

    // Room database
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomRxJava2 = "androidx.room:room-rxjava2:${Versions.room}"

    // Koin
    const val koinCore = "org.koin:koin-core:${Versions.koin}"
    const val koinExt = "org.koin:koin-core-ext:${Versions.koin}"
    const val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koinAndroidx = "org.koin:koin-androidx-ext:${Versions.koin}"
}

object TestLibraries {
    private object Versions {
        const val junit = "4.12"
        const val junitExt = "1.1.1"
        const val espresso = "3.2.0"
    }

    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}