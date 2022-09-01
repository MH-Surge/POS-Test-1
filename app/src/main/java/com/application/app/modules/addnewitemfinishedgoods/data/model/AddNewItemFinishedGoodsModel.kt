package com.application.app.modules.addnewitemfinishedgoods.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class AddNewItemFinishedGoodsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddNewItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_new_item)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIngredientorF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ingredient_or_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIngredient: String? = MyApp.getInstance().resources.getString(R.string.lbl_ingredient)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreThereIngre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_there_ingre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYes: String? = MyApp.getInstance().resources.getString(R.string.lbl_yes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup105Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup106Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup107Value: String? = null
)
