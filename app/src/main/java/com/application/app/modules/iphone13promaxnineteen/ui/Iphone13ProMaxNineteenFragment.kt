package com.application.app.modules.iphone13promaxnineteen.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentIphone13ProMaxNineteenBinding
import com.application.app.modules.iphone13promaxnineteen.`data`.model.GridrectanglefifteenFourRowModel
import com.application.app.modules.iphone13promaxnineteen.`data`.model.ListrectanglefifteenTwo2RowModel
import com.application.app.modules.iphone13promaxnineteen.`data`.viewmodel.Iphone13ProMaxNineteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxNineteenFragment :
    BaseFragment<FragmentIphone13ProMaxNineteenBinding>(R.layout.fragment_iphone_13_pro_max_nineteen)
    {
  private val viewModel: Iphone13ProMaxNineteenVM by viewModels<Iphone13ProMaxNineteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listrectanglefifteenTwoAdapter =
    ListrectanglefifteenTwoAdapter(viewModel.listrectanglefifteenTwoList.value?:mutableListOf())
    binding.recyclerListrectanglefifteenTwo.adapter = listrectanglefifteenTwoAdapter
    listrectanglefifteenTwoAdapter.setOnItemClickListener(
    object : ListrectanglefifteenTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglefifteenTwo2RowModel) {
        onClickRecyclerListrectanglefifteenTwo(view, position, item)
      }
    }
    )
    viewModel.listrectanglefifteenTwoList.observe(requireActivity()) {
      listrectanglefifteenTwoAdapter.updateData(it)
    }
    val gridrectanglefifteenFourAdapter =
    GridrectanglefifteenFourAdapter(viewModel.gridrectanglefifteenFourList.value?:mutableListOf())
    binding.recyclerGridrectanglefifteenFour.adapter = gridrectanglefifteenFourAdapter
    gridrectanglefifteenFourAdapter.setOnItemClickListener(
    object : GridrectanglefifteenFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      GridrectanglefifteenFourRowModel) {
        onClickRecyclerGridrectanglefifteenFour(view, position, item)
      }
    }
    )
    viewModel.gridrectanglefifteenFourList.observe(requireActivity()) {
      gridrectanglefifteenFourAdapter.updateData(it)
    }
    binding.iphone13ProMaxNineteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectanglefifteenTwo(
    view: View,
    position: Int,
    item: ListrectanglefifteenTwo2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerGridrectanglefifteenFour(
    view: View,
    position: Int,
    item: GridrectanglefifteenFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_NINETEEN_FRAGMENT"

  }
}
