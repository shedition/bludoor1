package com.example.bludoor


import android.bluetooth.BluetoothA2dp
import android.bluetooth.BluetoothAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var ba: BluetoothAdapter? = null
    private var btDeviceArrayAdapter: ArrayAdapter<String>?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mtoolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(mtoolbar)
        supportActionBar?.title="Bludoor"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item?.itemId
        when(id){
            R.id.pair ->
                Toast.makeText(this, item.title.toString(), Toast.LENGTH_LONG).show()


            R.id.changepwd ->
                Toast.makeText(this,item.title.toString(), Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }

    fun openBtnClicked(view: View){
        Toast.makeText(this,"Open | Close Button Clicked", Toast.LENGTH_LONG).show()
    }
}
