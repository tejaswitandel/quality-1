package com.tejaswisapplication.app.modules.cameraaccess.`data`.model

import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CameraAccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDhiWiseappwan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dhiwise_app_wan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccessyourcam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_access_your_cam)

)
