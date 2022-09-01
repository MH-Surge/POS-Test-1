package com.application.app.modules.onboardingthree.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterYourPers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_pers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourFirstand: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_first_and)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdenficationTy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_idenfication_ty)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdenficationNu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_idenfication_nu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkipforNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip_for_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwelveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFifteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixteenValue: String? = null
)
