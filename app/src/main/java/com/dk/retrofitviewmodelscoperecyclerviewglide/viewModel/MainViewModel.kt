package com.dk.retrofitviewmodelscoperecyclerviewglide.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dk.retrofitviewmodelscoperecyclerviewglide.api.MyApi
import com.dk.retrofitviewmodelscoperecyclerviewglide.api.RetrofitInstance
import com.dk.retrofitviewmodelscoperecyclerviewglide.model.Plant
import com.dk.retrofitviewmodelscoperecyclerviewglide.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

//    Repository 생성 전 코드
//    val retrofitInstance = RetrofitInstance.getInstance().create(MyApi::class.java)

    private val repo = Repository()

    private val _result = MutableLiveData<List<Plant>>()
    val result : LiveData<List<Plant>>
        get() = _result

    fun getAllData() = viewModelScope.launch {
        Log.d("MVM", repo.getAllData().toString())
        _result.value = repo.getAllData()
    }
}