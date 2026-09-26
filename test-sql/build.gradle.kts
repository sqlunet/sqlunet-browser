/*
 * Copyright (c) 2026. Bernard Bou
 */

plugins {
    id("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    implementation("org.xerial:sqlite-jdbc:3.53.4.0")
    implementation(libs.annotation)
}