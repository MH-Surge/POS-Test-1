package com.application.app.modules.onboardingeight.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingEightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometo: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignInBelow: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in_below)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPasswordOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dont_have_an_ac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmationOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dont_have_an_ac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUpHere: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUpHereOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup106Value: String? = null
)
