plugins { 
    id("com.android.application") version "7.0.0" 
    id("kotlin-android") version "1.5.21" 
}

android { 
    compileSdk = 31

    defaultConfig { 
        applicationId = "com.example.railwaybooking"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0" 
    }

    buildTypes { 
        release { 
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") 
        } 
    } 
}

dependencies { 
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21") 
    implementation("androidx.appcompat:appcompat:1.3.1") 
    implementation("com.google.android.material:material:1.4.0") 
    testImplementation("junit:junit:4.13.2") 
    androidTestImplementation("androidx.test.ext:junit:1.1.3") 
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0") 
}