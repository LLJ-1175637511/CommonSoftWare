package com.lyc.epidemiccontrol.data.bean

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginBean(
    val address: String,
    val eamil: String,
    val gender: String,
    val headPortrait: String,
    val permissions: Int,
    val telephone: String,
    val userName: String,
    val userNum: String
): Parcelable