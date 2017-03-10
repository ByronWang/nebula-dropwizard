package nebula.define;

import nebula.define.MaxLength;
import nebula.define.SingleLine;
import nebula.define.String;

@MaxLength(80)
@SingleLine
public interface Address/*|zh:地址*/ extends String {
};