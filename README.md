# ClearableEditText
A clearable EditText which can be easy to clear your input.


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