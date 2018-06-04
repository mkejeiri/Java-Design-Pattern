package com.kejeiri.java.course.Interfaces;

import com.kejeiri.java.course.model.Jacket;
import com.kejeiri.java.course.model.Shirt;
import com.kejeiri.java.course.model.TShirt;

public interface Visitor {
    double visit(Shirt shirt);
    double visit(TShirt tShirt);
    double visit(Jacket jacket);
}
