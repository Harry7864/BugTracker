package com.example.bugtracker.networkmanager;

interface TaskFinished<T> {
    void onTaskFinished(T data);
}
