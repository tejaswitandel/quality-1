package com.tejaswisapplication.app.modules.appupdates.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.base.BaseActivity
import com.tejaswisapplication.app.databinding.ActivityAppUpdatesBinding
import com.tejaswisapplication.app.modules.appupdates.`data`.viewmodel.AppUpdatesVM
import kotlin.String
import kotlin.Unit

class AppUpdatesActivity : BaseActivity<ActivityAppUpdatesBinding>(R.layout.activity_app_updates) {
  private val viewModel: AppUpdatesVM by viewModels<AppUpdatesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appUpdatesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "APP_UPDATES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AppUpdatesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
