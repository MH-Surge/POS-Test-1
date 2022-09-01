package com.application.app.modules.popupimagesearch.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class PopUpImageSearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseanImage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_an_image)

)
