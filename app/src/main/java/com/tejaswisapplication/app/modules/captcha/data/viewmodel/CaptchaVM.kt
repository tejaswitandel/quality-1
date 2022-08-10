package com.tejaswisapplication.app.modules.captcha.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tejaswisapplication.app.modules.captcha.`data`.model.CaptchaModel
import org.koin.core.KoinComponent

class CaptchaVM : ViewModel(), KoinComponent {
  val captchaModel: MutableLiveData<CaptchaModel> = MutableLiveData(CaptchaModel())

  var navArguments: Bundle? = null
}
