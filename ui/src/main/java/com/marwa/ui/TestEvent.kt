package com.marwa.ui

sealed class TestEvent {
    data object showData : TestEvent()
}