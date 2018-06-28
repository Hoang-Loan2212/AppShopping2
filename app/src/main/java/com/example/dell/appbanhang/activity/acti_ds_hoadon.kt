package com.example.dell.appbanhang.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.volley.toolbox.Volley
import com.example.dell.appbanhang.R
import com.example.dell.appbanhang.util.Server
import android.app.Activity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import org.json.JSONArray

class acti_ds_hoadon: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lichsu_hoadon)
    }

    fun getDSHoaDon()
    {
        val requestQueue = Volley.newRequestQueue(applicationContext)
        val jsonArrayRequest =  { val list = ArrayList<String>()

        }
    }
}