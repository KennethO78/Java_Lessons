package com.Kenneth;

/**
 * Created by Kenneth on 5/31/2016.
 */
public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
