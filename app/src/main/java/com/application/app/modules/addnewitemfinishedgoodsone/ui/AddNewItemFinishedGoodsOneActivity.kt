package com.application.app.modules.addnewitemfinishedgoodsone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAddNewItemFinishedGoodsOneBinding
import com.application.app.modules.addnewitemfinishedgoodsone.`data`.viewmodel.AddNewItemFinishedGoodsOneVM
import kotlin.String
import kotlin.Unit

class AddNewItemFinishedGoodsOneActivity :
    BaseActivity<ActivityAddNewItemFinishedGoodsOneBinding>(R.layout.activity_add_new_item_finished_goods_one)
    {
  private val viewModel: AddNewItemFinishedGoodsOneVM by viewModels<AddNewItemFinishedGoodsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addNewItemFinishedGoodsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_NEW_ITEM_FINISHED_GOODS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddNewItemFinishedGoodsOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
