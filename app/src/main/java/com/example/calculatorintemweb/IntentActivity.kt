package com.example.calculatorintemweb

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


class IntentActivity : AppCompatActivity() {
    var Buttonsms: Button? = null
    var Buttonemail : Button? = null
    var Buttoncamera: Button? = null
    var Buttoncall: Button? = null
    var Buttonstk: Button? = null
    var Buttondial: Button? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Buttonsms = findViewById(R.id.Btn_Sms)
        Buttoncall = findViewById(R.id.Btn_Call)
        Buttoncamera = findViewById(R.id.Btn_camera)
        Buttonstk = findViewById(R.id.Btn_Stk)
        Buttonemail = findViewById(R.id.Btn_Email)
        Buttondial =findViewById(R.id.Btn_Dial)

        Buttonsms!!.setOnClickListener {
            val uri = Uri.parse("smsto:YOUR_SMS_NUMBER")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", "The SMS text")

            startActivity(intent)

        }
        Buttonemail!!.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }

        Buttonstk!!.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        Buttondial!!.setOnClickListener {
            val phone = "0718930272"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }
        Buttoncamera!!.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)
        }
        Buttoncall!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }

        }


        }
    }
