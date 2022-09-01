package com.application.app.modules.iphone13promaxtwentytwo.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxTwentytwoModel(
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
  var txtSearchItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_search_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentSearches: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_searches)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame247: String? = MyApp.getInstance().resources.getString(R.string.lbl_main)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame246: String? = MyApp.getInstance().resources.getString(R.string.lbl_drinks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame246One: String? = MyApp.getInstance().resources.getString(R.string.lbl_starters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup161Value: String? = null
)
