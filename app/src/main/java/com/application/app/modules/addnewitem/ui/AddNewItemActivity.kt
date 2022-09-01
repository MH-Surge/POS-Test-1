package com.application.app.modules.addnewitem.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAddNewItemBinding
import com.application.app.modules.addnewitem.`data`.viewmodel.AddNewItemVM
import kotlin.String
import kotlin.Unit

class AddNewItemActivity : BaseActivity<ActivityAddNewItemBinding>(R.layout.activity_add_new_item) {
  private val viewModel: AddNewItemVM by viewModels<AddNewItemVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addNewItemVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_NEW_ITEM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddNewItemActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
