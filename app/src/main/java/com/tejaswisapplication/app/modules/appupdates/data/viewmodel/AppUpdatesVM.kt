package com.tejaswisapplication.app.modules.appupdates.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tejaswisapplication.app.modules.appupdates.`data`.model.AppUpdatesModel
import org.koin.core.KoinComponent

class AppUpdatesVM : ViewModel(), KoinComponent {
  val appUpdatesModel: MutableLiveData<AppUpdatesModel> = MutableLiveData(AppUpdatesModel())

  var navArguments: Bundle? = null
}
