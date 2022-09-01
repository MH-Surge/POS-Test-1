package com.application.app.modules.iphone13promaxsixteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxSixteenBinding
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxsixteen.`data`.model.ListrectanglefifteenTwoRowModel
import com.application.app.modules.iphone13promaxsixteen.`data`.viewmodel.Iphone13ProMaxSixteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxSixteenActivity :
    BaseActivity<ActivityIphone13ProMaxSixteenBinding>(R.layout.activity_iphone_13_pro_max_sixteen)
    {
  private val viewModel: Iphone13ProMaxSixteenVM by viewModels<Iphone13ProMaxSixteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefifteenTwoAdapter =
    ListrectanglefifteenTwoAdapter(viewModel.listrectanglefifteenTwoList.value?:mutableListOf())
    binding.recyclerListrectanglefifteenTwo.adapter = listrectanglefifteenTwoAdapter
    listrectanglefifteenTwoAdapter.setOnItemClickListener(
    object : ListrectanglefifteenTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglefifteenTwoRowModel) {
        onClickRecyclerListrectanglefifteenTwo(view, position, item)
      }
    }
    )
    viewModel.listrectanglefifteenTwoList.observe(this) {
      listrectanglefifteenTwoAdapter.updateData(it)
    }
    binding.iphone13ProMaxSixteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcbaselinerec.setOnClickListener {
      val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglefifteenTwo(
    view: View,
    position: Int,
    item: ListrectanglefifteenTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_SIXTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxSixteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
