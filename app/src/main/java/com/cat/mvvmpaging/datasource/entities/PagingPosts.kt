package com.cat.mvvmpaging.datasource.entities

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.cat.domain.entity.State

data class PagingPosts(
    val data : LiveData<PagedList<Post>>,
    val networkState : LiveData<State>
)

