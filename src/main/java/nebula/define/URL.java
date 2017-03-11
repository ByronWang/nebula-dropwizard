package nebula.define;

import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@MaxLength(256)
@SingleLine
public interface URL/*|zh:网址*/ extends String {
};