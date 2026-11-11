plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "bo.edu.uajms.lucasmartinez.surmarket"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "bo.edu.uajms.lucasmartinez.surmarket"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    val nav_version = "2.10.2"

    // Jetpack Compose Integration
    implementation("androidx.navigation:navigation-compose:${nav_version}")

    // Views/Fragments Integration
    implementation("androidx.navigation:navigation-fragment:${nav_version}")
    implementation("androidx.navigation:navigation-ui:${nav_version}")
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}