package com.application.app.modules.iphone13promaxfifteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFifteenBinding
import com.application.app.modules.iphone13promaxfifteen.`data`.model.ListrectanglefifteenFourRowModel
import com.application.app.modules.iphone13promaxfifteen.`data`.model.ListrectanglefifteenRowModel
import com.application.app.modules.iphone13promaxfifteen.`data`.viewmodel.Iphone13ProMaxFifteenVM
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFifteenActivity :
    BaseActivity<ActivityIphone13ProMaxFifteenBinding>(R.layout.activity_iphone_13_pro_max_fifteen)
    {
  private val viewModel: Iphone13ProMaxFifteenVM by viewModels<Iphone13ProMaxFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefifteenAdapter =
    ListrectanglefifteenAdapter(viewModel.listrectanglefifteenList.value?:mutableListOf())
    binding.recyclerListrectanglefifteen.adapter = listrectanglefifteenAdapter
    listrectanglefifteenAdapter.setOnItemClickListener(
    object : ListrectanglefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglefifteenRowModel) {
        onClickRecyclerListrectanglefifteen(view, position, item)
      }
    }
    )
    viewModel.listrectanglefifteenList.observe(this) {
      listrectanglefifteenAdapter.updateData(it)
    }
    val listrectanglefifteenFourAdapter =
    ListrectanglefifteenFourAdapter(viewModel.listrectanglefifteenFourList.value?:mutableListOf())
    binding.recyclerListrectanglefifteenFour.adapter = listrectanglefifteenFourAdapter
    listrectanglefifteenFourAdapter.setOnItemClickListener(
    object : ListrectanglefifteenFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglefifteenFourRowModel) {
        onClickRecyclerListrectanglefifteenFour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefifteenFourList.observe(this) {
      listrectanglefifteenFourAdapter.updateData(it)
    }
    binding.iphone13ProMaxFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtClose.setOnClickListener {
      val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcbaselinerec.setOnClickListener {
      val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglefifteen(
    view: View,
    position: Int,
    item: ListrectanglefifteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglefifteenFour(
    view: View,
    position: Int,
    item: ListrectanglefifteenFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FIFTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFifteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
