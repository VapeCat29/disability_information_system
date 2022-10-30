package com.kominfo.disabilityinformationsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.kominfo.disabilityinformationsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            supportActionBar?.hide();
        }

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        navController = findNavController(R.id.NavHostFragment)
        setupSmoothBottomMenu()

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if(destination.id == R.id.berandaFragment) {
                binding.bottomBar.visibility = View.VISIBLE
            } else if (destination.id == R.id.newsFragment) {
                binding.bottomBar.visibility = View.VISIBLE
            } else if (destination.id == R.id.twitterFragment){
                binding.bottomBar.visibility = View.VISIBLE
            }else{
                binding.bottomBar.visibility = View.GONE
            }
        }

    }

    private fun setupSmoothBottomMenu() {
        val popupMenu = PopupMenu(this, null)
        popupMenu.inflate(R.menu.menu_bottom)
        val menu = popupMenu.menu
        binding.bottomBar.setupWithNavController(menu, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}