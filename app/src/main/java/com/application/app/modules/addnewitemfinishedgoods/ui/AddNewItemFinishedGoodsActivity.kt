package com.application.app.modules.addnewitemfinishedgoods.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAddNewItemFinishedGoodsBinding
import com.application.app.modules.addnewitemfinishedgoods.`data`.viewmodel.AddNewItemFinishedGoodsVM
import kotlin.String
import kotlin.Unit

class AddNewItemFinishedGoodsActivity :
    BaseActivity<ActivityAddNewItemFinishedGoodsBinding>(R.layout.activity_add_new_item_finished_goods)
    {
  private val viewModel: AddNewItemFinishedGoodsVM by viewModels<AddNewItemFinishedGoodsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addNewItemFinishedGoodsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_NEW_ITEM_FINISHED_GOODS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddNewItemFinishedGoodsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
