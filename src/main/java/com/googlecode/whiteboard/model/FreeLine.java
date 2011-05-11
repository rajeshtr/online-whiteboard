/*
* @author  Oleg Varaksin (ovaraksin@googlemail.com)
* $$Id$$
*/

package com.googlecode.whiteboard.model;

import com.googlecode.whiteboard.model.enums.ElementType;

import java.io.Serializable;

public class FreeLine extends Line implements Serializable
{
    public FreeLine(String uuid) {
        super(uuid, ElementType.FreeLine.getType());
    }
}