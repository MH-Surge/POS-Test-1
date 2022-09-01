package com.application.app.modules.ingredientquantity.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIngredientQuantityBinding
import com.application.app.modules.ingredientquantity.`data`.viewmodel.IngredientQuantityVM
import kotlin.String
import kotlin.Unit

class IngredientQuantityActivity :
    BaseActivity<ActivityIngredientQuantityBinding>(R.layout.activity_ingredient_quantity) {
  private val viewModel: IngredientQuantityVM by viewModels<IngredientQuantityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ingredientQuantityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "INGREDIENT_QUANTITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IngredientQuantityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
