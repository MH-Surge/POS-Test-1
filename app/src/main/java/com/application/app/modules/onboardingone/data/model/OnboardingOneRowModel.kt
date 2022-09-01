package com.application.app.modules.onboardingone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRetailer: String? = MyApp.getInstance().resources.getString(R.string.lbl_retailer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShopGroceryS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shop_grocery_s)

)
