package com.dhairya.uiux

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        var mail_sent=findViewById<VideoView>(R.id.vid_mail_sent)
        val uri:Uri = parse("android.resource://"+packageName+"/"+R.raw.mail_sent)
        mail_sent.setVideoURI(uri)
        mail_sent.requestFocus()
        mail_sent.start()
    }
}