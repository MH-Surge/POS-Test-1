package com.application.app.modules.menuview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityMenuViewBinding
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.menuview.`data`.viewmodel.MenuViewVM
import kotlin.String
import kotlin.Unit

class MenuViewActivity : BaseActivity<ActivityMenuViewBinding>(R.layout.activity_menu_view) {
  private val viewModel: MenuViewVM by viewModels<MenuViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtClose.setOnClickListener {
      val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MENU_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
