package com.application.app.modules.iphone13promaxseventwo.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListmenuTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInventory: String? = MyApp.getInstance().resources.getString(R.string.lbl_inventory)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmployeeManage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_employee_manage)

)
