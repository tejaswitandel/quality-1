package com.tejaswisapplication.app.modules.captcha.`data`.model

import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CaptchaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectallimag: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_all_imag)

)
