package com.application.app.modules.iphone13promaxfourone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListserverRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtServer: String? = MyApp.getInstance().resources.getString(R.string.lbl_server)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWadeWarren: String? = MyApp.getInstance().resources.getString(R.string.lbl_wade_warren)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEMailTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.msg_wadewarren_exam)

)
