package com.codingwithmitch.mviexample.ui.main.state

sealed class MainStateEvent {

    class GetBlogPostsEvent : MainStateEvent()

    class GetUserEvent(var userId: String) : MainStateEvent()

    class None : MainStateEvent()
}