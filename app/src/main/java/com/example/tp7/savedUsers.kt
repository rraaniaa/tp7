package com.example.tp7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class savedUsers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_users)
        var name = intent.getStringExtra("name")
        var username = intent.getStringExtra("username")
        var email = intent.getStringExtra("email")

        val tv_name: TextView = findViewById(R.id.name)
        val tv_username: TextView = findViewById(R.id.username)
        val tv_email: TextView = findViewById(R.id.email)

        tv_name.text = name
        tv_username.text = username
        tv_email.text = email

        class savedUsers : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_saved_users)

                // Récupérez les données des utilisateurs sauvegardés à partir des préférences partagées
                val name = intent.getStringExtra("name")
                val username = intent.getStringExtra("username")
                val email = intent.getStringExtra("email")

                // Trouvez les TextViews dans votre mise en page (layout)
                val tv_name: TextView = findViewById(R.id.name)
                val tv_username: TextView = findViewById(R.id.username)
                val tv_email: TextView = findViewById(R.id.email)

                // Affichez les données des utilisateurs sauvegardés dans les TextViews
                tv_name.text = "Name: $name"
                tv_username.text = "Username: $username"
                tv_email.text = "Email: $email"
            }
        }

    }
}