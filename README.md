# ClearableEditText
A clearable EditText which can be easy to clear your input.

Getting started
---------------
Add the ClearableEditText dependency to your build.gradle.
    
    dependencies {
       compile 'com.zterry.clearableedittext:ClearableEditText:1.0.2'
    }

Screen Shot
-----------
![](https://github.com/liuzhanta/ClearableEditText/blob/master/screen_shot.gif)


Usage Xml
---------
You should just put the EditText in the container of ClearableEditText. 
And That's all.
 
    <?xml version="1.0" encoding="utf-8"?>
    <android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/activity_main"
        android:layout_width="match_parent"
        android:padding="16dp"
        android:layout_height="match_parent">

        <com.zterry.ClearableEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <EditText
                android:layout_width="match_parent"
                android:text="@string/hello_world"
                android:layout_height="match_parent" />
        </com.zterry.ClearableEditText>

    </android.support.constraint.ConstraintLayout>

Developed by
------------
Name: ZTerry Liu  
E-mail: tata1989y@gmail.com  
Subject: ClearableEditText  

License
---------

    Copyright 2016 刘战塔
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
      http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.      
