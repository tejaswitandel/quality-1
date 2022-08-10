package com.tejaswisapplication.app.modules.appnavigation.`data`.model

import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCaptcha: String? = MyApp.getInstance().resources.getString(R.string.lbl_captcha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCameraAccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_camera_access)

)
