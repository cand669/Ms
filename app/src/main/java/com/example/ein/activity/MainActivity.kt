package com.example.ein.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.ein.R
import com.example.ein.UserEntity
import com.example.ein.UserViewModel
import com.example.ein.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var vm: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView(binding)
        initListen(binding)
        initMain()
    }

    private fun initListen(binding: ActivityMainBinding) {
        binding.tc.setOnClickListener(this)
        binding.te.setOnClickListener(this)
        binding.next.setOnClickListener(this)
        binding.show.setOnClickListener(this)

    }

    private fun initMain() {
        vm = ViewModelProvider(this).get(UserViewModel::class.java)
        var ax = mutableListOf<UserEntity>()
//        ax.add(UserEntity(yw = "a"))
        val a = 'a'
        val z = 'z'
        for (char in a..z) {
            ax.add(UserEntity(yw = char.toString()))
        }
        ax.add(UserEntity(yw = "xxx", idx = 1))
        ax.add(UserEntity(yw = "yyy", idx = 0))
        ax.add(UserEntity(yw = "zzz", idx = 0))
        vm.addUsers(ax)
        next()
        setYZ(vm.GetYZ())
//        show()

    }

    lateinit var yw: TextView
    lateinit var idx: TextView
    lateinit var yyy: TextView
    lateinit var zzz: TextView
    lateinit var xxx: TextView
    lateinit var aidx: TextView
    private fun initView(binding: ActivityMainBinding) {
        yw = binding.yw
        idx = binding.idx
        yyy = binding.yyy
        zzz = binding.zzz
        xxx = binding.xxx
        aidx = binding.aidx

    }

    fun tc() {

    }

    fun te() {
        ce?.let {
            vm.P(it.yw)
            ce = null
            next()
        }
    }
    var ce:UserEntity? = null
    fun mp(data: UserEntity) {
        ce  =data
        yw.text = data.yw
        idx.text = "<${data.idx}>"
    }
    fun setYZ(v:List<Int>){
        yyy.text = "<${v[0]}>"
        zzz.text = "<${v[1]}>"
    }
    val e = 3

    fun next() {
        ce?.let {
            vm.M(it.yw)
        }
        vm.GetOne(xxx)?.let {
            mp(it)
        } ?: run {
            val yz = vm.Clear(e)
            setYZ(yz)
            vm.GetOne(xxx)?.let {
                mp(it)
            }
        }
        aidx.text = "<${vm.GetIDX()}>"
    }

    fun show() {
        vm.getAll()?.let {
            it.forEach {
            Log.i("show", "${it.id}-${it.yw}-${it.idx}")
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tc -> tc()
            R.id.te -> te()
            R.id.next -> next()
            R.id.show -> show()
        }
    }

}
