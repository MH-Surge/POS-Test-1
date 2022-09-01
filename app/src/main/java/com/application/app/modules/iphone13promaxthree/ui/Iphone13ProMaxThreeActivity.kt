package com.application.app.modules.iphone13promaxthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxThreeBinding
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxsix.ui.Iphone13ProMaxSixActivity
import com.application.app.modules.iphone13promaxthree.`data`.model.Gridgrid1RowModel
import com.application.app.modules.iphone13promaxthree.`data`.model.ListordercounterRowModel
import com.application.app.modules.iphone13promaxthree.`data`.viewmodel.Iphone13ProMaxThreeVM
import com.application.app.modules.iphone13promaxtwentyone.ui.Iphone13ProMaxTwentyoneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxThreeActivity :
    BaseActivity<ActivityIphone13ProMaxThreeBinding>(R.layout.activity_iphone_13_pro_max_three) {
  private val viewModel: Iphone13ProMaxThreeVM by viewModels<Iphone13ProMaxThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridgridAdapter = GridgridAdapter(viewModel.gridgridList.value?:mutableListOf())
    binding.recyclerGridgrid.adapter = gridgridAdapter
    gridgridAdapter.setOnItemClickListener(
    object : GridgridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridgrid1RowModel) {
        onClickRecyclerGridgrid(view, position, item)
      }
    }
    )
    viewModel.gridgridList.observe(this) {
      gridgridAdapter.updateData(it)
    }
    val listordercounterAdapter =
    ListordercounterAdapter(viewModel.listordercounterList.value?:mutableListOf())
    binding.recyclerListordercounter.adapter = listordercounterAdapter
    listordercounterAdapter.setOnItemClickListener(
    object : ListordercounterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListordercounterRowModel) {
        onClickRecyclerListordercounter(view, position, item)
      }
    }
    )
    viewModel.listordercounterList.observe(this) {
      listordercounterAdapter.updateData(it)
    }
    binding.iphone13ProMaxThreeVM = viewModel
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

  fun onClickRecyclerGridgrid(
    view: View,
    position: Int,
    item: Gridgrid1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumngrid -> {
        onClickRecyclerGridgridLinearColumngrid(view, position, item)
      }
    }
  }

  fun onClickRecyclerListordercounter(
    view: View,
    position: Int,
    item: ListordercounterRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnordercounter -> {
        onClickRecyclerListordercounterLinearColumnordercounter(view, position, item)
      }
    }
  }

  fun onClickRecyclerGridgridLinearColumngrid(
    view: View,
    position: Int,
    item: Gridgrid1RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = Iphone13ProMaxTwentyoneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListordercounterLinearColumnordercounter(
    view: View,
    position: Int,
    item: ListordercounterRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = Iphone13ProMaxSixActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = Iphone13ProMaxSixActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = Iphone13ProMaxSixActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
