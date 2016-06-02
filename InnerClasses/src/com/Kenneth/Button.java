package com.Kenneth;

/**
 * Created by Kenneth on 6/1/2016.
 */
public class Button {
    private String title;
    private OnClickListener OnClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.OnClickListener = onClickListener;
    }

    public void onClick() {
        this.OnClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }
}
