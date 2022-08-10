package com.tejaswisapplication.app.modules.cameraaccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tejaswisapplication.app.modules.cameraaccess.`data`.model.CameraAccessModel
import org.koin.core.KoinComponent

class CameraAccessVM : ViewModel(), KoinComponent {
  val cameraAccessModel: MutableLiveData<CameraAccessModel> = MutableLiveData(CameraAccessModel())

  var navArguments: Bundle? = null
}
