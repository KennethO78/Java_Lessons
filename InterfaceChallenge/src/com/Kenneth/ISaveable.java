package com.Kenneth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kenneth on 6/1/2016.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
