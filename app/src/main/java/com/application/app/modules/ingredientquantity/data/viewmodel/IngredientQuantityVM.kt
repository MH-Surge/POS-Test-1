package com.application.app.modules.ingredientquantity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.ingredientquantity.`data`.model.IngredientQuantityModel
import org.koin.core.KoinComponent

class IngredientQuantityVM : ViewModel(), KoinComponent {
  val ingredientQuantityModel: MutableLiveData<IngredientQuantityModel> =
      MutableLiveData(IngredientQuantityModel())

  var navArguments: Bundle? = null
}
