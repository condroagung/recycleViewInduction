package com.rakamin.listcycleview

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rakamin.listcycleview.Model.DataObject

class ListVM (application: Application) : AndroidViewModel(application) {
    private val _cestomObject = MutableLiveData<List<DataObject>>()
    val cestomObject : LiveData<List<DataObject>> get() = _cestomObject

    init {
        val listAll = listOf(DataObject("ReLife","Drama, Comedy, School", "2018", "https://otakotaku.com/asset/img/anime/2016/06/relife.jpg")
            ,DataObject("Sword Art Online S3","Action, Drama", "2018", "https://otakotaku.com/asset/img/anime/2018/07/sword-art-online-alicization-5b4037b2eed1ep.jpg")
            ,DataObject("Fate/Apocrypha","Action, Drama", "2017", "https://otakotaku.com/asset/img/anime/2017/06/fate-apocrypha-594719ee1c5e8p.jpg")
            ,DataObject("Yahari Ore no Seishun Love Comedy wa Machigatteiru","Drama, Comedy, School", "2013", "https://otakotaku.com/asset/img/anime/2015/05/oregairu1-cover.jpg")
            ,DataObject("Sword Art Online S3","Action, Drama", "2018", "https://otakotaku.com/asset/img/anime/2018/07/sword-art-online-alicization-5b4037b2eed1ep.jpg")
            ,DataObject("Fate/Apocrypha","Action, Drama", "2017", "https://otakotaku.com/asset/img/anime/2017/06/fate-apocrypha-594719ee1c5e8p.jpg")
            ,DataObject("Yahari Ore no Seishun Love Comedy wa Machigatteiru","Drama, Comedy, School", "2013", "https://otakotaku.com/asset/img/anime/2015/05/oregairu1-cover.jpg"))
        _cestomObject.value = listAll
    }

    fun addAnimeObjects(name : String, genre : String, year : String, picture : String){
        val newList = _cestomObject.value!!.toMutableList()
        newList.add(DataObject(name,genre,year,picture))
        _cestomObject.value = newList
    }
}