/*
* @author  Oleg Varaksin (ovaraksin@googlemail.com)
* $$Id$$
*/

package com.googlecode.whiteboard.utils;

import com.google.gson.Gson;
import com.googlecode.whiteboard.json.JsonConverter;
import com.googlecode.whiteboard.model.Whiteboard;

public class WhiteboardUtils
{
    public static synchronized Whiteboard updateFromJson(Whiteboard whiteboard, String jsonString) {
        // TODO
        // if new element ==> create it first and add to the whiteboard
        // call updateFromJson(String jsonString) on the element

        return null;
    }

    public static String convertToJson(Whiteboard whiteboard) {
        Gson gson = JsonConverter.getInstance().getGson();
        return gson.toJson(whiteboard);
    }
}