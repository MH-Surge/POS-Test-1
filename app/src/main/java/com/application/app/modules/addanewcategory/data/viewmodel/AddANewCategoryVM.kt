package com.application.app.modules.addanewcategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.addanewcategory.`data`.model.AddANewCategoryModel
import com.application.app.modules.addanewcategory.`data`.model.GridrectanglefifteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AddANewCategoryVM : ViewModel(), KoinComponent {
  val addANewCategoryModel: MutableLiveData<AddANewCategoryModel> =
      MutableLiveData(AddANewCategoryModel())

  var navArguments: Bundle? = null

  val gridrectanglefifteenList: MutableLiveData<MutableList<GridrectanglefifteenRowModel>> =
      MutableLiveData(mutableListOf())
}
