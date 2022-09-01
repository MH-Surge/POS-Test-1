package com.application.app.modules.popupsuccessful.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class PopUpSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClose: String? = MyApp.getInstance().resources.getString(R.string.lbl_close)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompletePaymen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_complete_paymen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThankYou: String? = MyApp.getInstance().resources.getString(R.string.lbl_thank_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourPaymentWa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_payment_wa2)

)
