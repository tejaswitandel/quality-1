package com.tejaswisapplication.app.modules.cameraaccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.base.BaseActivity
import com.tejaswisapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.tejaswisapplication.app.databinding.ActivityCameraAccessBinding
import com.tejaswisapplication.app.modules.cameraaccess.`data`.viewmodel.CameraAccessVM
import kotlin.String
import kotlin.Unit

class CameraAccessActivity :
    BaseActivity<ActivityCameraAccessBinding>(R.layout.activity_camera_access) {
  private val viewModel: CameraAccessVM by viewModels<CameraAccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cameraAccessVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
  }

  companion object {
    const val TAG: String = "CAMERA_ACCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CameraAccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
