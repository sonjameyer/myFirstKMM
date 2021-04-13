package com.skynamo.myfirstkmm.sharedKMM

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}