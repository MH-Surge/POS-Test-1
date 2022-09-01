package com.application.app.modules.splashscreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtByLinQFinace: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_linq_finace)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllRightsRese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_rights_rese)

)
