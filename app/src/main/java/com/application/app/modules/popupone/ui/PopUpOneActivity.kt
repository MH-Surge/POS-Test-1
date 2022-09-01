package com.application.app.modules.popupone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPopUpOneBinding
import com.application.app.modules.popupone.`data`.model.PopUpOneRowModel
import com.application.app.modules.popupone.`data`.viewmodel.PopUpOneVM
import com.application.app.modules.popupsuccessful.ui.PopUpSuccessfulActivity
import com.application.app.modules.popupunsuccessful.ui.PopUpUnsuccessfulActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PopUpOneActivity : BaseActivity<ActivityPopUpOneBinding>(R.layout.activity_pop_up_one) {
  private val viewModel: PopUpOneVM by viewModels<PopUpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val popUpOneAdapter = PopUpOneAdapter(viewModel.popUpOneList.value?:mutableListOf())
    binding.recyclerPopUpOne.adapter = popUpOneAdapter
    popUpOneAdapter.setOnItemClickListener(
    object : PopUpOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PopUpOneRowModel) {
        onClickRecyclerPopUpOne(view, position, item)
      }
    }
    )
    viewModel.popUpOneList.observe(this) {
      popUpOneAdapter.updateData(it)
    }
    binding.popUpOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirm.setOnClickListener {
      val destIntent = PopUpSuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleEightyThree.setOnClickListener {
      val destIntent = PopUpUnsuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPopUpOne(
    view: View,
    position: Int,
    item: PopUpOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "POP_UP_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopUpOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
