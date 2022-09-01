package com.application.app.modules.iphone13promaxfourteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFourteenBinding
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxfourteen.`data`.model.ListrectanglefifteenTwo3RowModel
import com.application.app.modules.iphone13promaxfourteen.`data`.viewmodel.Iphone13ProMaxFourteenVM
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFourteenActivity :
    BaseActivity<ActivityIphone13ProMaxFourteenBinding>(R.layout.activity_iphone_13_pro_max_fourteen)
    {
  private val viewModel: Iphone13ProMaxFourteenVM by viewModels<Iphone13ProMaxFourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefifteenTwoAdapter =
    ListrectanglefifteenTwoAdapter(viewModel.listrectanglefifteenTwoList.value?:mutableListOf())
    binding.recyclerListrectanglefifteenTwo.adapter = listrectanglefifteenTwoAdapter
    listrectanglefifteenTwoAdapter.setOnItemClickListener(
    object : ListrectanglefifteenTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglefifteenTwo3RowModel) {
        onClickRecyclerListrectanglefifteenTwo(view, position, item)
      }
    }
    )
    viewModel.listrectanglefifteenTwoList.observe(this) {
      listrectanglefifteenTwoAdapter.updateData(it)
    }
    binding.iphone13ProMaxFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcbaselinerec.setOnClickListener {
      val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglefifteenTwo(
    view: View,
    position: Int,
    item: ListrectanglefifteenTwo3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FOURTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFourteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
