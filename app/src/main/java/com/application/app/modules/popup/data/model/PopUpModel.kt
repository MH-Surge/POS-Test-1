package com.application.app.modules.popup.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class PopUpModel(
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
  var txtCardPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompletetheOr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_complete_the_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBillTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_bill_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_mwk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt11895000: String? = MyApp.getInstance().resources.getString(R.string.lbl_118_950_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGratuity: String? = MyApp.getInstance().resources.getString(R.string.lbl_gratuity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup162Value: String? = null
)
