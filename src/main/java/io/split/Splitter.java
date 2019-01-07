package io.split;

import common.model.Expression;
import common.util.DataFormat;

import java.util.List;

public interface Splitter {

    String format();

    List<String> extract(Expression expression, DataFormat[] formats);
}