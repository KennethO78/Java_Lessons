package com.Kenneth;

/**
 * Created by Kenneth on 5/31/2016.
 */
public class MobilePhone implements ITelephone {

        private int myNumber;
        private boolean isRinging;
        private boolean isOn = false;

        public MobilePhone(int myNumber) {
            this.myNumber = myNumber;
        }

        @Override
        public void powerOn() {
            isOn = true;
            System.out.println("Mobile phone power button");
        }

        @Override
        public void dial(int phoneNumber) {
            if (isOn) {
                System.out.println("Now ringing " + phoneNumber + " on mobile phone");
            } else {
                System.out.println("Phone is switched off");
            }
        }

        @Override
        public void answer() {
            if (isRinging) {
                System.out.println("Answering the mobile phone");
                isRinging = false;
            }

        }

        @Override
        public boolean callPhone(int phoneNumber) {
            if (phoneNumber == myNumber) {
                isRinging = true;
                System.out.println("Ring ring");
            } else {
                isRinging = false;
                System.out.println("Mobile phone not on or number different");
            }
            return isRinging;
        }

        @Override
        public boolean isRinging() {
            return isRinging;
        }

    }
