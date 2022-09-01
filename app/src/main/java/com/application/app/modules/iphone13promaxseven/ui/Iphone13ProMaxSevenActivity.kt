package com.application.app.modules.iphone13promaxseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.appcomponents.views.ImagePickerFragmentDialog
import com.application.app.databinding.ActivityIphone13ProMaxSevenBinding
import com.application.app.modules.iphone13promaxeight.ui.Iphone13ProMaxEightActivity
import com.application.app.modules.iphone13promaxeleven.ui.Iphone13ProMaxElevenActivity
import com.application.app.modules.iphone13promaxnine.ui.Iphone13ProMaxNineActivity
import com.application.app.modules.iphone13promaxseven.`data`.model.ListcameraRowModel
import com.application.app.modules.iphone13promaxseven.`data`.viewmodel.Iphone13ProMaxSevenVM
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxsix.ui.Iphone13ProMaxSixActivity
import com.application.app.modules.iphone13promaxten.ui.Iphone13ProMaxTenActivity
import com.application.app.modules.iphone13promaxtwelve.ui.Iphone13ProMaxTwelveActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxSevenActivity :
    BaseActivity<ActivityIphone13ProMaxSevenBinding>(R.layout.activity_iphone_13_pro_max_seven) {
  private val viewModel: Iphone13ProMaxSevenVM by viewModels<Iphone13ProMaxSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listcameraAdapter = ListcameraAdapter(viewModel.listcameraList.value?:mutableListOf())
    binding.recyclerListcamera.adapter = listcameraAdapter
    listcameraAdapter.setOnItemClickListener(
    object : ListcameraAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcameraRowModel) {
        onClickRecyclerListcamera(view, position, item)
      }
    }
    )
    viewModel.listcameraList.observe(this) {
      listcameraAdapter.updateData(it)
    }
    binding.iphone13ProMaxSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancel.setOnClickListener {
      val destIntent = Iphone13ProMaxSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnsignal.setOnClickListener {
      val destIntent = Iphone13ProMaxTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListcamera(
    view: View,
    position: Int,
    item: ListcameraRowModel
  ): Unit {
    when(view.id) {


      R.id.imageCamera -> {
        ImagePickerFragmentDialog().show(supportFragmentManager)
        { path ->//TODO HANDLE DATA
        }

      }
      R.id.linearColumncamera -> {
        onClickRecyclerListcameraLinearColumncamera(view, position, item)
      }
      R.id.linearColumntrash -> {
        onClickRecyclerListcameraLinearColumntrash(view, position, item)
      }
    }
  }

  fun onClickRecyclerListcameraLinearColumncamera(
    view: View,
    position: Int,
    item: ListcameraRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = Iphone13ProMaxTenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = Iphone13ProMaxEightActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListcameraLinearColumntrash(
    view: View,
    position: Int,
    item: ListcameraRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = Iphone13ProMaxElevenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = Iphone13ProMaxNineActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxSevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
