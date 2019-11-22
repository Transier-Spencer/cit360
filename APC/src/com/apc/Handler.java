package com.apc;

import java.util.HashMap;

public interface Handler {
    // This is the initial handler interface for the other handlers to be based on
    public Object handleIt(HashMap<String, Object> recipeData);
}
