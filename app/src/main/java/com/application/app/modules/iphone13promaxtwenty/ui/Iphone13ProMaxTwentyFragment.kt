package com.application.app.modules.iphone13promaxtwenty.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentIphone13ProMaxTwentyBinding
import com.application.app.modules.iphone13promaxtwenty.`data`.model.ListrectanglefifteenTwo1RowModel
import com.application.app.modules.iphone13promaxtwenty.`data`.viewmodel.Iphone13ProMaxTwentyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTwentyFragment :
    BaseFragment<FragmentIphone13ProMaxTwentyBinding>(R.layout.fragment_iphone_13_pro_max_twenty) {
  private val viewModel: Iphone13ProMaxTwentyVM by viewModels<Iphone13ProMaxTwentyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listrectanglefifteenTwoAdapter =
    ListrectanglefifteenTwoAdapter(viewModel.listrectanglefifteenTwoList.value?:mutableListOf())
    binding.recyclerListrectanglefifteenTwo.adapter = listrectanglefifteenTwoAdapter
    listrectanglefifteenTwoAdapter.setOnItemClickListener(
    object : ListrectanglefifteenTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglefifteenTwo1RowModel) {
        onClickRecyclerListrectanglefifteenTwo(view, position, item)
      }
    }
    )
    viewModel.listrectanglefifteenTwoList.observe(requireActivity()) {
      listrectanglefifteenTwoAdapter.updateData(it)
    }
    binding.iphone13ProMaxTwentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectanglefifteenTwo(
    view: View,
    position: Int,
    item: ListrectanglefifteenTwo1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_TWENTY_FRAGMENT"

  }
}
