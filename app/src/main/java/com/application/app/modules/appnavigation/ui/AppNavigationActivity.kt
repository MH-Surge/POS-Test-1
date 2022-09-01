package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.addanewcategory.ui.AddANewCategoryActivity
import com.application.app.modules.addnewitem.ui.AddNewItemActivity
import com.application.app.modules.addnewitemfinishedgoods.ui.AddNewItemFinishedGoodsActivity
import com.application.app.modules.addnewitemfinishedgoodsone.ui.AddNewItemFinishedGoodsOneActivity
import com.application.app.modules.addnewitemtoinventorypopup.ui.AddNewItemToInventoryPopUpActivity
import com.application.app.modules.analytics.ui.AnalyticsActivity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.emptystate.ui.EmptyStateActivity
import com.application.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.application.app.modules.forgotpasswordone.ui.ForgotPasswordOneActivity
import com.application.app.modules.forgotpasswordthree.ui.ForgotPasswordThreeActivity
import com.application.app.modules.forgotpasswordtwo.ui.ForgotPasswordTwoActivity
import com.application.app.modules.framefortythree.ui.FrameFortythreeActivity
import com.application.app.modules.framefortytwo.ui.FrameFortytwoActivity
import com.application.app.modules.ingredientquantity.ui.IngredientQuantityActivity
import com.application.app.modules.iphone13promaxeight.ui.Iphone13ProMaxEightActivity
import com.application.app.modules.iphone13promaxeighteen.ui.Iphone13ProMaxEighteenActivity
import com.application.app.modules.iphone13promaxeleven.ui.Iphone13ProMaxElevenActivity
import com.application.app.modules.iphone13promaxelevenone.ui.Iphone13ProMaxElevenOneActivity
import com.application.app.modules.iphone13promaxfifteen.ui.Iphone13ProMaxFifteenActivity
import com.application.app.modules.iphone13promaxfifteenone.ui.Iphone13ProMaxFifteenOneActivity
import com.application.app.modules.iphone13promaxfive.ui.Iphone13ProMaxFiveActivity
import com.application.app.modules.iphone13promaxfiveone.ui.Iphone13ProMaxFiveOneActivity
import com.application.app.modules.iphone13promaxfivetwo.ui.Iphone13ProMaxFiveTwoActivity
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxfourone.ui.Iphone13ProMaxFourOneActivity
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.iphone13promaxfourteenone.ui.Iphone13ProMaxFourteenOneActivity
import com.application.app.modules.iphone13promaxnine.ui.Iphone13ProMaxNineActivity
import com.application.app.modules.iphone13promaxnineone.ui.Iphone13ProMaxNineOneActivity
import com.application.app.modules.iphone13promaxone.ui.Iphone13ProMaxOneActivity
import com.application.app.modules.iphone13promaxseven.ui.Iphone13ProMaxSevenActivity
import com.application.app.modules.iphone13promaxsevenone.ui.Iphone13ProMaxSevenOneActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxseventwo.ui.Iphone13ProMaxSevenTwoActivity
import com.application.app.modules.iphone13promaxsix.ui.Iphone13ProMaxSixActivity
import com.application.app.modules.iphone13promaxsixone.ui.Iphone13ProMaxSixOneActivity
import com.application.app.modules.iphone13promaxsixteen.ui.Iphone13ProMaxSixteenActivity
import com.application.app.modules.iphone13promaxten.ui.Iphone13ProMaxTenActivity
import com.application.app.modules.iphone13promaxtenone.ui.Iphone13ProMaxTenOneActivity
import com.application.app.modules.iphone13promaxthirteen.ui.Iphone13ProMaxThirteenActivity
import com.application.app.modules.iphone13promaxthirteenone.ui.Iphone13ProMaxThirteenOneActivity
import com.application.app.modules.iphone13promaxthree.ui.Iphone13ProMaxThreeActivity
import com.application.app.modules.iphone13promaxthreeone.ui.Iphone13ProMaxThreeOneActivity
import com.application.app.modules.iphone13promaxtwelve.ui.Iphone13ProMaxTwelveActivity
import com.application.app.modules.iphone13promaxtwelveone.ui.Iphone13ProMaxTwelveOneActivity
import com.application.app.modules.iphone13promaxtwenty1.ui.Iphone13ProMaxTwenty1Activity
import com.application.app.modules.iphone13promaxtwentyfour.ui.Iphone13ProMaxTwentyfourActivity
import com.application.app.modules.iphone13promaxtwentyone.ui.Iphone13ProMaxTwentyoneActivity
import com.application.app.modules.iphone13promaxtwentythree.ui.Iphone13ProMaxTwentythreeActivity
import com.application.app.modules.iphone13promaxtwentytwo.ui.Iphone13ProMaxTwentytwoActivity
import com.application.app.modules.iphone13promaxtwo.ui.Iphone13ProMaxTwoActivity
import com.application.app.modules.loginsignup.ui.LogInSignUpActivity
import com.application.app.modules.loginsignupone.ui.LogInSignUpOneActivity
import com.application.app.modules.menuview.ui.MenuViewActivity
import com.application.app.modules.onboarding.ui.OnboardingActivity
import com.application.app.modules.onboardingeight.ui.OnboardingEightActivity
import com.application.app.modules.onboardingfive.ui.OnboardingFiveActivity
import com.application.app.modules.onboardingfour.ui.OnboardingFourActivity
import com.application.app.modules.onboardingone.ui.OnboardingOneActivity
import com.application.app.modules.onboardingseven.ui.OnboardingSevenActivity
import com.application.app.modules.onboardingsix.ui.OnboardingSixActivity
import com.application.app.modules.onboardingthree.ui.OnboardingThreeActivity
import com.application.app.modules.onboardingtwo.ui.OnboardingTwoActivity
import com.application.app.modules.popup.ui.PopUpActivity
import com.application.app.modules.popupimagesearch.ui.PopUpImageSearchActivity
import com.application.app.modules.popupone.ui.PopUpOneActivity
import com.application.app.modules.popupsuccessful.ui.PopUpSuccessfulActivity
import com.application.app.modules.popupunsuccessful.ui.PopUpUnsuccessfulActivity
import com.application.app.modules.splashscreen.ui.SplashScreenActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearIPhone13ProMaxFour.setOnClickListener {
      val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxFifteenOne.setOnClickListener {
      val destIntent = Iphone13ProMaxFifteenOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddNewItemToInventoryPopUp.setOnClickListener {
      val destIntent = AddNewItemToInventoryPopUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxSevenTwo.setOnClickListener {
      val destIntent = Iphone13ProMaxSevenTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxNine.setOnClickListener {
      val destIntent = Iphone13ProMaxNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxFourteenOne.setOnClickListener {
      val destIntent = Iphone13ProMaxFourteenOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxSixteen.setOnClickListener {
      val destIntent = Iphone13ProMaxSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPopUpUnsuccessful.setOnClickListener {
      val destIntent = PopUpUnsuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxSix.setOnClickListener {
      val destIntent = Iphone13ProMaxSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTwentyFour.setOnClickListener {
      val destIntent = Iphone13ProMaxTwentyfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogInSignUpOne.setOnClickListener {
      val destIntent = LogInSignUpOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPopUp.setOnClickListener {
      val destIntent = PopUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxSevenOne.setOnClickListener {
      val destIntent = Iphone13ProMaxSevenOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingTwo.setOnClickListener {
      val destIntent = OnboardingTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxEighteen.setOnClickListener {
      val destIntent = Iphone13ProMaxEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxFourteen.setOnClickListener {
      val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogInSignUp.setOnClickListener {
      val destIntent = LogInSignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTwentyTwo.setOnClickListener {
      val destIntent = Iphone13ProMaxTwentytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingFour.setOnClickListener {
      val destIntent = OnboardingFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxThirteen.setOnClickListener {
      val destIntent = Iphone13ProMaxThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxThreeOne.setOnClickListener {
      val destIntent = Iphone13ProMaxThreeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxEight.setOnClickListener {
      val destIntent = Iphone13ProMaxEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTwenty.setOnClickListener {
      val destIntent = Iphone13ProMaxTwenty1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMenuView.setOnClickListener {
      val destIntent = MenuViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxFiveOne.setOnClickListener {
      val destIntent = Iphone13ProMaxFiveOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPopUpImageSearch.setOnClickListener {
      val destIntent = PopUpImageSearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxThirteenOne.setOnClickListener {
      val destIntent = Iphone13ProMaxThirteenOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddNewItem.setOnClickListener {
      val destIntent = AddNewItemActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxFiveTwo.setOnClickListener {
      val destIntent = Iphone13ProMaxFiveTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxFifteen.setOnClickListener {
      val destIntent = Iphone13ProMaxFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxFourOne.setOnClickListener {
      val destIntent = Iphone13ProMaxFourOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboarding.setOnClickListener {
      val destIntent = OnboardingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTwelve.setOnClickListener {
      val destIntent = Iphone13ProMaxTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTenOne.setOnClickListener {
      val destIntent = Iphone13ProMaxTenOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxOne.setOnClickListener {
      val destIntent = Iphone13ProMaxOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFrameFortyTwo.setOnClickListener {
      val destIntent = FrameFortytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingSeven.setOnClickListener {
      val destIntent = OnboardingSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIngredientQuantity.setOnClickListener {
      val destIntent = IngredientQuantityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingSix.setOnClickListener {
      val destIntent = OnboardingSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPasswordOne.setOnClickListener {
      val destIntent = ForgotPasswordOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAnalytics.setOnClickListener {
      val destIntent = AnalyticsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTen.setOnClickListener {
      val destIntent = Iphone13ProMaxTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTwentyOne.setOnClickListener {
      val destIntent = Iphone13ProMaxTwentyoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxElevenOne.setOnClickListener {
      val destIntent = Iphone13ProMaxElevenOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddNewItemFinishedGoods.setOnClickListener {
      val destIntent = AddNewItemFinishedGoodsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxFive.setOnClickListener {
      val destIntent = Iphone13ProMaxFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddANewCategory.setOnClickListener {
      val destIntent = AddANewCategoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPopUpSuccessful.setOnClickListener {
      val destIntent = PopUpSuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingFive.setOnClickListener {
      val destIntent = OnboardingFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTwentyThree.setOnClickListener {
      val destIntent = Iphone13ProMaxTwentythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingEight.setOnClickListener {
      val destIntent = OnboardingEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTwo.setOnClickListener {
      val destIntent = Iphone13ProMaxTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddNewItemFinishedGoodsOne.setOnClickListener {
      val destIntent = AddNewItemFinishedGoodsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPasswordThree.setOnClickListener {
      val destIntent = ForgotPasswordThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxSeventeen.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEmptyState.setOnClickListener {
      val destIntent = EmptyStateActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxEleven.setOnClickListener {
      val destIntent = Iphone13ProMaxElevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxThree.setOnClickListener {
      val destIntent = Iphone13ProMaxThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxSeven.setOnClickListener {
      val destIntent = Iphone13ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingOne.setOnClickListener {
      val destIntent = OnboardingOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFrameFortyThree.setOnClickListener {
      val destIntent = FrameFortythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingThree.setOnClickListener {
      val destIntent = OnboardingThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPopUpOne.setOnClickListener {
      val destIntent = PopUpOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxSixOne.setOnClickListener {
      val destIntent = Iphone13ProMaxSixOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxNineOne.setOnClickListener {
      val destIntent = Iphone13ProMaxNineOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPasswordTwo.setOnClickListener {
      val destIntent = ForgotPasswordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone13ProMaxTwelveOne.setOnClickListener {
      val destIntent = Iphone13ProMaxTwelveOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
