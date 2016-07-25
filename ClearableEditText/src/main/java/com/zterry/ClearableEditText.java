package com.zterry;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.zterry.clearableedittext.R;


/**
 * <p>
 * 带删除按钮的输入框
 * </p>
 * <p/>
 * <p>Attention: 如果你想给你的EditText注册焦点变化的监听，你可以通过{@link #setOnFocusChangeListener(OnFocusChangeListener)} ,
 * 如果你再外部直接对EditText注册将会导致这个控件内部的删除按钮失效.</p>
 *
 * @author Terry
 */
public class ClearableEditText extends LinearLayout implements View.OnClickListener {


    private EditText mEditText;

    private OnFocusChangeListener onFocusChangeListener;

    private static final int ID_CLEAR_IMAGE_BUTTON = 0x0012;

    public ClearableEditText(Context context) {
        super(context);
    }


    public ClearableEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public ClearableEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildAt(0) instanceof EditText) {
            initializeEditText();
            addDelImageButton();
        } else {
            throw new InflateException("EditText cannot be found at first position in this ViewGroup");
        }
    }

    private void addDelImageButton() {
        final ImageButton mClearableImageButton = new ImageButton(getContext());
        mClearableImageButton.setId(ID_CLEAR_IMAGE_BUTTON);
        LayoutParams lp = new LayoutParams(72, ViewGroup.LayoutParams.MATCH_PARENT);
        mClearableImageButton.setLayoutParams(lp);
        mClearableImageButton.setBackgroundResource(R.drawable.clear_edit_text_selector_holo_dark);
        mClearableImageButton.setImageResource(R.drawable.ic_input_clear);
        mClearableImageButton.setOnClickListener(this);
        mClearableImageButton.setVisibility(View.GONE);
        addView(mClearableImageButton, 1);
    }


    @Override
    public OnFocusChangeListener getOnFocusChangeListener() {
        return onFocusChangeListener;
    }

    /**
     * Register a callback to be invoked when focus of this EditText changed in this ViewGroup.
     *
     * @param onFocusChangeListener
     */
    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.onFocusChangeListener = onFocusChangeListener;
    }

    private void initializeEditText() {
        mEditText = (EditText) getChildAt(0);
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        lp.weight = 1;
        mEditText.setLayoutParams(lp);
        mEditText.setOnFocusChangeListener(mOnFocusChangeListener);
        mEditText.addTextChangedListener(mTextChangeListener);
    }

    private final OnFocusChangeListener mOnFocusChangeListener = new OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            setClearButtonVisibility(hasFocus);
            if (onFocusChangeListener != null)
                onFocusChangeListener.onFocusChange(v, hasFocus);
        }
    };

    /**
     * Text watcher for Text field
     */
    private final TextWatcher mTextChangeListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            if (s != null && mEditText.hasFocus()) {
                setClearButtonVisibility(s.length() > 0);
            }
        }
    };


    private void setClearButtonVisibility(boolean showOrHide) {
        this.findViewById(ID_CLEAR_IMAGE_BUTTON).setVisibility(showOrHide ? View.VISIBLE : View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == ID_CLEAR_IMAGE_BUTTON) {
            if (mEditText != null)
                mEditText.setText("");
        }
    }
}
