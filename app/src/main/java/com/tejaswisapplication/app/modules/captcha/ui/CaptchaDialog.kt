package com.tejaswisapplication.app.modules.captcha.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.base.BaseDialogFragment
import com.tejaswisapplication.app.databinding.DialogCaptchaBinding
import com.tejaswisapplication.app.modules.captcha.`data`.viewmodel.CaptchaVM
import kotlin.String
import kotlin.Unit

class CaptchaDialog : BaseDialogFragment<DialogCaptchaBinding>(R.layout.dialog_captcha) {
  private val viewModel: CaptchaVM by viewModels<CaptchaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.captchaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CAPTCHA_DIALOG"


    fun getInstance(bundle: Bundle?): CaptchaDialog {
      val fragment = CaptchaDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
