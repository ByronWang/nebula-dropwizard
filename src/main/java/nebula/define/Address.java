package nebula.define;

import nebula.define.annotation.MaxLength;
import nebula.define.annotation.SingleLine;

@MaxLength(80)
@SingleLine
public interface Address/*|zh:地址*/ extends String {
};