package com.asteway.curriculumvitaeapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout

class Contact : AppCompatActivity() {
    lateinit var headerLayOut: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact)

        supportActionBar?.setTitle("CV");
        headerLayOut = findViewById(R.id.HeaderTabLayout) as TabLayout;
        val tab: TabLayout.Tab? = headerLayOut.getTabAt(3)
        if (tab != null) {
            tab.select()
        }
        headerLayOut.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when(tab.position){
                    0 -> {
                        openHome();
                    }
                    1 -> {
                        openAboutMe();
                    }
                    2 -> {
                        openWork();
                    }
                    3 -> {
                        openContact();
                    }
                }


            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    fun callNumber(view: View){
        val uri = Uri.parse((("tel:6159382365")))
        val callIntent = Intent(Intent.ACTION_DIAL, uri)

        try {
            startActivity(callIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    fun openGmail(view: View) {
        val uri = Uri.parse(("https://mail.google.com/mail/u/0/#inbox?compose=VpCqJRzBTxPfZPQtJKtFFKgXKwqMHrwwTGMpNsQSVxJsnCpBMccBGxBcbWVxrmVPXNdbtRg"))
        val linkedInIntent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(linkedInIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    fun openLinkedin(view: View) {
        val uri = Uri.parse(("https://www.linkedin.com/in/asteway-yiheyis"))
        val linkedInIntent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(linkedInIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    fun openGithub(view: View) {
        val uri = Uri.parse(("https://github.com/AstewayYiheyis"))
        val linkedInIntent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(linkedInIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    fun openPdf(view: View) {
        val uri = Uri.parse(("https://github.com/AstewayYiheyis/CS473-DE-MDP/blob/master/CurriculumVitaeApp/app/src/main/res/pdf/Asteway.Yiheyis-Resume.pdf"))
        val linkedInIntent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(linkedInIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    fun openTelegram(item: MenuItem){
        val uri = Uri.parse(("http://www.telegram.org"))
        val telegramIntent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(telegramIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    fun openLinkedin(item: MenuItem){
        val uri = Uri.parse(("https://www.linkedin.com/in/asteway-yiheyis"))
        val linkedInIntent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(linkedInIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    fun openWhatsapp(item: MenuItem){
        val uri = Uri.parse(("https://web.whatsapp.com/"))
        val linkedInIntent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(linkedInIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    fun openGmail(item: MenuItem){
        val uri = Uri.parse(("https://mail.google.com/mail/u/0/#inbox?compose=VpCqJRzBTxPfZPQtJKtFFKgXKwqMHrwwTGMpNsQSVxJsnCpBMccBGxBcbWVxrmVPXNdbtRg"))
        val linkedInIntent = Intent(Intent.ACTION_VIEW, uri)

        try {
            startActivity(linkedInIntent)
        } catch (e: ActivityNotFoundException) {
            Log.e(this.localClassName, "No Activity can handle the intent!")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)
        return true
    }

    fun openHome(){
        val intent = Intent(applicationContext, Home::class.java);
        startActivity(intent)
    }

    private fun openAboutMe() {
        val intent = Intent(applicationContext, AboutMe::class.java);
        startActivity(intent)
    }

    private fun openWork() {
        val intent = Intent(applicationContext, Work::class.java);
        startActivity(intent)
    }

    private fun openContact() {
        val intent = Intent(applicationContext, Contact::class.java);
        startActivity(intent)
    }
}