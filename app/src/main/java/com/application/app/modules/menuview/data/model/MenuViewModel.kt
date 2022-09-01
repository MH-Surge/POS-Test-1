package com.application.app.modules.menuview.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class MenuViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClose: String? = MyApp.getInstance().resources.getString(R.string.lbl_close)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderNumberZero: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_number_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSidesChips: String? = MyApp.getInstance().resources.getString(R.string.lbl_sides_chips)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_x_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt250000: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_500_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_mwk_17_500_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMainChickenS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_main_chicken_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_x_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotesNoFeta: String? = MyApp.getInstance().resources.getString(R.string.msg_notes_no_feta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEachCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_500_00_each)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_mwk_30_000_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_vat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredSixtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_mwk_17_450_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_mwk_118_000_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup210Value: String? = null
)
