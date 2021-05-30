package com.montymobile.customizablebutton.customviews

import android.content.Context
import android.content.res.TypedArray
import android.text.TextUtils
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout
import com.montymobile.customizablebutton.R
import com.montymobile.customizablebutton.databinding.LayoutCustomButtonBinding


class CustomizableGenericButton(var mContext: Context, var attrs: AttributeSet) :
    ConstraintLayout(mContext, attrs) {

    private lateinit var attributes: TypedArray
    private lateinit var layoutCustomButtonBinding: LayoutCustomButtonBinding

    init {
        inflateAndAttachToRootLayout()
        getStyledAttributes()
        setupTitleTextView()
        setupSubTitleTextView()
        setupImageView()
        setupCustomButton()
        attributes.recycle()
    }

    /*INFLATE CUSTOME LAYOUT AND ATTACH TO PARENT CLASS CONSTRAINT LAYOUT*/
    private fun inflateAndAttachToRootLayout() {
        layoutCustomButtonBinding =
            LayoutCustomButtonBinding.inflate(LayoutInflater.from(mContext), this, true)
    }

    /*GET ARRAY OF CUSTOME STYLED ATTRIBUTES*/
    private fun getStyledAttributes() {
        attributes = mContext.obtainStyledAttributes(attrs, R.styleable.CustomizableGenericButton)
    }

    /*SETUP TITLE TEXT VIEW*/
    private fun setupTitleTextView() {
        if (!TextUtils.isEmpty(attributes.getText(R.styleable.CustomizableGenericButton_titleText))) {

                layoutCustomButtonBinding.buttonTitle.setText(attributes.getText(R.styleable.CustomizableGenericButton_titleText))

                layoutCustomButtonBinding.buttonTitle.setTextSize(
                    TypedValue.COMPLEX_UNIT_SP,
                    attributes.getFloat(
                        R.styleable.CustomizableGenericButton_customButtonTitleTextSize,
                        0f
                    )
                )

                layoutCustomButtonBinding.buttonTitle.setTypeface(
                    null,
                    attributes.getInteger(
                        R.styleable.CustomizableGenericButton_customButtonTitleTextStyle,
                        1
                    )
                )

                layoutCustomButtonBinding.buttonTitle.setTextColor(
                    attributes.getInteger(
                        R.styleable.CustomizableGenericButton_customButtonTitleTextColor,
                        1
                    )
                )
        } else {
            layoutCustomButtonBinding.buttonTitle.visibility = View.GONE
        }
    }

    /*SETUP SUB TITLE TEXT VIEW*/
    private fun setupSubTitleTextView() {
        if (!TextUtils.isEmpty(attributes.getText(R.styleable.CustomizableGenericButton_subTitleText))) {
                layoutCustomButtonBinding.buttonSubTitle.setText(attributes.getText(R.styleable.CustomizableGenericButton_subTitleText))

                layoutCustomButtonBinding.buttonSubTitle.setTextSize(
                    TypedValue.COMPLEX_UNIT_SP,
                    attributes.getFloat(
                        R.styleable.CustomizableGenericButton_customButtonSubTitleTextSize,
                        0f
                    )
                )

                layoutCustomButtonBinding.buttonSubTitle.setTypeface(
                    null,
                    attributes.getInteger(
                        R.styleable.CustomizableGenericButton_customButtonSubTitleTextStyle,
                        1
                    )
                )

                layoutCustomButtonBinding.buttonSubTitle.setTextColor(
                    attributes.getInteger(
                        R.styleable.CustomizableGenericButton_customButtonSubTitleTextColor,
                        1
                    )
                )
        } else {
            layoutCustomButtonBinding.buttonSubTitle.visibility = View.GONE
        }
    }

    /*SETUP IMAGE VIEW*/
    private fun setupImageView() {
        if (attributes.getDrawable(R.styleable.CustomizableGenericButton_buttonDrawableLeft) != null) {
            layoutCustomButtonBinding.imageView.setImageDrawable(
                attributes.getDrawable(R.styleable.CustomizableGenericButton_buttonDrawableLeft))

            layoutCustomButtonBinding.imageView.layoutParams.width =
                attributes.getDimensionPixelSize(R.styleable.CustomizableGenericButton_buttonDrawableLeftWidth,0)

            layoutCustomButtonBinding.imageView.layoutParams.height =
                attributes.getDimensionPixelSize(R.styleable.CustomizableGenericButton_buttonDrawableLeftHeight,0)

            layoutCustomButtonBinding.imageView.requestLayout()
        } else {
            layoutCustomButtonBinding.imageView.visibility = View.GONE
            (layoutCustomButtonBinding.llTextLayout.layoutParams as LinearLayoutCompat.LayoutParams).marginStart =
                0
        }
    }

    /*SETUP CUSTOM BUTTON*/
    private fun setupCustomButton() {
        if (attributes.getDrawable(R.styleable.CustomizableGenericButton_customButtonBackgroundStyle) != null) {
            layoutCustomButtonBinding
                .linearLayoutCompact.background=attributes.getDrawable(
                    R.styleable.CustomizableGenericButton_customButtonBackgroundStyle
                )
        }
    }
}
