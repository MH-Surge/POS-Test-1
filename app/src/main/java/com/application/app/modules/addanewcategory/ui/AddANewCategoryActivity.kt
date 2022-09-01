package com.application.app.modules.addanewcategory.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAddANewCategoryBinding
import com.application.app.modules.addanewcategory.`data`.model.GridrectanglefifteenRowModel
import com.application.app.modules.addanewcategory.`data`.viewmodel.AddANewCategoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AddANewCategoryActivity :
    BaseActivity<ActivityAddANewCategoryBinding>(R.layout.activity_add_a_new_category) {
  private val viewModel: AddANewCategoryVM by viewModels<AddANewCategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridrectanglefifteenAdapter =
    GridrectanglefifteenAdapter(viewModel.gridrectanglefifteenList.value?:mutableListOf())
    binding.recyclerGridrectanglefifteen.adapter = gridrectanglefifteenAdapter
    gridrectanglefifteenAdapter.setOnItemClickListener(
    object : GridrectanglefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridrectanglefifteenRowModel) {
        onClickRecyclerGridrectanglefifteen(view, position, item)
      }
    }
    )
    viewModel.gridrectanglefifteenList.observe(this) {
      gridrectanglefifteenAdapter.updateData(it)
    }
    binding.addANewCategoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridrectanglefifteen(
    view: View,
    position: Int,
    item: GridrectanglefifteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ADD_A_NEW_CATEGORY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddANewCategoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
