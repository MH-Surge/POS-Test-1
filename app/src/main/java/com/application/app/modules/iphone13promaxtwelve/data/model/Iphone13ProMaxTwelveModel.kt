package com.application.app.modules.iphone13promaxtwelve.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxTwelveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
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
  var txtWallet: String? = MyApp.getInstance().resources.getString(R.string.lbl_wallet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScantheQR: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_the_qr)

)
