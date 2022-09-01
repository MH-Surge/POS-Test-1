package com.application.app.modules.onboarding.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterYourBusi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_busi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessName: String? = MyApp.getInstance().resources.getString(R.string.lbl_business_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusinessRegist: String? =
      MyApp.getInstance().resources.getString(R.string.msg_business_regist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaxID: String? = MyApp.getInstance().resources.getString(R.string.lbl_tax_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkipforNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip_for_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null
)
