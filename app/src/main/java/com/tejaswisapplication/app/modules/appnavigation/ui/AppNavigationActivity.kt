package com.tejaswisapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.base.BaseActivity
import com.tejaswisapplication.app.databinding.ActivityAppNavigationBinding
import com.tejaswisapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.tejaswisapplication.app.modules.cameraaccess.ui.CameraAccessActivity
import com.tejaswisapplication.app.modules.captcha.ui.CaptchaDialog
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
    binding.linearCameraAccess.setOnClickListener {
      val destIntent = CameraAccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCaptcha.setOnClickListener {
      val destFragment = CaptchaDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, CaptchaDialog.TAG)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
