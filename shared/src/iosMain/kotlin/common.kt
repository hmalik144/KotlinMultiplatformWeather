package com.appttude.h_mal.shared


import platform.UIKit.UIDevice

actual fun platformName() : String {
    return "iOS " + UIDevice.currentDevice.systemVersion
}