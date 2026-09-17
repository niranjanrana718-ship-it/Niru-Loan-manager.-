package com.niru.loanmanager
import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
class MainActivity : Activity() {
 override fun onCreate(b: Bundle?) { super.onCreate(b)
  val root=LinearLayout(this); root.orientation=LinearLayout.VERTICAL; root.setPadding(32,40,32,24)
  val title=TextView(this); title.text="NIRU LOAN MANAGER"; title.textSize=26f; title.setTextColor(Color.rgb(79,95,231)); title.gravity=Gravity.CENTER
  root.addView(title)
  val sub=TextView(this); sub.text="Secure loan & EMI management prototype"; sub.gravity=Gravity.CENTER; root.addView(sub)
  val info=TextView(this); info.text="\nAdmin Dashboard\n\n• Customers\n• Loans & EMI schedule\n• Payment records\n• Consent & audit trail\n• Live payment gateway integration point"
  info.textSize=17f; root.addView(info)
  val pay=Button(this); pay.text="PAY EMI (DEMO)"; pay.setOnClickListener{ Toast.makeText(this,"Demo only — connect a compliant merchant gateway for live payments.",Toast.LENGTH_LONG).show() }; root.addView(pay)
  val note=TextView(this); note.text="\nImportant: this starter app does not collect real KYC or money. Add secure backend, authentication, consent, and compliant payment/lending infrastructure before production."; root.addView(note)
  setContentView(root)
 }
}