package com.application.app.modules.ingredientquantity.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class IngredientQuantityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHowMuch: String? = MyApp.getInstance().resources.getString(R.string.lbl_how_much)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_much_of_thi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNeedHelpClic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_need_help_clic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGrams: String? = MyApp.getInstance().resources.getString(R.string.lbl_grams)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etWeightValue: String? = null
)
