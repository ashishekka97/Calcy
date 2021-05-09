package me.ashishekka.calcy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    private val navController: NavController by lazy { findNavController(R.id.nav_host_fragment) }
    private val appBarConfiguration: AppBarConfiguration by lazy { setUpAppBar() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setUpAppBar(): AppBarConfiguration =
        AppBarConfiguration.Builder(R.id.fragment_calculator).build().also {
            setupActionBarWithNavController(navController, appBarConfiguration)
        }

    override fun onNavigateUp() = navController.navigateUp(appBarConfiguration)
}