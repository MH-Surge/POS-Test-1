package com.application.app.modules.onboardingfive.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListartwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadFile: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_file)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompanyLogo: String? = MyApp.getInstance().resources.getString(R.string.lbl_company_logo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadyourCom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upload_your_com)

)
