package com.application.app.modules.iphone13promaxfourone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFourOneBinding
import com.application.app.modules.iphone13promaxfourone.`data`.model.ListserverRowModel
import com.application.app.modules.iphone13promaxfourone.`data`.viewmodel.Iphone13ProMaxFourOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFourOneActivity :
    BaseActivity<ActivityIphone13ProMaxFourOneBinding>(R.layout.activity_iphone_13_pro_max_four_one)
    {
  private val viewModel: Iphone13ProMaxFourOneVM by viewModels<Iphone13ProMaxFourOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listserverAdapter = ListserverAdapter(viewModel.listserverList.value?:mutableListOf())
    binding.recyclerListserver.adapter = listserverAdapter
    listserverAdapter.setOnItemClickListener(
    object : ListserverAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListserverRowModel) {
        onClickRecyclerListserver(view, position, item)
      }
    }
    )
    viewModel.listserverList.observe(this) {
      listserverAdapter.updateData(it)
    }
    binding.iphone13ProMaxFourOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListserver(
    view: View,
    position: Int,
    item: ListserverRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FOUR_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFourOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
