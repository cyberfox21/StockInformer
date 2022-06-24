@file:Suppress("PackageDirectoryMismatch")

object Dependencies {

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    }
}
