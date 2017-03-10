package nebula.define;

import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.String;

@MaxLength(256)
@SingleLine
public interface URL/*|zh:网址*/ extends String {
};