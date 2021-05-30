# CustomButton
Custom Button with several attributes to achieve desired design.

Minimum api level 23 is required for this custom button to work properly.

<com.montymobile.customizablebutton.customviews.CustomizableGenericButton
        android:layout_width="wrap_content"
        android:clickable="true"
        android:id="@+id/customButtonOne"
        app:buttonDrawableLeft="@drawable/image"
        app:titleText="@string/text_button_title"
        android:layout_marginTop="30dp"
        app:subTitleText="@string/text_button_sub_title"
        android:theme="@style/CustomButtonThemeWithoutBoder"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@id/textViewTitle"
        android:layout_height="wrap_content"/>
        
 Above mentioned is full design of custom button.
 
 <style name="CustomButtonThemeWithBoder" parent="android:Theme">
        <item name="customButtonBackgroundStyle">@drawable/button_background_rounded_corner</item>
        <item name="customButtonTitleTextColor">@color/purple_700</item>
        <item name="customButtonSubTitleTextColor">@color/nepal_color</item>
        <item name="customButtonTitleTextStyle">normal</item>
        <item name="customButtonSubTitleTextStyle">normal</item>
        <item name="customButtonTitleTextSize">12</item>
        <item name="customButtonSubTitleTextSize">12</item>
        <item name="buttonDrawableLeftWidth">60dp</item>
        <item name="buttonDrawableLeftHeight">60dp</item>
        <item name="android:foreground">@drawable/ripple_animation</item>
        <item name="android:paddingLeft">10dp</item>
        <item name="android:paddingRight">10dp</item>
        <item name="android:paddingTop">4dp</item>
        <item name="android:paddingBottom">4dp</item>
 </style>
 
 These are styles attributes for changing button design.
 Just use them and set values for string keys so to show text.
 
 <?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/nepal_color"/>
    
This is foreground animation used to show click/touch effect on button.
