package com.application.app.modules.onboardingfour.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeLinQPO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_linq_po)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTellsAboutYou: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tells_about_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIamA: String? = MyApp.getInstance().resources.getString(R.string.lbl_i_am_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndividual: String? = MyApp.getInstance().resources.getString(R.string.lbl_individual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusiness: String? = MyApp.getInstance().resources.getString(R.string.lbl_business)

)
