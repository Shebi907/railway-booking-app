plugins {{
    id("com.android.application")
    kotlin("android")
}

android {{
    compileSdk = 31

    defaultConfig {{
        applicationId = "com.example.railwaybooking"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }}

    buildTypes {{
        getByName("release") {{
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }}
    }}
}

tasks.withType<com.android.build.gradle.tasks.AbstractCompile>() {{
    kotlinOptions {{
        jvmTarget = "1.8"
    }}
}}