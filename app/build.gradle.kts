plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.hubcubemk.applocker"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.hubcubemk.applocker"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    // Compose
    implementation(libs.androidx.lifecycle.viewmodel.compose.android)//"androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7"
    // Biometrics
    implementation(libs.androidx.biometric)//"androidx.biometric:biometric:1.1.0"
    // Security
    implementation(libs.androidx.security.crypto)//"androidx.security:security-crypto:1.1.0-alpha06"
    // DataStore
    implementation(libs.androidx.datastore.preferences)//"androidx.datastore:datastore-preferences:1.1.2"
    // Navigation
    implementation (libs.androidx.navigation.compose)//"androidx.navigation:navigation-compose:2.8.5"

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}