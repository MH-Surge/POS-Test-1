package com.application.app.modules.iphone13promaxfivetwo.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxFiveTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmployeeManage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_employee_manage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInsights: String? = MyApp.getInstance().resources.getString(R.string.lbl_insights)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArleneMcCoy: String? = MyApp.getInstance().resources.getString(R.string.lbl_arlene_mccoy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggestedEmplo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_suggested_emplo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheirSales: String? = MyApp.getInstance().resources.getString(R.string.lbl_their_sales)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_mwk_365_120_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmployeeDevelo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_employee_develo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProgress: String? = MyApp.getInstance().resources.getString(R.string.lbl_progress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewEmployees: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_view_employees)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInsightsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_insights)

)
