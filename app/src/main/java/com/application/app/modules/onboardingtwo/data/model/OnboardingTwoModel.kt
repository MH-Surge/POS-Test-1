package com.application.app.modules.onboardingtwo.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadFiles: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_files)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkipforNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip_for_now)

)
