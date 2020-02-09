package com.aravindh.customdialog

import android.app.AlertDialog
import android.content.Context


/**
 *Created by Aravindh S on 09-02-2020.
 */

class CustomDialog {
    fun alertDialogPopup(
        context: Context,
        title: String,
        message: String,
        positiveText: String,
        negativeText: String,
        icon: Int,
        customClickListener: CustomClickListener?
    ) {
        val dialogBuilder = AlertDialog.Builder(context)

        dialogBuilder.setIcon(icon)
        dialogBuilder.setMessage(message)
            .setCancelable(false)
            .setPositiveButton(positiveText) { dialog, id ->
                customClickListener?.onClick(id.toString())
            }
            .setNegativeButton(negativeText) { dialog, _ ->
                dialog.cancel()
            }

        val alert = dialogBuilder.create()
        alert.setTitle(title)
        alert.show()
    }

}