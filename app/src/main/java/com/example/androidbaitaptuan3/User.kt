package com.example.androidbaitaptuan3
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
@Parcelize
class User(var fullname : String?, var email:String?, var phone : String?) : Parcelable {
}