package com.application.app.modules.popupunsuccessful.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class PopUpUnsuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
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
  var txtOhNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_oh_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourPaymentWa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_payment_wa)

)
