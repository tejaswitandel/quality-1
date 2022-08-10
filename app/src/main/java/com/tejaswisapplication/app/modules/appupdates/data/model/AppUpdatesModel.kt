package com.tejaswisapplication.app.modules.appupdates.`data`.model

import com.tejaswisapplication.app.R
import com.tejaswisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppUpdatesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppUpdates: String? = MyApp.getInstance().resources.getString(R.string.lbl_app_updates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppStore: String? = MyApp.getInstance().resources.getString(R.string.lbl_app_store)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesize: String? = MyApp.getInstance().resources.getString(R.string.msg_27_files_upload)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStorageDateRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_storage_date_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesizeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_250_mb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesManagemen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_files_managemen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesizeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_230_mb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogleDirector: String? =
      MyApp.getInstance().resources.getString(R.string.msg_google_director)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesizeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_230_mb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDocumentFiles: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_document_files)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesizeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_230_mb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesManagemenOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_files_managemen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesizeFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_150_mb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfiguration: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_configuration)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesizeSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_mb)

)
