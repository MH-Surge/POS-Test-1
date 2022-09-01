package com.application.app.modules.addnewitemtoinventorypopup.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class AddNewItemToInventoryPopUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdd: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisIngredient: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_ingredient)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyThreeValue: String? = null
)
