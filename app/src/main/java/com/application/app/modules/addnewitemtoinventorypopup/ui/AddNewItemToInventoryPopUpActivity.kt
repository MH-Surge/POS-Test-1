package com.application.app.modules.addnewitemtoinventorypopup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAddNewItemToInventoryPopUpBinding
import com.application.app.modules.addnewitemtoinventorypopup.`data`.viewmodel.AddNewItemToInventoryPopUpVM
import kotlin.String
import kotlin.Unit

class AddNewItemToInventoryPopUpActivity :
    BaseActivity<ActivityAddNewItemToInventoryPopUpBinding>(R.layout.activity_add_new_item_to_inventory_pop_up)
    {
  private val viewModel: AddNewItemToInventoryPopUpVM by viewModels<AddNewItemToInventoryPopUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addNewItemToInventoryPopUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_NEW_ITEM_TO_INVENTORY_POP_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddNewItemToInventoryPopUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
