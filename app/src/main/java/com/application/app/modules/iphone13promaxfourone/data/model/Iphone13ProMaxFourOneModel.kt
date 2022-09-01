package com.application.app.modules.iphone13promaxfourone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxFourOneModel(
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
  var txtManagers: String? = MyApp.getInstance().resources.getString(R.string.lbl_managers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManager: String? = MyApp.getInstance().resources.getString(R.string.lbl_manager)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGuyHawkins: String? = MyApp.getInstance().resources.getString(R.string.lbl_guy_hawkins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEMail: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.msg_guyhawkins_exam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServers: String? = MyApp.getInstance().resources.getString(R.string.lbl_server_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup161Value: String? = null
)
